package cn.oreo5.util;

import cn.oreo5.constant.OreoConstant;
import cn.oreo5.entity.DO.ArticleTopSO;
import cn.oreo5.entity.PO.Distance;
import cn.oreo5.entity.PO.User;
import com.aliyun.api.gateway.demo.util.HttpUtils;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;
import javax.mail.PasswordAuthentication;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class OreoUtil {

	private final static double EARTH_RADIUS = 6378.137;

	private static double rad(double d) {
		return d * Math.PI / 180.0;
	}

	/**
	 * 给远程第三方短信接口发送请求把验证码发送到用户手机上
	 * @param host		短信接口调用的URL地址
	 * @param path		具体发送短信功能的地址
	 * @param method	请求方式
	 * @param phoneNum	接收短信的手机号
	 * @param appCode	用来调用第三方短信API的AppCode
	 * @param sign		签名编号
	 * @param skin		模板编号
	 * @return 返回调用结果是否成功
	 * 	成功：返回验证码
	 * 	失败：返回失败消息
	 * 	状态码: 200 正常；400 URL无效；401 appCode错误； 403 次数用完； 500 API网管错误
	 */
	public static ResultEntity<String> sendCodeByShortMessage(

			String host,

			String path,

			String method,

			String phoneNum,

			String appCode,

			String sign,

			String skin) {

		Map<String, String> headers = new HashMap<String, String>();

		// 最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
		headers.put("Authorization", "APPCODE " + appCode);

		// 封装其他参数
		Map<String, String> querys = new HashMap<String, String>();

		// 生成验证码
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < 4; i++) {
			int random = (int) (Math.random() * 10);
			builder.append(random);
		}

		String code = builder.toString();

		// 要发送的验证码，也就是模板中会变化的部分
		querys.put("param", code);

		// 收短信的手机号
		querys.put("phone", phoneNum);

		// 签名编号
		querys.put("sign", sign);

		// 模板编号
		querys.put("skin", skin);
		// JDK 1.8示例代码请在这里下载： http://code.fegine.com/Tools.zip

		try {
			HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);

			StatusLine statusLine = response.getStatusLine();

			// 状态码: 200 正常；400 URL无效；401 appCode错误； 403 次数用完； 500 API网管错误
			int statusCode = statusLine.getStatusCode();

			String reasonPhrase = statusLine.getReasonPhrase();

			if(statusCode == 200) {

				// 操作成功，把生成的验证码返回
				return ResultEntity.successWithData(code);
			}

			return ResultEntity.failed(reasonPhrase);

		} catch (Exception e) {
			e.printStackTrace();
			return ResultEntity.failed(e.getMessage());
		}

	}

	/**
	 * 对明文字符串进行MD5加密
	 * @param source 传入的明文字符串
	 * @return 加密结果
	 */
	public static String md5(String source) {

		// 1.判断source是否有效
		if(source == null || source.length() == 0) {

			// 2.如果不是有效的字符串抛出异常
			throw new RuntimeException(OreoConstant.MESSAGE_STRING_INVALIDATE);
		}

		try {
			// 3.获取MessageDigest对象
			String algorithm = "md5";

			MessageDigest messageDigest = MessageDigest.getInstance(algorithm);

			// 4.获取明文字符串对应的字节数组
			byte[] input = source.getBytes();

			// 5.执行加密
			byte[] output = messageDigest.digest(input);

			// 6.创建BigInteger对象
			int signum = 1;
			BigInteger bigInteger = new BigInteger(signum, output);

			// 7.按照16进制将bigInteger的值转换为字符串
			int radix = 16;
			String encoded = bigInteger.toString(radix).toUpperCase();

			return encoded;

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static List<cn.oreo5.entity.PO.Map> matchPoit(final double lng,final double lat, List<cn.oreo5.entity.PO.Map> mapList) {
		Collections.sort(mapList, new Comparator<cn.oreo5.entity.PO.Map>() {
			@Override
			public int compare(cn.oreo5.entity.PO.Map o1, cn.oreo5.entity.PO.Map o2) {
				double distance1 = GetDistance(lng, lat, o1.getLongitude(), o1.getLatitude());
				double distance2 = GetDistance(lng, lat, o2.getLongitude(), o2.getLatitude());
				if (distance1 < distance2) {
					return -1;    //正序
				} else if (distance1 == distance2) {
					return 0;
				} else {
					return 1;    //倒序
				}
			}
		});
		return mapList;
	}

	/**
	 * 判断当前请求是否为Ajax请求
	 * @param request 请求对象
	 * @return
	 * 		true：当前请求是Ajax请求
	 * 		false：当前请求不是Ajax请求
	 */
	public static boolean judgeRequestType(HttpServletRequest request) {
		
		// 1.获取请求消息头
		String acceptHeader = request.getHeader("Accept");
		String xRequestHeader = request.getHeader("X-Requested-With");
		
		// 2.判断
		return (acceptHeader != null && acceptHeader.contains("application/json"))
				
				||
				
				(xRequestHeader != null && xRequestHeader.equals("XMLHttpRequest"));
	}

    public static String cutLabel(String str) {

		StringBuffer s = new StringBuffer();
		boolean flag = true;
		for(int i = 0; i < str.length(); i++) {
			char ch;
			ch = str.charAt(i);
			if('<' == ch) {
				flag = false;
			}
			if('>' == ch) {
				flag = true;
			}
			if(flag && ch != '>') {
				s.append(ch);
			}
		}
		return s.toString();
    }

    public static cn.oreo5.entity.PO.Map matchNearestPoit(double lng, double lat, List<cn.oreo5.entity.PO.Map> mapList) {

		double min = Double.MAX_VALUE;

		cn.oreo5.entity.PO.Map s = null;

		for (cn.oreo5.entity.PO.Map map : mapList) {

			double distance = GetDistance(lng, lat, map.getLongitude(), map.getLatitude());

			if (distance < min) {
				min = distance;
				s = map;
			}
		}
		return s;
	}

	public static double GetDistance(double lng1, double lat1, double lng2, double lat2) {
		double radLat1 = rad(lat1);
		double radLat2 = rad(lat2);
		double a = radLat1 - radLat2;
		double b = rad(lng1) - rad(lng2);
		double s = 2 * Math.asin(Math.sqrt(
				Math.pow(Math.sin(a / 2), 2) + Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
		s = s * EARTH_RADIUS;
		s = Math.round(s * 10000d) / 10000d;
		return s;
	}

    public static void quickSort(List<ArticleTopSO> list, int low, int high) {
		int l = low;
		int h = high;
		double baseNum = list.get(low).getRecomIndex();

		while (l < h) {
			//1.从右向左查找小于指定基数的数，找到之后跳出循环执行下面if循环，交换数据
			while (l < h && list.get(h).getRecomIndex() <= baseNum) {
				h--;
			}
			//交换数据
			if (l < h) {
				ArticleTopSO top;
				top = list.get(h);
				list.set(h, list.get(l));
				list.set(l, top);
				l++;
			}

			//2.从左向右查找大于指定基数的数，找到后跳出循环执行下面if循环，交换数据
			while (l < h && list.get(l).getRecomIndex() >= baseNum)
				l++;
			//交换数据
			if (l < h) {
				ArticleTopSO top;
				top = list.get(h);
				list.set(h, list.get(l));
				list.set(l, top);
				h--;
			}
		}
		if (l > low) {
			quickSort(list, low, l - 1);
		}
		if (h < high) {
			quickSort(list, l + 1, high);
		}
    }

    public static String sendEmail(String email) throws MessagingException {
		// 收件人电子邮箱
		// 字符串email为收件人的电子邮箱

		// 发件人电子邮箱
		String from = "1242331222@qq.com";

		// 指定发送邮件的主机为 smtp.qq.com
		String host = "smtp.qq.com";  //QQ 邮件服务器

		// 获取系统属性
		Properties properties = System.getProperties();

		// 设置邮件服务器
		properties.setProperty("mail.smtp.host", host);

		properties.put("mail.smtp.auth", "true");

		// 获取默认session对象
		Session session = Session.getDefaultInstance(properties,new Authenticator(){
			public javax.mail.PasswordAuthentication getPasswordAuthentication()
			{
				return new PasswordAuthentication("1242331222@qq.com", "tyraxakatwdhfhhi"); //发件人邮件用户名、授权码
				//return null;
			}
		});

		StringBuffer str = new StringBuffer();
		try{
			// 创建默认的 MimeMessage 对象
			MimeMessage message = new MimeMessage(session);

			// Set From: 头部头字段
			message.setFrom(new InternetAddress(from));

			// Set To: 头部头字段
			message.addRecipient(Message.RecipientType.TO,
					new InternetAddress(email));

			Random a = new Random();
			int num = 0;
			for (int i = 0; i < 6; i++) {
				num = a.nextInt(10);
				str.append(num);
			}

			// Set Subject: 头部头字段
			message.setSubject("感谢您注册智慧麻涌，请查收您的邮件验证码");
			// 设置消息体
			message.setText("验证码为：" + str.toString() + "");
			// 发送消息
			Transport.send(message);
		}catch (AddressException mex) {
			mex.printStackTrace();
		}

		return str.toString();
    }

	// 欧式距离计算
	public static double oudistance(User user1, User user2) {
		double temp = 0;
		double a = 0;
		double b = 0;

		if ("1".equals(user1.getSex())) {
			a = 1;
		} else {
			a = 2;
		}

		if ("1".equals(user2.getSex())) {
			b = 1;
		} else {
			b = 2;
		}
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		temp = Math.pow((a - b)*10, 2) + Math.pow(user1.getAge() - user2.getAge(), 2);

		return Math.sqrt(temp);
	}

	// 找出最大频率
	public static String maxP(Map<String, Double> map) {
		String key = null;
		double value = 0.0;

		for (Map.Entry<String, Double> entry : map.entrySet()) {
			if (entry.getValue() > value) {
				key = entry.getKey();
				value = entry.getValue();
			}
		}
		return key;
	}

	// 计算频率
	public static Map<String, Double> computeP(Map<String, Integer> map, double k) {
		Map<String, Double> p = new HashMap<String, Double>();

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			p.put(entry.getKey(), entry.getValue() / k);
		}

		return p;
	}

	// 计算每个分类包含的点的个数
	public static Map<String, Integer> getNumberOfType(List<Distance> listDistance, List<User> listUser, double k) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		int i = 0;

		System.out.println("选取的k个点，由近及远依次为：");
		for (Distance distance : listDistance) {
			System.out.println("id为" + distance.getId() + ",距离为：" + distance.getDisatance());
			long id = distance.getId();
			// 通过id找到所属类型,并存储到HashMap中
			for (User user : listUser) {
				if (user.getId() == id) {
					if (map.get(user.getLabel()) != null)
						map.put(user.getLabel(), map.get(user.getLabel()) + 1);
					else {
						map.put(user.getLabel(), 1);
					}
				}
			}
			i++;
			if (i >= k)
				break;
		}
		return map;
	}
}

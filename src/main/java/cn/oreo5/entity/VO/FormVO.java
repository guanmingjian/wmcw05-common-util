package cn.oreo5.entity.VO;

import java.util.Map;

public class FormVO {
    private  Map data;
    private String url;

    public FormVO() {
    }

    public FormVO(Map data, String url) {
        this.data = data;
        this.url = url;
    }

    @Override
    public String toString() {
        return "Form{" +
                "data=" + data +
                ", url='" + url + '\'' +
                '}';
    }

    public Map getData() {
        return data;
    }

    public void setData(Map data) {
        this.data = data;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

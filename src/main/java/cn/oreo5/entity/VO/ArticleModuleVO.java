package cn.oreo5.entity.VO;

public class ArticleModuleVO {

    private int id;
    private String type;
    private String title;
    private String authorName;
    private long firepower;     //热力值
    private String label;       //标签
    private String headImg;     //头像

    public ArticleModuleVO() {
    }

    public ArticleModuleVO(int id, String type, String title, String authorName, long firepower, String label, String headImg) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.authorName = authorName;
        this.firepower = firepower;
        this.label = label;
        this.headImg = headImg;
    }

    @Override
    public String toString() {
        return "ArticleModuleVO{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", firepower=" + firepower +
                ", label='" + label + '\'' +
                ", headImg='" + headImg + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public long getFirepower() {
        return firepower;
    }

    public void setFirepower(long firepower) {
        this.firepower = firepower;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }
}

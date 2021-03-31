package cn.oreo5.entity.PO;

public class Photo {
    private Integer id;

    private Integer clas;

    private String title;

    private String briefIntro;

    private String imgPath;

    public Photo() {
    }

    public Photo(Integer id, Integer clas, String title, String briefIntro, String imgPath) {
        this.id = id;
        this.clas = clas;
        this.title = title;
        this.briefIntro = briefIntro;
        this.imgPath = imgPath;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", clas=" + clas +
                ", title='" + title + '\'' +
                ", briefIntro='" + briefIntro + '\'' +
                ", imgPath='" + imgPath + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClas() {
        return clas;
    }

    public void setClas(Integer clas) {
        this.clas = clas;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getBriefIntro() {
        return briefIntro;
    }

    public void setBriefIntro(String briefIntro) {
        this.briefIntro = briefIntro == null ? null : briefIntro.trim();
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }
}
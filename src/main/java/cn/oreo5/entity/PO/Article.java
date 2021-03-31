package cn.oreo5.entity.PO;

public class Article {
    private Integer id;

    private String title;

    private String authorName;

    private Integer userId;

    private Integer clas;

    private String selfClas;

    private String keyword;

    private Integer comNum;

    private Integer readNum;

    private Integer likeNum;

    private String recomIndex;

    private String publishTime;

    private String changeTime;

    private String imgPath;

    private String headImg;

    private String textContent;

    public Article() {
    }

    public Article(Integer id, String title, String authorName, Integer userId, Integer clas, String selfClas, String keyword, Integer comNum, Integer readNum, Integer likeNum, String recomIndex, String publishTime, String changeTime, String imgPath, String headImg, String textContent) {
        this.id = id;
        this.title = title;
        this.authorName = authorName;
        this.userId = userId;
        this.clas = clas;
        this.selfClas = selfClas;
        this.keyword = keyword;
        this.comNum = comNum;
        this.readNum = readNum;
        this.likeNum = likeNum;
        this.recomIndex = recomIndex;
        this.publishTime = publishTime;
        this.changeTime = changeTime;
        this.imgPath = imgPath;
        this.headImg = headImg;
        this.textContent = textContent;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", userId=" + userId +
                ", clas=" + clas +
                ", selfClas='" + selfClas + '\'' +
                ", keyword='" + keyword + '\'' +
                ", comNum=" + comNum +
                ", readNum=" + readNum +
                ", likeNum=" + likeNum +
                ", recomIndex='" + recomIndex + '\'' +
                ", publishTime='" + publishTime + '\'' +
                ", changeTime='" + changeTime + '\'' +
                ", imgPath='" + imgPath + '\'' +
                ", headImg='" + headImg + '\'' +
                ", textContent='" + textContent + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getClas() {
        return clas;
    }

    public void setClas(Integer clas) {
        this.clas = clas;
    }

    public String getSelfClas() {
        return selfClas;
    }

    public void setSelfClas(String selfClas) {
        this.selfClas = selfClas == null ? null : selfClas.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Integer getComNum() {
        return comNum;
    }

    public void setComNum(Integer comNum) {
        this.comNum = comNum;
    }

    public Integer getReadNum() {
        return readNum;
    }

    public void setReadNum(Integer readNum) {
        this.readNum = readNum;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public String getRecomIndex() {
        return recomIndex;
    }

    public void setRecomIndex(String recomIndex) {
        this.recomIndex = recomIndex == null ? null : recomIndex.trim();
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime == null ? null : publishTime.trim();
    }

    public String getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(String changeTime) {
        this.changeTime = changeTime == null ? null : changeTime.trim();
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg == null ? null : headImg.trim();
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent == null ? null : textContent.trim();
    }
}
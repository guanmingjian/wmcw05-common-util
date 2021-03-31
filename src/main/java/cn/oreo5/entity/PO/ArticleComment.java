package cn.oreo5.entity.PO;

public class ArticleComment {
    private Integer commentId;

    private Integer userId;

    private Integer articleId;

    private String userName;

    private String headImage;

    private String publishTime;

    private String textComment;

    public ArticleComment() {
    }

    @Override
    public String toString() {
        return "ArticleComment{" +
                "commentId=" + commentId +
                ", userId=" + userId +
                ", articleId=" + articleId +
                ", userName='" + userName + '\'' +
                ", headImage='" + headImage + '\'' +
                ", publishTime='" + publishTime + '\'' +
                ", textComment='" + textComment + '\'' +
                '}';
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage == null ? null : headImage.trim();
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime == null ? null : publishTime.trim();
    }

    public String getTextComment() {
        return textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment == null ? null : textComment.trim();
    }
}
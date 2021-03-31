package cn.oreo5.entity.PO;

public class UserRecord {
    private Integer id;

    private Integer userId;

    private Integer articleLikeId;

    private Integer articleReadId;

    private String articleSearch;

    private Integer hotelReadId;

    private String hotelSearch;

    private Integer cateReadId;

    private String cateSearch;

    private Integer mapReadType;

    private Integer mapSelectId;

    private Integer mapTripWay;

    private Integer panoramicMapReadType;

    private Integer photoReadType;

    private Integer photoSelectId;

    private Integer serviceReadType;

    public UserRecord() {
    }

    @Override
    public String toString() {
        return "UserRecord{" +
                "id=" + id +
                ", userId=" + userId +
                ", articleLikeId=" + articleLikeId +
                ", articleReadId=" + articleReadId +
                ", articleSearch='" + articleSearch + '\'' +
                ", hotelReadId=" + hotelReadId +
                ", hotelSearch='" + hotelSearch + '\'' +
                ", cateReadId=" + cateReadId +
                ", cateSearch='" + cateSearch + '\'' +
                ", mapReadType=" + mapReadType +
                ", mapSelectId=" + mapSelectId +
                ", mapTripWay=" + mapTripWay +
                ", panoramicMapReadType=" + panoramicMapReadType +
                ", photoReadType=" + photoReadType +
                ", photoSelectId=" + photoSelectId +
                ", serviceReadType=" + serviceReadType +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getArticleLikeId() {
        return articleLikeId;
    }

    public void setArticleLikeId(Integer articleLikeId) {
        this.articleLikeId = articleLikeId;
    }

    public Integer getArticleReadId() {
        return articleReadId;
    }

    public void setArticleReadId(Integer articleReadId) {
        this.articleReadId = articleReadId;
    }

    public String getArticleSearch() {
        return articleSearch;
    }

    public void setArticleSearch(String articleSearch) {
        this.articleSearch = articleSearch == null ? null : articleSearch.trim();
    }

    public Integer getHotelReadId() {
        return hotelReadId;
    }

    public void setHotelReadId(Integer hotelReadId) {
        this.hotelReadId = hotelReadId;
    }

    public String getHotelSearch() {
        return hotelSearch;
    }

    public void setHotelSearch(String hotelSearch) {
        this.hotelSearch = hotelSearch == null ? null : hotelSearch.trim();
    }

    public Integer getCateReadId() {
        return cateReadId;
    }

    public void setCateReadId(Integer cateReadId) {
        this.cateReadId = cateReadId;
    }

    public String getCateSearch() {
        return cateSearch;
    }

    public void setCateSearch(String cateSearch) {
        this.cateSearch = cateSearch == null ? null : cateSearch.trim();
    }

    public Integer getMapReadType() {
        return mapReadType;
    }

    public void setMapReadType(Integer mapReadType) {
        this.mapReadType = mapReadType;
    }

    public Integer getMapSelectId() {
        return mapSelectId;
    }

    public void setMapSelectId(Integer mapSelectId) {
        this.mapSelectId = mapSelectId;
    }

    public Integer getMapTripWay() {
        return mapTripWay;
    }

    public void setMapTripWay(Integer mapTripWay) {
        this.mapTripWay = mapTripWay;
    }

    public Integer getPanoramicMapReadType() {
        return panoramicMapReadType;
    }

    public void setPanoramicMapReadType(Integer panoramicMapReadType) {
        this.panoramicMapReadType = panoramicMapReadType;
    }

    public Integer getPhotoReadType() {
        return photoReadType;
    }

    public void setPhotoReadType(Integer photoReadType) {
        this.photoReadType = photoReadType;
    }

    public Integer getPhotoSelectId() {
        return photoSelectId;
    }

    public void setPhotoSelectId(Integer photoSelectId) {
        this.photoSelectId = photoSelectId;
    }

    public Integer getServiceReadType() {
        return serviceReadType;
    }

    public void setServiceReadType(Integer serviceReadType) {
        this.serviceReadType = serviceReadType;
    }
}
package cn.oreo5.entity.PO;

public class Hotel {
    private Integer id;

    private String name;

    private Integer price;

    private Integer preferentialPrice;

    private String region;

    private String location;

    private String starLevel;

    private String briefIntro;

    private String type;

    private String imgPath;

    private String longitude;

    private String latitude;

    private String isDepot;

    private String isBreakfast;

    private String isWindow;

    private Double roomSize;

    private String href;

    public Hotel() {
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", preferentialPrice=" + preferentialPrice +
                ", region='" + region + '\'' +
                ", location='" + location + '\'' +
                ", starLevel='" + starLevel + '\'' +
                ", briefIntro='" + briefIntro + '\'' +
                ", type='" + type + '\'' +
                ", imgPath='" + imgPath + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", isDepot='" + isDepot + '\'' +
                ", isBreakfast='" + isBreakfast + '\'' +
                ", isWindow='" + isWindow + '\'' +
                ", roomSize=" + roomSize +
                ", href='" + href + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPreferentialPrice() {
        return preferentialPrice;
    }

    public void setPreferentialPrice(Integer preferentialPrice) {
        this.preferentialPrice = preferentialPrice;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(String starLevel) {
        this.starLevel = starLevel == null ? null : starLevel.trim();
    }

    public String getBriefIntro() {
        return briefIntro;
    }

    public void setBriefIntro(String briefIntro) {
        this.briefIntro = briefIntro == null ? null : briefIntro.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getIsDepot() {
        return isDepot;
    }

    public void setIsDepot(String isDepot) {
        this.isDepot = isDepot == null ? null : isDepot.trim();
    }

    public String getIsBreakfast() {
        return isBreakfast;
    }

    public void setIsBreakfast(String isBreakfast) {
        this.isBreakfast = isBreakfast == null ? null : isBreakfast.trim();
    }

    public String getIsWindow() {
        return isWindow;
    }

    public void setIsWindow(String isWindow) {
        this.isWindow = isWindow == null ? null : isWindow.trim();
    }

    public Double getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(Double roomSize) {
        this.roomSize = roomSize;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href == null ? null : href.trim();
    }
}
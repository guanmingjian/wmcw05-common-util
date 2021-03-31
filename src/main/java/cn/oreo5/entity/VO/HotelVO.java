package cn.oreo5.entity.VO;

public class HotelVO {

    private String pageNum;
    private String pageSize;
    private String keyword;
    private String location;
    private String price;
    private String star;
    private String type;

    public HotelVO() {
    }

    public HotelVO(String pageNum, String pageSize, String keyword, String location, String price, String star, String type) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.keyword = keyword;
        this.location = location;
        this.price = price;
        this.star = star;
        this.type = type;
    }

    @Override
    public String toString() {
        return "HotelVO{" +
                "pageNum='" + pageNum + '\'' +
                ", pageSize='" + pageSize + '\'' +
                ", keyword='" + keyword + '\'' +
                ", location='" + location + '\'' +
                ", price='" + price + '\'' +
                ", star='" + star + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getPageNum() {
        return pageNum;
    }

    public void setPageNum(String pageNum) {
        this.pageNum = pageNum;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

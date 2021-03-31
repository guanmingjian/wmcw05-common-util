package cn.oreo5.entity.VO;

public class CateVO {

    private Integer pageNum;

    private Integer pageSize;

    private String keyword;

    private String address;

    private Integer cateClas;

    private Integer label;

    public CateVO() {
    }

    @Override
    public String toString() {
        return "CateVO{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", keyword='" + keyword + '\'' +
                ", address='" + address + '\'' +
                ", cateClas=" + cateClas +
                ", label=" + label +
                '}';
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCateClas() {
        return cateClas;
    }

    public void setCateClas(Integer cateClas) {
        this.cateClas = cateClas;
    }

    public Integer getLabel() {
        return label;
    }

    public void setLabel(Integer label) {
        this.label = label;
    }
}

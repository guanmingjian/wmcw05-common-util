package cn.oreo5.entity.PO;

public class Cate {
    private Integer id;

    private String title;

    private String img;

    private String address;

    private String shop;

    private String href;

    private Integer cateClas;

    private Integer addressClas;

    private Integer label;

    public Cate() {
    }

    @Override
    public String toString() {
        return "Cate{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", img='" + img + '\'' +
                ", address='" + address + '\'' +
                ", shop='" + shop + '\'' +
                ", href='" + href + '\'' +
                ", cateClas=" + cateClas +
                ", addressClas=" + addressClas +
                ", label=" + label +
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop == null ? null : shop.trim();
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href == null ? null : href.trim();
    }

    public Integer getCateClas() {
        return cateClas;
    }

    public void setCateClas(Integer cateClas) {
        this.cateClas = cateClas;
    }

    public Integer getAddressClas() {
        return addressClas;
    }

    public void setAddressClas(Integer addressClas) {
        this.addressClas = addressClas;
    }

    public Integer getLabel() {
        return label;
    }

    public void setLabel(Integer label) {
        this.label = label;
    }
}
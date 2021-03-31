package cn.oreo5.entity.PO;

public class View {
    private Integer id;

    private Integer indexVisits;

    private Integer hotelVisits;

    private Integer cateVisits;

    private Integer mapVisits;

    private String time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIndexVisits() {
        return indexVisits;
    }

    public void setIndexVisits(Integer indexVisits) {
        this.indexVisits = indexVisits;
    }

    public Integer getHotelVisits() {
        return hotelVisits;
    }

    public void setHotelVisits(Integer hotelVisits) {
        this.hotelVisits = hotelVisits;
    }

    public Integer getCateVisits() {
        return cateVisits;
    }

    public void setCateVisits(Integer cateVisits) {
        this.cateVisits = cateVisits;
    }

    public Integer getMapVisits() {
        return mapVisits;
    }

    public void setMapVisits(Integer mapVisits) {
        this.mapVisits = mapVisits;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }
}
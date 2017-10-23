package com.manager.tour.pojo.po;

public class Hotel {
    private Integer hotelid;

    private String hotelname;

    private String hotelimg;

    private String hotelphone;

    private String hoteladdress;

    private String hoteldetail;

    private String hotelprice;

    private Integer hotelstar;

    private Integer cid;

    private Integer vid;

    private Integer status;

    public Integer getHotelid() {
        return hotelid;
    }

    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname == null ? null : hotelname.trim();
    }

    public String getHotelimg() {
        return hotelimg;
    }

    public void setHotelimg(String hotelimg) {
        this.hotelimg = hotelimg == null ? null : hotelimg.trim();
    }

    public String getHotelphone() {
        return hotelphone;
    }

    public void setHotelphone(String hotelphone) {
        this.hotelphone = hotelphone == null ? null : hotelphone.trim();
    }

    public String getHoteladdress() {
        return hoteladdress;
    }

    public void setHoteladdress(String hoteladdress) {
        this.hoteladdress = hoteladdress == null ? null : hoteladdress.trim();
    }

    public String getHoteldetail() {
        return hoteldetail;
    }

    public void setHoteldetail(String hoteldetail) {
        this.hoteldetail = hoteldetail == null ? null : hoteldetail.trim();
    }

    public String getHotelprice() {
        return hotelprice;
    }

    public void setHotelprice(String hotelprice) {
        this.hotelprice = hotelprice == null ? null : hotelprice.trim();
    }

    public Integer getHotelstar() {
        return hotelstar;
    }

    public void setHotelstar(Integer hotelstar) {
        this.hotelstar = hotelstar;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
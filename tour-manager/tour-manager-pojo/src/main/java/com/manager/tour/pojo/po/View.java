package com.manager.tour.pojo.po;

import java.util.Date;

public class View {
    private Integer viewid;

    private String viewbrief;

    private String viewimg;

    private Date starttime;

    private Date endtime;

    private String price;

    private String station;

    private String attention;

    private String introductaion;

    private Integer cid;

    private Integer status;

    public Integer getViewid() {
        return viewid;
    }

    public void setViewid(Integer viewid) {
        this.viewid = viewid;
    }

    public String getViewbrief() {
        return viewbrief;
    }

    public void setViewbrief(String viewbrief) {
        this.viewbrief = viewbrief == null ? null : viewbrief.trim();
    }

    public String getViewimg() {
        return viewimg;
    }

    public void setViewimg(String viewimg) {
        this.viewimg = viewimg == null ? null : viewimg.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station == null ? null : station.trim();
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention == null ? null : attention.trim();
    }

    public String getIntroductaion() {
        return introductaion;
    }

    public void setIntroductaion(String introductaion) {
        this.introductaion = introductaion == null ? null : introductaion.trim();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
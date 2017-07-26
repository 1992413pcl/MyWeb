package com.bwie.pojo;

import java.util.Date;

public class Myemail {
    private Integer id;

    private String efrom;

    private Integer status;

    private String title;

    private String cotent;

    private Date cteattime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEfrom() {
        return efrom;
    }

    public void setEfrom(String efrom) {
        this.efrom = efrom == null ? null : efrom.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCotent() {
        return cotent;
    }

    public void setCotent(String cotent) {
        this.cotent = cotent == null ? null : cotent.trim();
    }

    public Date getCteattime() {
        return cteattime;
    }

    public void setCteattime(Date cteattime) {
        this.cteattime = cteattime;
    }
}
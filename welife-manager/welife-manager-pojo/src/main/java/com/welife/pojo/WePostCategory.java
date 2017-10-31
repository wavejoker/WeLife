package com.welife.pojo;

import java.util.Date;

public class WePostCategory {
    private Long id;

    private Long parentId;

    private String name;

    private Integer status;

    private Integer isparent;

    private Integer sort;

    private Date creatd;

    private Date updated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsparent() {
        return isparent;
    }

    public void setIsparent(Integer isparent) {
        this.isparent = isparent;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getCreatd() {
        return creatd;
    }

    public void setCreatd(Date creatd) {
        this.creatd = creatd;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
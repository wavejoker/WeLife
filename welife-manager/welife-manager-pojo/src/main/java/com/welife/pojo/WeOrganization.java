package com.welife.pojo;

import java.util.Date;

public class WeOrganization {
    private Integer id;

    private String orgname;

    private Date createtime;

    private Long presidentId;

    private String orgdesc;

    private Integer orglevel;

    private String orgmark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Long getPresidentId() {
        return presidentId;
    }

    public void setPresidentId(Long presidentId) {
        this.presidentId = presidentId;
    }

    public String getOrgdesc() {
        return orgdesc;
    }

    public void setOrgdesc(String orgdesc) {
        this.orgdesc = orgdesc == null ? null : orgdesc.trim();
    }

    public Integer getOrglevel() {
        return orglevel;
    }

    public void setOrglevel(Integer orglevel) {
        this.orglevel = orglevel;
    }

    public String getOrgmark() {
        return orgmark;
    }

    public void setOrgmark(String orgmark) {
        this.orgmark = orgmark == null ? null : orgmark.trim();
    }
}
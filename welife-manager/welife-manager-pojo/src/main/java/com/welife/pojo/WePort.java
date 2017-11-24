package com.welife.pojo;

import java.util.Date;

public class WePort {
    private Long id;

    private Long authorId;

    private Long parentId;

    private Long contentId;

    private Long pcid;

    private Integer isparent;

    private Date created;

    private Integer anonymous;

    private Integer status;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public Long getPcid() {
        return pcid;
    }

    public void setPcid(Long pcid) {
        this.pcid = pcid;
    }

    public Integer getIsparent() {
        return isparent;
    }

    public void setIsparent(Integer isparent) {
        this.isparent = isparent;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(Integer anonymous) {
        this.anonymous = anonymous;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
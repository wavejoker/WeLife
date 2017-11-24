package com.welife.pojo;

import java.util.Date;

public class WeProductLvword {
    private Long id;

    private Long puductId;

    private Long authorId;

    private Date created;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPuductId() {
        return puductId;
    }

    public void setPuductId(Long puductId) {
        this.puductId = puductId;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
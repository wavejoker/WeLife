package com.welife.pojo;

import java.util.Date;

public class WePortReply {
    private Long id;

    private Long portId;

    private Long reviewerId;

    private Long replyCommentId;

    private Date created;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPortId() {
        return portId;
    }

    public void setPortId(Long portId) {
        this.portId = portId;
    }

    public Long getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Long reviewerId) {
        this.reviewerId = reviewerId;
    }

    public Long getReplyCommentId() {
        return replyCommentId;
    }

    public void setReplyCommentId(Long replyCommentId) {
        this.replyCommentId = replyCommentId;
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
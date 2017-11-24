package com.welife.pojo;

import java.util.Date;

public class WeSign {
    private Long id;

    private Long userId;

    private Date signTime;

    private Long sustainDay;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public Long getSustainDay() {
        return sustainDay;
    }

    public void setSustainDay(Long sustainDay) {
        this.sustainDay = sustainDay;
    }
}
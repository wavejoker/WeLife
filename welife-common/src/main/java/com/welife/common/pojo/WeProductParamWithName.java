package com.welife.common.pojo;

import java.util.Date;

/**
 * @author Creeper
 * @TODO 自定义的包含类目名称的工具类
 * @Data 2017年6月25日下午7:27:50
 */
public class WeProductParamWithName {

    private String name;

    private Long id;

    private Long productCatId;

    private Date created;

    private Date updated;

    private String paramData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductCatId() {
        return productCatId;
    }

    public void setProductCatId(Long productCatId) {
        this.productCatId = productCatId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getParamData() {
        return paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
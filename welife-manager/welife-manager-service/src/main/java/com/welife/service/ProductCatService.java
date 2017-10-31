package com.welife.service;

import com.welife.common.pojo.EUTreeNode;
import com.welife.common.utils.WeLifeResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: Creeper
 * @DesCription:
 * @Date: 17-10-23 上午11:02
 * @Modified By:
 */
public interface ProductCatService {

    /**
     * 获得商品分类列表
     * @param parentId
     * @return
     */
    List<EUTreeNode> getCatList(Long parentId);

    /**
     * 获得商品参数列表
     * @param id
     * @return
     */
    WeLifeResult getProductParamNameById(Long id);

    /**
     * 获得商品分类名称
     * @param id
     * @return
     */
    String getProductCatNameById(Long id);
}
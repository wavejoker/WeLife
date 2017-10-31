package com.welife.service.impl;

import com.welife.common.pojo.EasyUIResult;
import com.welife.common.utils.WeLifeResult;
import com.welife.mapper.WeProductParamItemMapper;
import com.welife.mapper.WeProductParamMapper;
import com.welife.pojo.WeProductParam;
import com.welife.service.ProductParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Creeper
 * @date 17-10-27 下午3:56
 * @since 1.8.0_151
 */
@Service
public class ProductParamServiceImpl implements ProductParamService {

    @Autowired
    private WeProductParamMapper paramMapper;
    @Autowired
    private WeProductParamItemMapper paramItemMapper;

    @Override
    public EasyUIResult getProductParamList(Integer page, Integer rows) {

        return null;
    }

    @Override
    public WeLifeResult getProductParamByCid(Integer cid) {
        return null;
    }

    @Override
    public WeLifeResult insertProductParam(WeProductParam productParam) {
        return null;
    }
}

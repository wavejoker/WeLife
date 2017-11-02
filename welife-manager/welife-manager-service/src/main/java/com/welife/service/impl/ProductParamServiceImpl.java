package com.welife.service.impl;

import com.welife.common.pojo.EasyUIResult;
import com.welife.common.utils.WeLifeResult;
import com.welife.mapper.WeProductParamItemMapper;
import com.welife.mapper.WeProductParamMapper;
import com.welife.pojo.WeProductParam;
import com.welife.pojo.WeProductParamExample;
import com.welife.service.ProductParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public WeLifeResult insertProductParam(WeProductParam productParam) {
        return null;
    }

    @Override
    public WeLifeResult getProductParamByCid(Long cid) {
        WeProductParamExample example = new WeProductParamExample();
        WeProductParamExample.Criteria criteria = example.createCriteria();
        criteria.andProductCatIdEqualTo(cid);
        List<WeProductParam> productParams = paramMapper.selectByExampleWithBLOBs(example);
        //判断查询到的结果
        if (productParams != null && productParams.size() > 0) {
            return WeLifeResult.ok(productParams.get(0));
        }
        return WeLifeResult.ok();
    }

}

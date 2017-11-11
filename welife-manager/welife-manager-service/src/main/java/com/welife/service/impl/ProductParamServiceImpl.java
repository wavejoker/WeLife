package com.welife.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.welife.common.pojo.EasyUIResult;
import com.welife.common.pojo.WeProductParamWithName;
import com.welife.common.utils.WeLifeResult;
import com.welife.mapper.WeProductCategoryMapper;
import com.welife.mapper.WeProductParamItemMapper;
import com.welife.mapper.WeProductParamMapper;
import com.welife.pojo.WeProductParam;
import com.welife.pojo.WeProductParamExample;
import com.welife.service.ProductParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Creeper
 * @date 17-10-27 下午3:56
 * @since 1.8.0_151
 */
@Service
public class ProductParamServiceImpl implements ProductParamService {

    @Autowired
    private WeProductParamMapper productParamMapper;
    @Autowired
    private WeProductCategoryMapper productCategoryMapper;

    @Override
    public EasyUIResult getProductParamList(Integer page, Integer rows) {
        // 分页处理
        PageHelper.startPage(page, rows);
        // 查询规格列表
        WeProductParamExample example = new WeProductParamExample();
        List<WeProductParam> list = productParamMapper.selectByExampleWithBLOBs(example);
        // 将没有商品类目名的元素,转化为有类目名字的元素
        List<WeProductParamWithName> resultList = getProductParamNameById(list);
        EasyUIResult result = new EasyUIResult();
        // 取分页信息
        result.setRows(resultList);
        PageInfo<WeProductParam> pageInfo = new PageInfo<>(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }

    private List<WeProductParamWithName> getProductParamNameById(List<WeProductParam> list) {
        List<WeProductParamWithName> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            WeProductParam productParam = list.get(i);
            WeProductParamWithName productParamWithName = new WeProductParamWithName();
            productParamWithName.setCreated(productParam.getCreated());
            productParamWithName.setId(productParam.getId());
            productParamWithName.setName(productCategoryMapper.selectNameByPrimaryKey(list.get(i).getProductCatId()));
            productParamWithName.setProductCatId(productParam.getProductCatId());
            productParamWithName.setParamData(productParam.getParamData());
            productParamWithName.setUpdated(productParam.getUpdated());
            result.add(productParamWithName);
        }
        return result;

    }
    @Override
    public WeLifeResult insertProductParam(WeProductParam productParam) {
        productParam.setCreated(new Date());
        productParam.setUpdated(new Date());
        productParamMapper.insert(productParam);
        return WeLifeResult.ok();
    }

    @Override
    public WeLifeResult getProductParamByCid(Long cid) {
        WeProductParamExample example = new WeProductParamExample();
        WeProductParamExample.Criteria criteria = example.createCriteria();
        criteria.andProductCatIdEqualTo(cid);
        List<WeProductParam> productParams = productParamMapper.selectByExampleWithBLOBs(example);
        //判断查询到的结果
        if (productParams != null && productParams.size() > 0) {
            return WeLifeResult.ok(productParams.get(0));
        }
        return WeLifeResult.ok();
    }

}

package com.welife.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.welife.common.pojo.EasyUIResult;
import com.welife.common.utils.IDUtils;
import com.welife.common.utils.WeLifeResult;
import com.welife.mapper.WeProductDescMapper;
import com.welife.mapper.WeProductMapper;
import com.welife.mapper.WeProductParamItemMapper;
import com.welife.pojo.WeProduct;
import com.welife.pojo.WeProductDesc;
import com.welife.pojo.WeProductExample;
import com.welife.pojo.WeProductParamItem;
import com.welife.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 商品管理服务实现类
 *
 * @Author: Creeper
 * @Date: 17-10-22 下午10:23
 */

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private WeProductMapper productMapper;
    @Autowired
    private WeProductDescMapper productDescMapper;

    @Autowired
    private WeProductParamItemMapper paramItemMapper;

    @Override
    public EasyUIResult getProductList(Integer pages, Integer rows) {
        WeProductExample productExample = new WeProductExample();
        //分页查询
        PageHelper.startPage(pages, rows);
        List<WeProduct> weProducts = productMapper.selectByExample(productExample);
        //创建一个返回值对象
        EasyUIResult easyUIResult = new EasyUIResult();
        easyUIResult.setRows(weProducts);
        //取记录的总条数
        PageInfo<WeProduct> pageInfo = new PageInfo<WeProduct>(weProducts);
        easyUIResult.setTotal(pageInfo.getTotal());
        return easyUIResult;
    }

    @Override
    public WeProduct getProductById(Long productId) {
        WeProductExample example = new WeProductExample();
        WeProductExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(productId);
        List<WeProduct> products = productMapper.selectByExample(example);
        if (products != null && products.size() > 0) {
            return products.get(0);
        }
        return null;
    }

    @Override
    public WeLifeResult creatProduct(WeProduct product, String desc) throws Exception {
        //生成商品ID
        Long productId = IDUtils.genItemId();
        product.setId(productId);
        //商品状态:1-正常, 2-下架, 3-删除
        product.setStatus(1);
        product.setCreated(new Date());
        product.setUpdated(new Date());
        productMapper.insert(product);
        WeLifeResult result = insertProductDesc(productId, desc);

        if (result.getStatus() != 200){
            throw new Exception();
        }
        return result;
    }


    private WeLifeResult insertProductDesc(Long productId, String desc) {
        WeProductDesc productDesc = new WeProductDesc();
        productDesc.setProductId(productId);
        productDesc.setProductDesc(desc);
        int insert = productDescMapper.insert(productDesc);
        System.out.println(insert);
        return WeLifeResult.ok();
    }

    @Override
    public WeLifeResult getProductDescById(Long productId) {
        WeProductDesc productDesc = productDescMapper.selectByPrimaryKey(productId);
        return WeLifeResult.ok(productDesc);
    }

    @Override
    public WeLifeResult getProductParamItemById(Long productId) {
        WeProductParamItem productParamItem = paramItemMapper.selectByPrimaryKey(productId);
        return WeLifeResult.ok(productParamItem);
    }

    @Override
    public WeLifeResult updateProductById(WeProduct product) {
        product.setStatus(1);
        product.setUpdated(new Date());
        int i = productMapper.updateByPrimaryKey(product);
        if (i == 1) {
            return WeLifeResult.ok();
        } else {
            return WeLifeResult.build(500, "无返回数据!");
        }
    }


}

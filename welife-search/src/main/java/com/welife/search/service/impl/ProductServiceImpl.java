package com.welife.search.service.impl;

import java.util.List;

import com.welife.common.pojo.Product;
import com.welife.common.utils.ExceptionUtil;
import com.welife.common.utils.WeLifeResult;
import com.welife.search.mapper.ProductMapper;
import com.welife.search.service.ProductService;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private SolrServer solrServer;

    @Override
    public WeLifeResult importAllProducts() {
        // TODO 导入全部数据库数据
        // 查询商品列表
        try {
            List<Product> productList = productMapper.getProductList();
            // 把商品信息写入索引库
            for (Product product : productList) {
                // 创建一个SolrInputDocument对象
                SolrInputDocument document = new SolrInputDocument();
                document.setField("id", product.getId());
                document.setField("product_title", product.getTitle());
                document.setField("product_sell_point", product.getSell_point());
                document.setField("product_price", product.getPrice()+"");
                document.setField("product_img", product.getImg());
                document.setField("product_category_name", product.getCategory_name());
                document.setField("product_desc", product.getProduct_desc());
                // 写入索引库
                solrServer.add(document);
            }
            // 提交修改
            solrServer.commit();
        } catch (Exception e) {
            e.printStackTrace();
            return WeLifeResult.build(500, ExceptionUtil.getStackTrace(e));
        }
        return WeLifeResult.ok();
    }

}

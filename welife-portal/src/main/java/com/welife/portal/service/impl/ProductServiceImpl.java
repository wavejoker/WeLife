package com.welife.portal.service.impl;

import java.util.List;
import java.util.Map;

import com.welife.common.utils.HttpClientUtil;
import com.welife.common.utils.JsonUtils;
import com.welife.common.utils.WeLifeResult;
import com.welife.pojo.WeProductDesc;
import com.welife.pojo.WeProductParamItem;
import com.welife.portal.pojo.ProductInfo;
import com.welife.portal.service.ProductService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {

    @Value("${REST_BASE_URL}")
    private String REST_BASE_URL;
    @Value("${PRODUCT_INFO_URL}")
    private String PRODUCT_INFO_URL;
    @Value("${PRODUCT_DESC_URL}")
    private String PRODUCT_DESC_URL;
    @Value("${PRODUCT_PARAM_URL}")
    private String PRODUCT_PARAM_URL;

    @Override
    public ProductInfo getProductById(Long productId) {
        try {
            // 调用rest的服务查询商品信息
            String requetJson = HttpClientUtil.doGet(REST_BASE_URL + PRODUCT_INFO_URL + productId);
            if (!StringUtils.isBlank(requetJson)) {
                WeLifeResult result = WeLifeResult.formatToPojo(requetJson, ProductInfo.class);
                if (result.getStatus() == 200) {
                    ProductInfo productInfo = (ProductInfo) result.getData();
                    return productInfo;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getProductDesc(Long productId) {
        try {
            // 查询商品描述信息
            String string = HttpClientUtil.doGet(REST_BASE_URL + PRODUCT_DESC_URL + productId);
            // 转换成Java对象
            WeLifeResult weLifeResult = WeLifeResult.formatToPojo(string, WeProductDesc.class);
            if (weLifeResult.getStatus() == 200) {
                WeProductDesc productDesc = (WeProductDesc) weLifeResult.getData();
                String desc = productDesc.getProductDesc();
                return desc;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getProductParam(Long ProductId) {
        try {
            String jsonData = HttpClientUtil.doGet(REST_BASE_URL + PRODUCT_PARAM_URL + ProductId);
            WeLifeResult result = WeLifeResult.formatToPojo(jsonData, WeProductParamItem.class);
            if (result.getStatus() == 200) {
                WeProductParamItem ProductParamProduct = (WeProductParamItem) result.getData();
                String paramData = ProductParamProduct.getParamData();
                // 生成HTML
                // 把规格参数json对象转换成Java对象
                List<Map> jsonList = JsonUtils.jsonToList(paramData, Map.class);
                StringBuffer sb = new StringBuffer();
                sb.append("<table cellpadding=\"0\" cellspacing=\"1\" width=\"100%\" border=\"1\">\n");
                sb.append("<tbody>\n");
                for (Map m1 : jsonList) {
                    sb.append("</tr>\n");
                    sb.append("<tr>\n");
                    sb.append("<th bgcolor=\"#224499\" colspan=\"2\" width=\"30%\">" + m1.get("group") + "</th>\n");
                    sb.append("</tr>\n");
                    List<Map> list2 = (List<Map>) m1.get("params");
                    for (Map m2 : list2) {
                        sb.append("<tr>\n");
                        sb.append("<td>" + m2.get("k") + "</td>\n");
                        sb.append("<td>" + m2.get("v") + "</td>\n");
                    }
                }
                sb.append("</tbody>\n");
                sb.append("</table>");
                return sb.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }

}

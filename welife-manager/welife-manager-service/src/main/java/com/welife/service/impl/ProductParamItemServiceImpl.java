package com.welife.service.impl;

import com.welife.common.utils.JsonUtils;
import com.welife.mapper.WeProductParamItemMapper;
import com.welife.pojo.WeProductParamItem;
import com.welife.pojo.WeProductParamItemExample;
import com.welife.service.ProductParamItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 商品参数条目服务实现类
 *
 * @author Creeper
 * @date 17-10-31 下午3:22
 * @since 1.8.0_151
 */
@Service
public class ProductParamItemServiceImpl implements ProductParamItemService {
    @Autowired
    private WeProductParamItemMapper productParamItemMapper;

    /**
     * 根据商品类目ID查询商品规格参数
     *
     * @param productId
     * @return
     */
    @Override
    public String getProductParamByProductId(Long productId) {
        WeProductParamItemExample example = new WeProductParamItemExample();
        WeProductParamItemExample.Criteria criteria = example.createCriteria();
        criteria.andProductIdEqualTo(productId);
        List<WeProductParamItem> productParamItems = productParamItemMapper.selectByExampleWithBLOBs(example);
        if (productParamItems == null || productParamItems.size() == 0) {
            return "";
        }
        WeProductParamItem productParamItem = productParamItems.get(0);
        String paramData = productParamItem.getParamData();
        //将参数数据生成HTML
        //把规格参数JSON数据转换成Java对象
        List<Map> paramList = JsonUtils.jsonToList(paramData, Map.class);
        StringBuffer sb = new StringBuffer();
        sb.append("<table cellpadding=\"0\" cellspacing=\"1\" width=\"100%\" border=\"1\">\n");
        sb.append("<tbody>\n");
        for (Map m1 : paramList) {
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
}

package com.welife.rest.service;

import com.welife.common.utils.WeLifeResult;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Creeper
 * @date 17-11-9 上午9:59
 * @since 1.8.0_151
 */
public interface RedisService {
    /**
     * 同步商品内容
     * @param contentCid
     * @return
     */
    public WeLifeResult syncContent(Long contentCid);
}

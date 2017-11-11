package com.welife.rest.controller;

import com.welife.common.utils.WeLifeResult;
import com.welife.rest.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Creeper
 * @date 17-11-9 下午2:40
 * @since 1.8.0_151
 */

@Controller
@RequestMapping("/cache/sync")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "/content/{contentCid}", method = RequestMethod.GET)
    @ResponseBody
    public WeLifeResult contentCacheSync(@PathVariable Long contentCid){
        WeLifeResult result = redisService.syncContent(contentCid);
        return  result;
    }
}

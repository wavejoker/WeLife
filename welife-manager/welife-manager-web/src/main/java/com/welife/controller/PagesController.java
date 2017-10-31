package com.welife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {

    /**
     * 展示首页面
     * @param string
     * @return
     */
    @RequestMapping("/")
    public String showIndex(String string) {
        return "index";
    }

    /**
     * 展示其他页面
     * @return
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;

    }
}

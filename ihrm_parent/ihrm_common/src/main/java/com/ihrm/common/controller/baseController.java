package com.ihrm.common.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname baseController
 * @Description TODO
 * @Date 2021/7/9 21:32
 * @Created by MINGKU
 */
public class baseController {
    public HttpServletRequest request;
    public HttpServletResponse response;
    protected String companyId;
    protected String companyName;

    @ModelAttribute
    public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        /**
         * 使用默认值 后期再改
         */
        this.companyId = "1";
        this.companyName = "UESTC";
    }

}

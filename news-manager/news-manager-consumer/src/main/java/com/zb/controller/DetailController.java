package com.zb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zb.pojo.Detail;
import com.zb.service.RpcDetailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DetailController {
    @Reference(timeout = 10000)
    private RpcDetailService rpcDetailService;

    @RequestMapping(value = "/show")
    @ResponseBody
    public List<Detail> show(){
        return rpcDetailService.getAllDetail();
    }
}

package com.zb.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zb.mapper.DetailMapper;
import com.zb.pojo.Detail;
import com.zb.service.RpcDetailService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(interfaceClass = RpcDetailService.class)
public class RpcDetailServiceImpl implements RpcDetailService {
    @Autowired
    private DetailMapper detailMapper;

    @Override
    public List<Detail> getAllDetail() {
        return detailMapper.getAllDetail();
    }
}

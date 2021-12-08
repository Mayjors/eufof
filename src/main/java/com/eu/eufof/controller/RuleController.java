package com.eu.eufof.controller;

import com.eu.eufof.entity.Rule;
import com.eu.eufof.service.RuleService;
import com.eu.eufof.utils.HttpResult;
import com.eu.eufof.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/rule")
public class RuleController {

    @Autowired
    private RuleService ruleService;


    @RequestMapping("getRule/{id}")
    public HttpResult getRule(@PathVariable int id) {
        Rule rule = ruleService.selectById(id);

        return ResultUtil.success(rule);
    }
}

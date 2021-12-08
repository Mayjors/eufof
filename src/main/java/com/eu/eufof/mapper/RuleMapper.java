package com.eu.eufof.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.eu.eufof.entity.Rule;

public interface RuleMapper extends BaseMapper<Rule> {
    Rule getRule(int id);
}

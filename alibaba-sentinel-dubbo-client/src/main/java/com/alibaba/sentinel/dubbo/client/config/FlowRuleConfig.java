package com.alibaba.sentinel.dubbo.client.config;

import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

/**
 * @author Lion Li
 */
@Configuration
public class FlowRuleConfig {

    public FlowRuleConfig(){
        // 代码配置限流
        FlowRule flowRule = new FlowRule();
        // 限流资源
        flowRule.setResource("com.alibaba.sentinel.dubbo.api.TestService:test(java.lang.String)");
        // 限流数峰值
        flowRule.setCount(1);
        // QPS限流
        flowRule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        flowRule.setLimitApp("default");
        FlowRuleManager.loadRules(Collections.singletonList(flowRule));
    }

}

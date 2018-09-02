package com.lyq.controller;

import com.lyq.model.TaxParam;
import com.lyq.model.TaxResult;
import com.lyq.service.TaxCalculatorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author liuyiqiang
 * @Date 2018/9/1 10:29
 * @Version 1.0
 */
@Controller
@RequestMapping("/taxCalculator")
public class TaxCalculatorController {

    @Resource
    private TaxCalculatorService taxCalculatorService;

    @RequestMapping("test")
    @ResponseBody
    public TaxResult getTax(TaxParam param) {
        return taxCalculatorService.getTax(param);
    }

}

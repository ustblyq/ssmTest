package com.lyq.service.impl;

import com.lyq.model.TaxParam;
import com.lyq.model.TaxResult;
import com.lyq.service.TaxCalculatorService;
import com.lyq.utils.TaxUtil;
import org.springframework.stereotype.Service;

/**
 * @Author liuyiqiang
 * @Date 2018/9/2 22:26
 * @Version 1.0
 */
@Service
public class TaxCalculatorServiceImpl implements TaxCalculatorService {

    public TaxResult getTax(TaxParam param) {
        TaxResult result = new TaxResult();
        if(param == null) {
            result.setErrorCode(1001);
            result.setErrorMsg("请求参数为空");
            return result;
        }
        Double income = param.getIncome();
        Double crossClaim = param.getCrossClaim();
        if(income == null) {
            result.setErrorCode(1002);
            result.setErrorMsg("收入不能为空");
            return result;
        }
        if(income < 0) {
            result.setErrorCode(1003);
            result.setErrorMsg("收入不能为负数");
            return result;
        }
        if(crossClaim != null && crossClaim < 0) {
            result.setErrorCode(1004);
            result.setErrorMsg("专项扣除金额不能为负数");
        }
        if(crossClaim == null) {
            crossClaim = 0.0;
        }

        double accumulation = getAccumulation(income);
        result.setAccumulation(accumulation);
        double medical = getMedical(income);
        result.setMedical(medical);
        double socialSecurity = getSocialSecurity(income);
        result.setSocialSecurity(socialSecurity);
        //扣除五险一金和专项后的钱
        double money = income - accumulation - medical - socialSecurity - crossClaim;
        double tax = TaxUtil.getTax(money);
        result.setTax(tax);
        result.setAfterTax(money - tax + crossClaim);
        return result;
    }


    private double getAccumulation(double income) {
        if(income <= 25401) {
            return income * 12 / 100;
        }
        return 3048;
    }

    private double getMedical(double income) {
        if(income <= 25401) {
            return income * 2 / 100 + 3;
        }
        return 511;
    }

    private double getSocialSecurity(double income) {
        if(income <= 25401) {
            return income * 8 / 100;
        }
        return 2032;
    }

}

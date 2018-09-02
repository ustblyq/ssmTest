package com.lyq.model;

import java.io.Serializable;

/**
 * @Author liuyiqiang
 * @Date 2018/9/2 10:03
 * @Version 1.0
 */
public class TaxParam implements Serializable {

    private static final long serialVersionUID = 8806053038798808302L;

    //收入
    private Double income;
    //专项扣除金额
    private Double crossClaim;

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Double getCrossClaim() {
        return crossClaim;
    }

    public void setCrossClaim(Double crossClaim) {
        this.crossClaim = crossClaim;
    }
}

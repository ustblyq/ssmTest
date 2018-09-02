package com.lyq.model;

import java.io.Serializable;

/**
 * @Author liuyiqiang
 * @Date 2018/9/2 10:08
 * @Version 1.0
 */
public class TaxResult extends CommonResult implements Serializable {

    private static final long serialVersionUID = -8451780526678272484L;

    private Double accumulation;
    private Double medical;
    private Double socialSecurity;
    private Double tax;
    private Double afterTax;

    public Double getAccumulation() {
        return accumulation;
    }

    public void setAccumulation(Double accumulation) {
        this.accumulation = accumulation;
    }

    public Double getMedical() {
        return medical;
    }

    public void setMedical(Double medical) {
        this.medical = medical;
    }

    public Double getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(Double socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getAfterTax() {
        return afterTax;
    }

    public void setAfterTax(Double afterTax) {
        this.afterTax = afterTax;
    }
}

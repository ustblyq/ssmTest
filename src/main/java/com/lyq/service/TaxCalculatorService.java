package com.lyq.service;

import com.lyq.model.TaxParam;
import com.lyq.model.TaxResult;

public interface TaxCalculatorService {
    TaxResult getTax(TaxParam param);
}

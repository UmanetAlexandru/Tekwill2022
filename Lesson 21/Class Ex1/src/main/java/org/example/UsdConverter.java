package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class UsdConverter {
    private final ExchangeRateService exchangeRateService;

    public UsdConverter(ExchangeRateService exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
    }

    public BigDecimal convertToUsd(BigDecimal converted) {
        return converted.divide(exchangeRateService.getUsd(), RoundingMode.FLOOR);
    }
}

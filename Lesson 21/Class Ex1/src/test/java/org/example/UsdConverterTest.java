package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class UsdConverterTest {
    @Mock
    ExchangeRateService exchangeRateService = Mockito.mock(ExchangeRateService.class);
    UsdConverter converter = new UsdConverter(exchangeRateService);

    @Test
    void convertToUsd() {
        BigDecimal mdl = BigDecimal.valueOf(2000);

        Mockito.when(exchangeRateService.getUsd()).thenReturn(BigDecimal.valueOf(20));

        BigDecimal bigDecimal = converter.convertToUsd(mdl);

        Assertions.assertEquals(BigDecimal.valueOf(100), bigDecimal);
    }
}
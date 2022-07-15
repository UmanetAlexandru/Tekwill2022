package org.example;

import java.math.BigDecimal;
import java.util.Random;

public class ExchangeRateService {
    private static final Random RAND = new Random();

    public BigDecimal getUsd() {
        return BigDecimal.valueOf(RAND.nextDouble(19.8, 20.1));
    }
}

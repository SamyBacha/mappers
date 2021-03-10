package discount;

import java.math.BigDecimal;

public class EasterDiscounter implements Discounter {
    public static final double DISCOUNT_VALUE = 0.5;

    @Override
    public BigDecimal applyDiscount(final BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(DISCOUNT_VALUE));
    }
}
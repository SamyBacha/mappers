package discount;

import java.math.BigDecimal;

public class ChristmasDiscounter implements Discounter {

  public static final double DISCOUNT_VALUE = 0.9;

  @Override
   public BigDecimal applyDiscount(final BigDecimal amount) {
       return amount.multiply(BigDecimal.valueOf(DISCOUNT_VALUE));
   }
}
package discount;

import java.math.BigDecimal;

public interface Discounter2 {

  BigDecimal applyDiscount(BigDecimal amount);

  static Discounter2 christmasDiscounter() {
    return amount -> amount.multiply(BigDecimal.valueOf(0.9));
  }

  static Discounter2 newYearDiscounter() {
    return amount -> amount.multiply(BigDecimal.valueOf(0.8));
  }

  static Discounter2 easterDiscounter() {
    return amount -> amount.multiply(BigDecimal.valueOf(0.5));
  }

}

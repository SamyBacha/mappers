package discount;

import java.math.BigDecimal;
import java.util.function.UnaryOperator;

@FunctionalInterface
public interface Discounter3 extends UnaryOperator<BigDecimal> {

  default Discounter3 chain(Discounter3 next) {
    return value -> next.apply(this.apply(value));
  }

  static Discounter3 christmas() {
    return amount -> amount.multiply(BigDecimal.valueOf(0.9));
  }

  static Discounter3 newYear() {
    return amount -> amount.multiply(BigDecimal.valueOf(0.8));
  }

  static Discounter3 easter() {
    return amount -> amount.multiply(BigDecimal.valueOf(0.5));
  }

}


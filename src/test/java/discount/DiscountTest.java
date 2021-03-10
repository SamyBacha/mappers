package discount;

import static discount.Discounter2.christmasDiscounter;
import static discount.Discounter2.easterDiscounter;
import static discount.Discounter2.newYearDiscounter;
import static discount.Discounter3.christmas;
import static discount.Discounter3.easter;
import static discount.Discounter3.newYear;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class DiscountTest {

  final BigDecimal amount = BigDecimal.valueOf(100);

  @Test
  void should_apply_easter_discount_or_christmas_discount() {
    List<Discounter> discounters = List.of(new ChristmasDiscounter(), new EasterDiscounter());

    List<BigDecimal> discountedValues = discounters.stream().map(discounter -> discounter.applyDiscount(amount)).collect(Collectors.toList());

    assertEquals(discountedValues.get(0), BigDecimal.valueOf(90.0));
    assertEquals(discountedValues.get(1), BigDecimal.valueOf(50.0));
  }

  @Test
  void should_apply_easter_discount_or_christmas_discount2() {
    List<Discounter> discounters = List.of(
        amount -> amount.multiply(BigDecimal.valueOf(0.9)),
        amount -> amount.multiply(BigDecimal.valueOf(0.5)),
        amount -> amount.multiply(BigDecimal.valueOf(0.8))
    );

    List<BigDecimal> discountedValues = discounters.stream().map(discounter -> discounter.applyDiscount(amount)).collect(Collectors.toList());

    assertEquals(discountedValues.get(0), BigDecimal.valueOf(90.0));
    assertEquals(discountedValues.get(1), BigDecimal.valueOf(50.0));
    assertEquals(discountedValues.get(2), BigDecimal.valueOf(80.0));
  }

  @Test
  void should_apply_easter_discount_or_christmas_discount2_2() {
    List<Discounter2> discounters = List.of(christmasDiscounter(), newYearDiscounter(), easterDiscounter());

    List<BigDecimal> discountedValues = discounters.stream().map(discounter -> discounter.applyDiscount(amount)).collect(Collectors.toList());

    assertEquals(discountedValues.get(0), BigDecimal.valueOf(90.0));
    assertEquals(discountedValues.get(1), BigDecimal.valueOf(50.0));
    assertEquals(discountedValues.get(2), BigDecimal.valueOf(80.0));
  }

  @Test
  void should_apply_all_discounts() {
    List<Discounter3> discounters = List.of(christmas(), newYear(), easter());

    Discounter3 combinedDiscounter = discounters.stream().reduce(v -> v, Discounter3::chain);

    BigDecimal discountedValue = combinedDiscounter.apply(amount);
    assertEquals(discountedValue.stripTrailingZeros(), BigDecimal.valueOf(36.0).stripTrailingZeros());
  }

  @Test
  void should_chain_discounters() {
    final Function<BigDecimal, BigDecimal> combinedDiscounters = Discounter3
        .christmas()
        .andThen(newYear());

    BigDecimal discountedValue = combinedDiscounters.apply(amount);
    assertEquals(discountedValue.stripTrailingZeros(), BigDecimal.valueOf(72.0).stripTrailingZeros());
  }

}

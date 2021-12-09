package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

  @Test
  void shouldThrowExceptionWhenDivisionByZero() {
    // given
    var calculator  = new Calculator();

    // when
    DivisionByZeroException divisionByZeroException = Assertions.assertThrows(
        DivisionByZeroException.class, () -> calculator.divide(5, 0));

    // then
    Assertions.assertEquals(divisionByZeroException.getMessage(), "0!!!");
  }
}
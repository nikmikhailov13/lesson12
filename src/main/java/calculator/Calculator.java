package calculator;

import java.util.Optional;

public class Calculator {

  public int multiply(int a, int b) {
    return a * b;
  }

  public int divide(int a, int b) throws DivisionByZeroException {
    if (b == 0) {
      throw new DivisionByZeroException("0!!!");
    }
    return a / b;
  }

  public Optional<Integer> divideOptional(int a, int b) {
    if (b == 0) {
      return Optional.empty();
    } else {
      Integer result = a / b;
      return Optional.of(result);
    }
  }

  public int sum(int a, int b) {
    return a + b;
  }

  public int diff(int a, int b) {
    return a - b;
  }
}

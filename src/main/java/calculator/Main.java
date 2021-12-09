package calculator;

import java.util.Optional;

public class Main {

  public static void main(String[] args) throws Exception {
    var calculator = new Calculator();
    System.out.println(calculator.multiply(5, 8));

    try {
      System.out.println(calculator.divide(5, 3));
    } catch (DivisionByZeroException e) {
      System.out.println(e);
    } finally {
      System.out.println(calculator.diff(5, 0));
    }

    Optional<Integer> optionalInteger = calculator.divideOptional(6, 0);

    Integer integer = optionalInteger.orElseThrow(() -> new Exception("dafsfdsf"));

    System.out.println(integer);

  }
}

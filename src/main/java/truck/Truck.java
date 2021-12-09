package truck;

public class Truck extends Car {

  @Override
  public void drive() {
    System.out.println("БББррр");
  }

  public Truck(int weight) {
    super(weight);
  }
}

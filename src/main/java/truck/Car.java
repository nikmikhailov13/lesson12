package truck;

public abstract class Car {

  private int weight;

  public abstract void drive();

  public int getWeight(){
    return this.weight;
  }
  public Car(int weight){
    this.weight = weight;
  }
}

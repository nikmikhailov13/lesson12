package truck;

public class Main {

  public static void main(String[] args) throws Exception {
    var truck = new Truck(5);
    truck.drive();
    Road road = new Road();
    road.accceptCar(truck);
  }
}

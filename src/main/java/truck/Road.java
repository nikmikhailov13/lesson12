package truck;

public class Road {

  public void accceptCar(Car car) throws Exception {
    if (car.getWeight() > 3) {
      throw new Exception("машина слишком тяжелая");
    } else {
      System.out.println("проезжайте");
    }
  }
}

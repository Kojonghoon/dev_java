package dev_java.Y22M12D01;

public class PrideMain {
  public static void main(String[] args) {
    Pride myCar = new Pride();
    Pride herCar = new Pride();
    // Insert here
    myCar = herCar;
    System.out.println(myCar == herCar);
  }

}

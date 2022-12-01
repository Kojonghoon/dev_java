package dev_java.Y22M12D01;

public class PrideMain {
  public static void main(String[] args) {
    Pride myCar = new Pride();
    Pride herCar = new Pride();
    // Insert here
    herCar = myCar;// myCar의 주소번지 바뀜
    System.out.println(myCar == herCar);
  }

}

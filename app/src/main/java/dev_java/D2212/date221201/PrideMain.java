package dev_java.D2212.date221201;

public class PrideMain {
  public static void main(String[] args) {
    Pride myCar = new Pride();
    Pride herCar = new Pride();
    // Insert here
    herCar = myCar;// myCar의 주소번지 바뀜
    System.out.println(myCar == herCar);
  }

}

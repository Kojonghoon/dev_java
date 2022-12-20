package dev_java.D2212.date221220;

class CarVO {
  private int speed;
  private String carColor;
  private int wheelNum;

  CarVO() {
    // 초기화 값은 0 null 0
  }

  CarVO(int speed) { // new CarVO(30); 으로 호출했다면
    this.speed = speed;
    // 답은 30 null 0
  }

  CarVO(int speed, String carColor) {// new CarVO(30,"검정색"); 으로 생성하면?
    this.speed = speed;
    this.carColor = carColor;
    // 답은 30 검정색 0
  }

  CarVO(int speed, String carColor, int wheelNum) {// new CarVO(30,"검정색",4); 으로 생성하면?
    this.speed = speed;
    this.carColor = carColor;
    this.wheelNum = wheelNum;
    // 답은 30 검정색 4
  }

  @Override
  public String toString() {
    return "현재속도는 " + speed + "내 자동차는 "
        + carColor + "이고, 바퀴수는 " + wheelNum + "입니다.";
  }

  public int getSpeed() {
    return this.speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public String getCarColor() {
    return this.carColor;
  }

  public void setCarColor(String carColor) {
    this.carColor = carColor;
  }

  public int getWheelNum() {
    return this.wheelNum;
  }

  public void setWheelNum(int wheelNum) {
    this.wheelNum = wheelNum;
  }
}

public class CarVOMain {
  public static void main(String[] args) {
    CarVO cVO1 = new CarVO();
    CarVO cVO2 = new CarVO(50, "검정색");
    CarVO cVO3 = new CarVO(50, "검정색", 4);
    CarVOMain carVOMain = new CarVOMain();
    System.out.println(carVOMain);
    System.out.println("=====carVOMain=====");
    System.out.println(cVO1); // override를 주석처리하면 주소번지가 나옴
    System.out.println("=====cVO1=====");
    System.out.println(cVO2);
    System.out.println("=====cVO2=====");
    System.out.println(cVO3);
    System.out.println("=====cVO3=====");
  }
}
package dev_java.oracle;

import java.net.Socket;

//Object클래스에는 toString()정의되어 있다.
//모든 클래스는 toString()오버라이딩 할 수 있다.
public class Pride extends Object {

  @Override
  public String toString() {
    return "Pride 자동차 입니다.";
  }

  public static void main(String[] args) {
    Pride myCar = new Pride();
    System.out.println(myCar);
    System.out.println(myCar.toString());
  }

}
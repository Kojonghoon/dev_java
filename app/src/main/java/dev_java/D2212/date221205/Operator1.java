package dev_java.D2212.date221205;

public class Operator1 {
  public static void main(String[] args) {

    int i = 1;
    switch (i) {
      case 0:
        ++i; // 실행문
      case 1:
        ++i; // 실행문 2
        break;// switch탈출 - 2
      default:
        ++i; // 3
    }// end of switch
     // insert here - i는 얼마 일까요
    System.out.println(i);
  }
}
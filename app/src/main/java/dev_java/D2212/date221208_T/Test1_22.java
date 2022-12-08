package dev_java.D2212.date221208_T;

public class Test1_22 {
  public static void main(String[] args) {
    for (int i = 1; i <= 20; i++) {
      for (int j = 1; j <= 20; j++) {
        System.out.println(j + "는 5의 배수가 아닙니다.");
        break;
      }
      System.out.println(i + "는 5의 배수 입니다.");
    }
  }
}

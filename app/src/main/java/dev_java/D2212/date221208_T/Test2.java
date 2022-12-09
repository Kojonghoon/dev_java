package dev_java.D2212.date221208_T;

public class Test2 {
  public static void main(String[] args) {
    for (int i = 1; i <= 20; i++) {
      switch (i % 5) {
        case 0:
          System.out.println(i + " : 5의 배수 입니다.");
          break;
        default:
          System.out.println(i + " : 5의 배수가 아닙니다.");
      }
    }
  }
  /*
   * int i = 1;
   * while (i <= 20) {
   * if (i % 5 == 0) {
   * System.out.println(i + " : 5의 배수 입니다.");
   * } else {
   * System.out.println(i + " : 5의 배수가 아닙니다.");
   * }
   * i++;
   * }
   */
}

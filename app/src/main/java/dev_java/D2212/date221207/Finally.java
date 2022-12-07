package dev_java.D2212.date221207;
//java 예외처리
//java finally 사용법
public class Finally {
  public static void main(String[] args) {
    int i = 10;
    int j = 2;
    j = 0;
    j = 5;
    try {
      System.out.println(i / j); // 2
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("finally는 무조건 실행이 된다.");
    }
  }
}
package dev_java.D2212.date221205;

public class Operator4 {
  public static void main(String[] args) {
    int i = 1;
    int j = 2;
    // if ((i == --j) & (++i <= j)) {
    if ((i == --j) || (++i <= j)) { // or연산자 하나만 참이여도 참
      // 1 == 1 -T // 1 <=1 F
      System.out.println("조건을 만족할 때");
      // insert here - i와 j의 값을 확인할 수 없다.
    } else {
      System.out.println("조건을 만족하지 않았을 때");
    }
    // insert here -> i는 얼마? j는 얼마 일까요?
    System.out.println("i: " + i);
    System.out.println("j: " + j);
  }
}

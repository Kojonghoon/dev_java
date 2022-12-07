package dev_java.D2212.date221207;

public class Q39 {
  static int counter = 0;
  // private int counter = 0;
  // static으로 선언된 메소드는 static으로 선언된 변수와
  // 자신의 메소드에 선언된 변수만 사용할 수 있다.
  // 3번행이 static int counter = 0; 이라면
  // 결과는 B 번 22 번라인은 3 을 출력한다

  public static int getInstanceCount() {
    return counter;
  }

  public Q39() {
    counter++;
  }

  public static void main(String[] args) {
    Q39 q1 = new Q39();
    Q39 q2 = new Q39();
    Q39 q3 = new Q39();
    System.out.println(Q39.getInstanceCount());
  }
}

package dev_java.D2212.week4.date221221_T;

public class Overloading {
  public void test() {
  } // 12번과 파라미터의 갯수가 같아서 같은 이름의 메소드 중복선언 불가

  public void test(String str) {
  }// 7번과 파라미터의 타입이 같아서 같은 이름의 메소드 중복선언이 불가하다

  public void test(int i) {
  } // 11번과 파라미터의 타입이 같아서 같은 이름의 메소드 중복선언이 불가하다
  // public void test(String s) { }

  public void test(char ch) {
  }

  public void test(String str, int i) {
  }

  public void test(int i, String str) {
  }
  // private void test(int i) { }
  // public void test() { return 0; }
}
// 자바에서는 같은 이름의 메소드를 중복 선언 가능하다

// 무조건 파라미터의 갯수나 타입이 달라야 한다
// 접근제한자가 있고 없고는 영향이 없다
// 리턴타입이 있고 없고는 영향이 ㅇ벗다
// 예외를 던지고 던지지 않고는 영향이 없다
// 파라미터의 변수이름이 다른것은 영향이 없다
// 메소드오버라딩 = 문제와 상관없음

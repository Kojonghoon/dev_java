package dev_java.D2212.week3.date221212;

public class Main/* 디폴트 생성자 JVM에서 대리 생성 - 생략가능 */ {
  int i = 1;
  boolean isOk[] = new boolean[3]; // false, false, false

  public static void main(String[] args) {
    Sub sub/* 지변-인스턴스변수 */ = new Sub/* 생성자 호출 */(); // 인스턴스화
    System.out.println(sub/* 전변 */.j); // 전역변수에 대해서만 인스턴스 변수.변수명
    sub.methodSub();
  }
}

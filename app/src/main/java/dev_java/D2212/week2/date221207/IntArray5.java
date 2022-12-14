package dev_java.D2212.week2.date221207;

public class IntArray5 {
  String names[] = new String[] { "이순신", "강감찬", "김춘추" };
  int ages[] = { 30, 40, 50 };

  void methodA() {
    for (int i = 0; i < 3; i++) {
      System.out.println("이름 : " + names[i] + ", 나이 : " + ages[i]);
    }
  }

  void methodB() {
    for (int i = 0; i < 3; i++) {
      System.out.printf("%s 님의 나이는 %d 입니다. %n", names[i], ages[i]);
    }
  }

  public static void main(String[] args) {
    IntArray5 ia = new IntArray5();
    System.out.println("=======[[ methodA 출력 - 전역변수 출력 ]]=======");
    ia.methodA();
    System.out.println("=======[[ methodB 출력 - 두 배열은 관계가 있다 ]]=======");
    ia.methodB();
  }
}
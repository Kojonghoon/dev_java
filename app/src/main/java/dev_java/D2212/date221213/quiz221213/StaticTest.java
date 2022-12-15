package dev_java.D2212.date221213.quiz221213;

class S1 {
  static int i;// 0,전변성격 - 글로벌하게 사용가능함 - 인스턴스화 없이 사용이 가능함-복제본만들지 마라

  static void m() {
  }
}

class S2 {
  void methodA() {
    S1.i = 500;
    // System.out.println(S1.i);
  }
}

public class StaticTest {
  public static void main(String[] args) {
    S1.i = 10;
    S1 s1 = new S1();
    s1.i = 100;
    System.out.println(S1.i);
    System.out.println(s1.i);
    System.out.println("===========");
    S2 s2 = new S2();
    // 메소드 이름뒤에 세미콜론이면 메소드 호출이다.
    s2.methodA();// 메소드A 호출했니? Ok
    System.out.println("methodA() 호출 후 ==>" + S1.i);
  }
}

package dev_java.D2212.week1.date221130;

public class Variable {
  static int x;

  // 나는 파라미터가 없는 메소드 입니다. - 꼰대
  // 나는 반환형이 없다.
  void methodA() {
    int i;
    i = 1;
    x = i;
    System.out.println(i);
  }

  public static void main(String[] args) {
    // insert here
    Variable variable = new Variable();
    // System.out.println(x);
    variable.methodA();
    System.out.println("x는" + variable.x);
  }
}

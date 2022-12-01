package dev_java.practice;

class B {
  int i;
}

public class A {
  void C(B b) {
    b = new B();
    b.i = 500;
    System.out.println("Sub i는 " + b.i + " 입니다.");
  }

  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    a.C(b);
    b.i = 100;
    // a.C(b);
    System.out.println("Main i는 " + b.i + " 입니다");
  }

}

package dev_java.D2212.week3.date221215;

class A {
  int i = 1;
  AMain aMain = null;

  // public A() {// 이러면 this가 없어도 컴파일 오류는 안남
  // }

  public A(AMain aMain) {
    System.out.println("A(AMain amain )호출성공");
    this.aMain = aMain;// 주석으로 막으면 NullPointerException
    //this가 없으면 NullPointerException
  }

  void methodB() {
    aMain.methodA();
  }
}

public class AMain {
  A a = new A(this);

  void methodA() {
    System.out.println("AMain methodA() 호출 성공");
  }

  public static void main(String[] args) {
    AMain aMain = new AMain();
    aMain.a.methodB();
  }
}

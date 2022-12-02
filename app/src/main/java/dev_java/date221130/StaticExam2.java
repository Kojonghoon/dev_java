package dev_java.date221130;
//static은 변수앞에 메소드 앞에 올 수 있다.

//static이 있으면 정벅변수,정적 메소드라 한다.
//인스턴스화 없이 어디서나 호출할 수 있다.
//non-static에서 호출할 수 있다 or 없다.

public class StaticExam2 {

  public static void main(String[] args) {
    StaticExam staticExam = new StaticExam();
    StaticExam staticExam2 = new StaticExam();
    StaticExam staticExam3 = new StaticExam();
    staticExam.methodA();
    staticExam2.i = 5;
    staticExam3.i = 3;
    System.out.println(staticExam.i); // 1
    System.out.println(staticExam2.i); // 5
    System.out.println(staticExam3.i); // 3
  }
}

package dev_java.D2212.week1.date221202;
//static
public class StaticExam4 {
  void init() {
    StaticExam2.j = 1;
  }

  void methodA() {
    StaticExam2.j = 3;
  }

  void methodB() {
    StaticExam2.j += 1;
  }

  public static void main(String[] args) {
    StaticExam4 se4 = new StaticExam4();
    se4.init();
    // XXXX.init();
    System.out.println("j  => " + StaticExam2.j);
    // System.out.println("j => "+ XXXXXXX.j);

  }
}
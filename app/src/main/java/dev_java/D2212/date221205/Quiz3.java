package dev_java.D2212.date221205;

public class Quiz3 {
  void methodA() {
    System.out.println("============[methodA 호출]============");
    for (int i = 1; i < 101; i++) {
      switch (i % 35) {
        case 0:
          System.out.println("fizzbuzz : " + i);
          break;
        case 5:
        case 10:
        case 15:
        case 20:
        case 25:
        case 30:
          System.out.println("fizz : " + i);
          break;
        case 7:
        case 14:
        case 21:
        case 28:
          System.out.println("buzz : " + i);
          break;
        default:
          System.out.println(i);
      }// end of switch
    } // end of for
  }// end of methodA
   // 1부터 100까지 세면 5의 배수이면 fizz
   // 1부터 100까지 세면 7의 배수이면 buzz
   // 1부터 100까지 세면 5와 7칠의 공배수이면 fizzbuzz

  public static void main(String[] args) {
    Quiz3 Q3 = new Quiz3();
    Q3.methodA();
    /*
     * / for (int i = 1; i < 101; i++) {
     * if (i % 35 == 0)
     * System.out.println("fizzbuzz");
     * else if (i % 5 == 0)
     * System.out.println("buzz");
     * else if (i % 7 == 0)
     * System.out.println("fizz");
     * else
     * System.out.println(i);
     * }
     */
  }
}

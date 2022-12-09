package dev_java.D2212.date221208_T;

public class Test2_2 {

  void 메소드이름() {

    for (int i = 1; i <= 10; i++) {
      switch (i % 3) {
        case 0:
          System.out.println(i + " 는 3의 배수입니다."); // 3, 6, 9
          break;
        case 1: case 2:
          System.out.println(i + " 는 3의 배수가 아닙니다.");// 1, 2, 4, 5, 7, 8, 10
          break;
      }
    }
    // int i = 1;
    // while (i <= 10) {
    // if (i % 3 == 0) {
    // System.out.println(i + " 는 3의 배수입니다."); // 3, 6, 9
    // } else if (i % 3 != 0) {
    // System.out.println(i + " 는 3의 배수가 아닙니다.");// 1,2,4,5,7,8,10
    // }
    // i++;
    // }
  }

  public static void main(String[] args) {
    Test2_2 t2 = new Test2_2();
    t2.메소드이름();
  }
}

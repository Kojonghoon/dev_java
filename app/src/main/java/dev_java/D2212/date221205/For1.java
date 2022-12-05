package dev_java.D2212.date221205;

public class For1 {
  public static void main(String[] args) {
    for (int i = 1; i <= 3; i++) {
      System.out.println(i);
    } // end of for
    System.out.println("=============");
    int i = 0;
    i = 0;
    while (i <= 3) {
      System.out.println(i);
      // while문 사용시에는 조건식에 사용된 변수의 증감연산자가 있는지 반드시 확인할 것
      i++;
      // ++i;
    }
  }
}

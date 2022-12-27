package dev_java.D2212.week2.date221205;

public class Solution2 {
  // 1부터 10까지 세면서 짝수의 합을 구하는 프로그램
  public static void main(String[] args) {
    for (int a = 2; a < 11; a = a + 2)
      System.out.println(a);

    int sum = 0;
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    System.out.println("========");
    System.out.println("짝수의 합: " + sum);
  }
}

package dev_java.D2212.week2.date221205;

public class Solution1 {
  // 1부터 10까지의 합을 구하는 프로그램 작성
  public static void main(String[] args) {
    int sum = 0;

    for (int i = 0; i < 11; i++) {
      sum = sum + i;
    }
    System.out.println(sum);
  }
}

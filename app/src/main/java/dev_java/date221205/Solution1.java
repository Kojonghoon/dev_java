package dev_java.date221205;

public class Solution1 {
  // 1부터 10까지의 합을 구하는 프로그램 작성
  public static void main(String[] args) {
    int sum = 0;

    for (int i = 0; i < 11; i++) {
      sum = sum + i;
    }
    System.out.println(sum);
  }
  /*
   * public static void main(String[] args) {
   * Solution1 solution1 = new Solution1();
   * int result = solution1.sum();
   * System.out.println(result);
   * }
   * 
   * int sum() {
   * int sum = 0;
   * int i = 0;
   * while (i < 11) {
   * sum += i;
   * i++;
   * }
   * return sum;
   * }
   */
}

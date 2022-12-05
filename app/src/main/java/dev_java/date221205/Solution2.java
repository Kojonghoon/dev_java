package dev_java.date221205;

public class Solution2 {
  // 1부터 10까지 세면서 짝수의 합을 구하는 프로그램
  public static void main(String[] args) {
    int sum = 0;

    for (int a = 2; a < 11; a = a + 2)
      System.out.println(a);

    for (int i = 0; i < 11; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);
    System.out.println("========");
  }
  /*
   * public static void main(String[] args) {
   * Solution2 solution2 = new Solution2();
   * int result = solution2.sum();
   * System.out.println(result);
   * }
   * 
   * int sum() {
   * int sum = 0;
   * for (int i = 1; i < 11; i++) {
   * if (i % 2 == 0) {
   * sum += i;
   * }
   * }
   * 
   * return sum;
   * }
   * }
   */
}

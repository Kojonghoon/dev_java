package dev_java.D2212.week2.date221205;

public class Solution2copy {
  // 1부터 10까지 세면서 짝수의 합을 구하는 프로그램
  int sum() {
    int sum = 0;
    for (int i = 1; i < 11; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    Solution2copy solution2 = new Solution2copy();
    int result = solution2.sum();
    System.out.println(result);
  }
}

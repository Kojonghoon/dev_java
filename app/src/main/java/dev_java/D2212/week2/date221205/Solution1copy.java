package dev_java.D2212.week2.date221205;

public class Solution1copy {
  // 1부터 10까지의 합을 구하는 프로그램 작성
  int sum() {
    int sum = 0;
    int i = 0;
    while (i < 11) {
      sum += i;
      i++;
    }
    return sum;
  }

  public static void main(String[] args) {
    Solution1copy solution1 = new Solution1copy();
    int result = solution1.sum();
    System.out.println(result);
  }

}

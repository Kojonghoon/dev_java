package dev_java.date221205;

public class Solution3copy {
  // 1부터 100까지 세면 5의 배수이면 fizz
  // 1부터 100까지 세면 7의 배수이면 buzz
  // 1부터 100까지 세면 5와 7칠의 공배수이면 fizzbuzz
  String example(int i) {
    String answer = null;
    if (i % 7 == 0 && i % 5 == 0) {
      answer = "fizzbuzz";
    } else if (i % 5 == 0) {
      answer = "fizz";
    } else if (i % 7 == 0) {
      answer = "buzz";
    }
    return answer;
  }

  public static void main(String[] args) {
    Solution3copy solution3 = new Solution3copy();
    int i = 1;
    while (i < 101) {
      String result = solution3.example(i);
      if (result == null) {
        System.out.println(i + "의 결과 값은 : " + i);
      } else {
        System.out.println(i + "의 결과 값은 : " + result);
      }
      i++;
    }
  }
}

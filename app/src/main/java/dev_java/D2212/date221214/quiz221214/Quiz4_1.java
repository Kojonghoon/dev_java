package dev_java.D2212.date221214.quiz221214;

public class Quiz4_1 {
  int cnt;// 0 -> 1->2

  int account(int start, int end) {// start=3, end 13
    // for (int i = start; i <= end; i++) {
    for (int i = start; i <= end; i = i + 3) {// 3 6
      if (i % 3 == 0) {
        cnt++;
      }
    }
    return cnt;
  }

  public static void main(String[] args) {
    Quiz4_1 q4 = new Quiz4_1();
    q4.account(3, 13);
    System.out.println("3의 배수의 갯수는 " + q4.cnt + "개 입니다.");
  }
}

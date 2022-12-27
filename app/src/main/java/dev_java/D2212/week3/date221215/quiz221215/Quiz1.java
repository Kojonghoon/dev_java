package dev_java.D2212.week3.date221215.quiz221215;

import java.util.Scanner;

public class Quiz1 {
  // 배열을 선언하자
  int users[] = new int[5]; // 0 0 0 0 0

  void average(int hap) {
    double avg = 0.0;
    avg = hap / (double) users.length;
    System.out.println("평균은 " + avg + "입니다.");
  }

  int total() {
    int hap = 0;
    for (int i = 0; i < users.length; i++) {
      hap = hap + users[i];
      System.out.println(hap);
    }
    return hap;
  }

  void initUsers() {
    Scanner s = new Scanner(System.in);
    for (int i = 0; i < users.length; i++) {
      System.out.print("정수를 입력하세요.");
      users[i] = s.nextInt();
      System.out.println(users[i]); // 2 4 6 8 10

    }
    s.close();
  }

  public static void main(String[] args) {
    Quiz1 q1 = new Quiz1();
    q1.initUsers();
    int hap = q1.total();
    System.out.println("총점은 " + hap + "입니다.");
    q1.average(hap);
  }
}

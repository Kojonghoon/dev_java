package dev_java.D2212.week3.date221215;

import java.util.Scanner;

public class Cal {
  void add(int user1, int user2) {
    int add = user1 + user2;
    System.out.println(add);
  }

  int minus(int user1, int user2) {
    int minus = user1 - user2;
    return minus;
  }

  void multi(int user1, int user2) {
    int multi = user1 * user2;
    System.out.println(multi);
  }

  int div(int user1, int user2) {
    int div = user1 / user2;
    return div;

  }

  public static void main(String[] args) {
    Cal cal = new Cal();
    Scanner s = new Scanner(System.in);
    int user1 = s.nextInt();
    int user2 = s.nextInt();
    cal.add(user1, user2);
    cal.multi(user1, user2);
    int result = cal.minus(user1, user2);
    int result2 = cal.div(user1, user2);
    System.out.println(result);
    System.out.println(result2);

  }
}

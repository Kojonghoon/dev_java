package dev_java.date221202;

import java.util.Scanner;

public class StaticExam7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //3System.out.println("3");
    String user = scanner.nextLine();
    System.out.println("      사용자가 입력한 숫자는 " + user + "입니다.");
    int iuser = Integer.parseInt(user);
    System.out.println(iuser + 1);

  }
}
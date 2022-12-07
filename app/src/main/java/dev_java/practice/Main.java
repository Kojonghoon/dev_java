package dev_java.practice;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double a = s.nextInt();
    double b = s.nextInt();
    if (0 < a && b < 10) {
      double c = a / b;
      System.out.println(c);
    }
  }
}
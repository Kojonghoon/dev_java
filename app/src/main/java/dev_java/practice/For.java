package dev_java.practice;

public class For {
  public static void main(String[] args) {
    for (int i = 0; i < 11; i=i+2) {
      System.out.println(i);
    }
    System.out.println("========");

    int i = 0;
    while (i < 11) {
      System.out.println(i);
      i++;
    }
  }
}

package dev_java.D2212.date221206;

public class Report {
  public static void main(String[] args) {
    // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    int a1 = 1;
    int a2 = 1;
    System.out.println(a1);
    System.out.println(a2);

    for (int i = 3; i < 11; i++) {
      int num = a1 + a2;
      System.out.println(num + " ");

      a1 = a2;
      a2 = num;
    }
  }
}
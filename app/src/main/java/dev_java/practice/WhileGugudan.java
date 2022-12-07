package dev_java.practice;

public class WhileGugudan {
  public static void main(String[] args) {

    int i = 1;
    int j = 1;
    while (i < 10) {
      System.out.println(i + "단을 출력합니다.");
      j = 1;
      while (j < 10) {
        System.out.println(i + "x " + j + "= " + i * j);
        j++;
      }
      System.out.println();
      i++;
    }
  }
}
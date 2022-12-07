package dev_java.D2212.date221207;

import java.util.Arrays;

public class Array2 extends Object {
  // 이른 인스턴스화
  int i[] = new int[3]; // 0,0,0
  int j[] = new int[] { 4, 5, 6 }; // 4, 5, 6
  int x[] = { 1, 2, 3 };// 1, 2, 3

  // 변수 - 원시배열 - 객체배열 - 자료구조(List, Map) -쿠키와 세션

  public static void main(String[] args) {
    Array2 a2 = new Array2();
    System.out.println(a2.x.toString());
    System.out.println(Arrays.toString(a2.i));
    System.out.println(Arrays.toString(a2.j));
    System.out.println(Arrays.toString(a2.x));
    System.out.println("========");
    for (int a = 0; a < a2.j.length; a++) {
      System.out.println(a2.j[a]); // 4, 5, 6
    }
    System.out.println("========");

    for (int y : a2.x) {
      System.out.println(y); // 1, 2, 3
    }
  }// end of main
}

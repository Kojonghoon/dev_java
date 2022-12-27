package dev_java.D2212.week2.date221206;

public class Ex {
  public static void main(String[] args) {
    int deptno[];
    deptno = new int[3];
    // = new int[]{0,0,1};
    deptno[0] = 0;
    deptno[1] = 1;
    deptno[2] = 3;
    System.out.println(deptno[0]);
    System.out.println(deptno[1]);
    System.out.println(deptno[2]);
    System.out.println("=====1st=====");

    String[] a = { "가", "나", "다" };
    System.out.println(a[0]);
    System.out.println(a[1]);
    System.out.println(a[2]);
    System.out.println("=====2nd=====");

    for (int i : deptno)
      System.out.println(i);
    System.out.println("=====3rd=====");

    for (int i = 0; i < 3; i++) {
      System.out.println(deptno[i]);
    }
    System.out.println("=====4th=====");
    for (String i : a)
      System.out.println(i);
  }
}

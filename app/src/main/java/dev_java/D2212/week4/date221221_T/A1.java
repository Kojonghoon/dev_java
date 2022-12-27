package dev_java.D2212.week4.date221221_T;

import java.util.Vector;

public class A1 {
  int ival = 1;

  public static void main(String[] args) {
    Vector<A1> vector = new Vector<>();
    A1 a1 = new A1();
    a1.ival = 10;
    System.out.println(a1);
    vector.add(a1);
    System.out.println(vector.get(0));
    a1 = null;// 객체 초기화 하면 다음 라인 넘어갈때 캔디데이트 상태가 됨
    a1 = new A1();
    vector.add(a1);
    a1.ival = 20;
    System.out.println(a1);
    System.out.println(vector.get(1));
    // Insert here

    a1 = vector.get(0);
    System.out.println(a1.ival);

  }

}
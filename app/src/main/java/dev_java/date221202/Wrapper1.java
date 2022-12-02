package dev_java.date221202;

public class Wrapper1 {

  public static void main(String[] args) {
    Integer i = new Integer(10);
    int j = i;
    System.out.println(i);
    System.out.println(j);
    String x = String.valueOf(j);
    // String y=j;
    String y = x;
    System.out.println(y); // 10
  }
}

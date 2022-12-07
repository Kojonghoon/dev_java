package dev_java.D2212.date221207;

public class Q27 {
  public static void parse(String str) {
    try {
      float f = Float.parseFloat(str);
    } catch (NumberFormatException nfe) {
     // f = 0;
      // 에러 : 데이터형이 선언되지 않았다. F변수는 try절 안에서만 선언되어 있다.
    } finally {
     // System.out.println(f);
    }
  }

  public static void main(String[] args) {
    parse("invalid");
  }
}

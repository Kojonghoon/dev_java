package dev_java.D2212.week2.date221208_T;

public class Test1_1 {
  // 메서드 선언
  public void count() {

  }

  // 메인메서드
  public static void main(String[] args) {
    String s1 = new String(" 안녕  ");
    String s2 = new String(" 안녕  ");
    String s3 = " 안녕  ";
    String s4 = " 안녕  ";
    if (s1 == s2)// 주소번지 비교
      System.out.println("주소번지가 같니?"); // false
    if (s1.equals(s2))// 주소번지가 가르키는 값을 비교
      System.out.println("주소번지가 같니?");
    System.out.println("======s1.equlas(s2)====");
    if (s3 == s4)
      System.out.println("주소번지가 같니?");
    System.out.println("=====se=3==s4======");
    if (s3.equals(s4))
      System.out.println("주소번지가 같니?");
    System.out.println("======s3.equals(s4)=====");
  }
}

package dev_java.D2212.week3.date221215;

public class StringCopy {
  public static void main(String[] args) {
    String str = "Hello";
    String str1 = "Hello";
    System.out.println(str == str1);// 주소번지가 같니? true
    System.out.println(str.equals(str1));// 주소번지가 가리키는 값이 같니?true
    System.out.println("============");
    String str2 = new String("Hello");
    String str3 = new String("Hello");
    System.out.println(str2 == str3);// 주소번지가 같니? false
    System.out.println(str2.equals(str3));// 주소번지가 가르키는 값이 같니? true
  }
}

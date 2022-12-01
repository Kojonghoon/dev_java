package dev_java.Y22M12D01;

public class String1 {
  public static void main(String[] args) {
    String s1 = "안녕";
    String s2 = "안녕";
    String s3 = new String("안녕");
    String s4 = new String("안녕");
    // insert here
    // s1과 s2의 주소번지는 같니? T
    // 그 이유 System.out.println(s1 == s2);
    System.out.println(s1 == s2); // T ==주소값을 비교
    System.out.println(s1 == s3); // F
    System.out.println(s1 == s4); // F
    System.out.println(s2 == s3); // F
    System.out.println(s2 == s4); // F
    System.out.println(s3 == s4); // F
    // s3와 s4의 주소번지가 같니? 다르니?
    System.out.println(s3 == s4); // F ==주소값을 비교
    // 만일 s3이 카르키는 문자열이 s4와 같은지를 비교하려면 어떡하지? 구글링 -
    // System.out.println(s3.equals(s4));
    System.out.println(s3.equals(s4)); // 문자열 비교
  }
}

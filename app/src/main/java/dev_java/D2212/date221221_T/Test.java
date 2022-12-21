package dev_java.D2212.date221221_T;

import java.util.Scanner;

public class Test {
  public void sum() {
    Scanner sc = new Scanner(System.in);
    System.out.println("1이상의 숫자를 입력하세요 : ");
    int num = sc.nextInt();

    int sum = 0;
    if (num > 0) { // 크다
      int i = 1;
      while (i <= num) {
        sum += i;
        i++;
        if (i > num) // 이프문 안에 브레이크 추가
          break;
      }
      System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
    } else {
      System.out.println("숫자가 1 이상이 아닙니다.");
    }
  }

  public static void main(String[] args) {
    Test t = new Test(); // 인스턴스화
    t.sum();// 호출
  }
}

/*
 * public void sum() {
 * Scanner scanner = new Scanner( System.in );
 * System.out.print( "1 이상의 숫자를 입력하세요:" );
 * int num = scanner.nextInt();
 * int sum = 0;
 * if ( num > 0 ) {
 * for ( int i = 0; i <= num; i++ ) {
 * sum += i;
 * }
 * System.out.println( "1부터 " + num + "까지의 합은 " + sum + "입니다." );
 * }
 * else {
 * System.out.println( "숫자가 양수 1이상이 아닙니다." );
 * }
 * scanner.close();
 * }
 * public static void main( String[] args ) {
 * InputTest test = new InputTest();
 * test.sum();
 * }
 * }
 */
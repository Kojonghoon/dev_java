package dev_java.D2212.date221205;

import java.util.Scanner;

public class Quiz21 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("구하고자 하는 합의 두번쨰 숫자를 입력하세요.");
    int total = 0; // 지변이니까 초기화 해야돼-main메소드 안에 선언했잖아
    int user_end = s.nextInt();
    int cnt;
    cnt = 1;
    // for(초기화; 조건식; 증감연산자){
    for (; cnt <= user_end; cnt++) {
      // 너 짝수니?
      if (cnt % 2 == 1) {
        total = total + cnt;// 1
      }
    }
    // System.out.println("tot: " + total + ", cnt :" + cnt);
    System.out.printf("tot: %d, cnt: %d %n", total, cnt);
    s.close();
  }
}
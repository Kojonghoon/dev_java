package dev_java.D2212.week2.date221205;

import java.util.Random;
import java.util.Scanner;

public class Nansu2 {
  public static void main(String[] args) {
    Random r = new Random();
    Scanner s = new Scanner(System.in);
    int com = r.nextInt(10); // 0~10
    System.out.println("컴퓨터가 채번한 숫자는 ===>" + com);
    int my = -1;
    // 회차를 카운트 하는 변수 선언하기
    // 언제 카운트를 증가 시킬 것인가? - 힌트를 줄떄 증가 시킨다.
    int cnt = 1;
    while (true) {
      System.out.println("0부터 9사이의 정수를 입력하세요");
      my = s.nextInt();
      if (cnt == 5) {
        System.out.println("5번 기회를 모두 사용하였습니다.");
        System.exit(0); // 파라미터에 0을 주면 자바 가상머신과의 연결고리 끊긴다 - 종료 - 할당 스레드 반환이됨
      }
      System.out.println("사용자가 입렵한 값" + my);
      if (com == my) {// 맞다
        System.out.println("축하합니다.");
        System.out.println(cnt);
        s.close();
        break;
      } else if (com < my) {
        System.out.println("낮춰라");
      } else if (my == 10) {
        System.exit(0);
      }
      s.close();
    }
  }
}

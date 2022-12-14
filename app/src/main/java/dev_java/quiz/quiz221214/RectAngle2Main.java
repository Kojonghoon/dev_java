package dev_java.quiz.quiz221214;

import javax.naming.spi.DirStateFactory.Result;

class RectAngle2 {
  void area(int w, int h) {
    int area = w * h;
    System.out.println("면적은  " + area);
  }

  int area(int w, int h, int result) {
    result = w * h;
    return result;
  }

  long area(long w, long h) {
    return w * h;
  }
}

public class RectAngle2Main {
  public static void main(String[] args) {
    RectAngle2 r2 = new RectAngle2();
    r2.area(1, 1); // 값에 의한 호출 - call by value
    int result = r2.area(2, 2, 0);
    long result2 = r2.area(2L, 3L);
    System.out.println("return타입이 있는 메소드 int " + result);
    System.out.println("return타입이 있는 메소드 long " + result2);
  }
}
/*
 * 메소드를 꺼낸다 - 사용자 정의 메소드 구현
 * 리턴타입을 결정하자
 * void일 때
 * 
 * int 일 때
 * 
 * 출력하기 - where?
 * 
 * 파라미터의 갯수를 나는 결정할 수 있다.
 * 또 파라미터의 타입도 선택할 수 있다.
 * 
 */

package dev_java.D2212.week3.date221214.quiz221214;

class RectAngle3 {
  void area(int params[]) {
    // 어떤게 가로길이인지 세로길이인지 알 수가 없다
    // 또한 결과값이 어느방에 저장되어 있는지 직관적이지 않음
    params[2] = params[0] * params[1];
    System.out.println("면적은 ===> " + params[2]);
  }
}

public class RectAngle3Main {
  public static void main(String[] args) {
    RectAngle3 ra3 = new RectAngle3();
    int params[] = { 2, 3, 0 };
    ra3.area(params);
  }
}
/*
 * 배열로 처리해보기
 * 소스리뷰 - 관전포인트
 * 1.1, 1.2
 * 대
 * 1.3
 * 
 * 어느쪽이 직관적인가?
 * 어느쪾이 더 양이 많은가?
 * 양만 많은가? 아니면 복잡도도 늘었나?
 * 
 * 
 */
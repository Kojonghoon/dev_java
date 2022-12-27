package dev_java.D2212.week3.date221214.quiz221214;

public class RectAngle {
  public static void main(String[] args) {
    // 변수선언 2개 - 가로길이, 세로길이
    // 변수선언 1개 - 면적 구하기
    int width = 2;
    int height = 3;
    int area = 0;
    area = width * height;
    System.out.println("직사각형의 면적은 ? " + area);
  }

  public void area(int i, int j) {
  }

}
/*
 * 자바에서는 같은 이름의 메서드를 선언할 수 있다
 * 단 2가지 규칙이 있는데
 * 하나는 오버라이딩이다.
 * 
 * 오버라이딩에 경우에는 서로 상속관계에 있거나
 * 인터페이스의 구현체 클래스인 경우에만 따진다
 * 
 * 다른 하는 오버로딩이다.
 * 1-1
 * RectAngle.java
 * 메인메소드 안에서 처리하기
 * 
 * 문제 제기
 * 원의 면적도 구하고 싶다면? area = PI*r^2
 * 
 * 삼각형의 면적도 구하자고 하면? area =밑변*높이/2
 * 
 * 사각형의 면적도 구해야 하면?
 */

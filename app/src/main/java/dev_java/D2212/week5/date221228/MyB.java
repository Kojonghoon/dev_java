package dev_java.D2212.week5.date221228;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

//List - java.util.List(Interface)- ArrayList, Vector입니다.
//결론 - 그래서(그런 이유로)m메소드가 m2메소드 보다 더 상위클래스이다
public class MyB {
  //메소드의 파라미터로 인터페이스를 사용하는 경우
  //
  void m(List<String> myNames) {
    System.out.println("==========List<String>==========");
    for (String s : myNames) {
      System.out.println(s);
    }
  }
  //메소드 파라미터로 구현체 클래스를 사용하는 경우
  void m2(Vector<String> myNames) {
    System.out.println("==========Vector<String>==========");
    for (String s : myNames) {
      System.out.println(s);
    }
  }

  // JVM에서 제공하는 List에 대해서 구현체 클래스가 여러가지 있다.
  // 선언부와 생성부의 타입이 서로 다를 수 있다. -권장사항
  // 권장하는 이유는 2가지 선택지가 있다.
  public static void main(String[] args) {
    MyB myB = new MyB();
    List<String> nickNames3 = new Vector<>();
    nickNames3.add("토마토");// 0
    nickNames3.add("키위");// 1
    nickNames3.add("사과");// 2

    ArrayList<String> nickNames = new ArrayList<>();
    nickNames.add("토마토");// 0
    nickNames.add("키위");// 1
    nickNames.add("사과");// 2
    Vector<String> nickNames2 = new Vector<>();
    nickNames2.add("바나나먹으면 ");
    nickNames2.add("포도");
    nickNames2.add("딸기");
    myB.m(nickNames); // List(ArrayList)
    // 왜 11번인가? 왜 18번은 안되는 걸까요? - 범위(Scope, 타입 더 구체적 이니까 )가 작으니까.
    myB.m(nickNames3);// 11번이 호출됨 - 합법
    // myB.m2(nickNames);//Vector(ArrayList)
    // 리스트가 더 큰 개념
    // ArrayList나 Vector가 List가 요구하는 곳에서 인수로 전달할 수 있다는 것을
    // 의미합니다. 그러나 반대는 참이 아닙니다. List 객체를 ArrayList나 Vector가
    // 요구하는 곳에서 전달할 수 없습니다.
    myB.m(nickNames2);// List(Vector)
    myB.m2(nickNames2);// Vector(Vector)
  }
}

package dev_java.date221130;

class Param {
  int ival;// non-static 전역변수//초기화 생략가능 - 생성자가 대신 수행해줌
} // 0->100->500

public class TestParam {
  void effectParam(Param p/* 선언O, 초기화X, 지변 */) {// p는 @abcd1234 // 지변은 class급이 아니라서 초기화 생략 불가 - 생성자가 초기화 대신 수행X
    // insert here - 여기에 p= new Param()이 있으면 결과=0 없으면 결과 =500
    p = new Param(); // p의 주소번지는@abcd1235 // class 인스턴스화 - class int ival 호출 500, 0 / 없으면 500, 500
    p.ival = 500;// p는 @abcd1234
    // p = new Param(); // 0, 500 p의 주소번지는@abcd1235
    System.out.println("sub ival===>" + p.ival);
  }

  public static void main(String[] args) {// 엔트리 포인트
    TestParam tp = new TestParam();
    Param p = new Param();
    p.ival = 100;
    tp.effectParam(p); // 주소번지 @abcd1234를 넘긴다
    System.out.println("main ival===>" + p.ival);
  }
}

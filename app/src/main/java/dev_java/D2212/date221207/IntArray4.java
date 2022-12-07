package dev_java.D2212.date221207;

public class IntArray4 {
  String names[] = new String[] { "이순신", "강감찬", "김춘추" };

  void methodA(int ages[]) {
    for (int i = 0; i < 3; i++) {
      System.out.println(names[i]);
    }
  }

  int[] methodB() {
    int deptnos[] = { 10, 20, 30 }; // 지변을 메소드 밖에서 사용가능하다
    deptnos[0] = deptnos[0] - 1;
    deptnos[1] = deptnos[1] - 2;
    deptnos[2] = deptnos[2] - 3;
    return deptnos; // 리턴할때는 배열기호를 쓸 필요 없다. - 이 자체가 주소번지이니까
  }// 배열이름의 주소번지와 첫번쨰 방의 주소번지가 같다 그러니까 0이다.

  public static void main(String[] args) {
    IntArray4 ia = new IntArray4();
    System.out.println("=======[[ methodA   출력 -   출력문 포함 ]]=======");
    ia.methodA();
    System.out.println("=======[[ methodB   출력 -   main()에서 출력  ]]=======");
    ia.methodB();
    int 부서번호들[] = ia.methodB();
    for (int i = 0; i < 3; i++) {
      System.out.println(부서번호들[i]);
    }
  }

  private void methodA() {
  }
}

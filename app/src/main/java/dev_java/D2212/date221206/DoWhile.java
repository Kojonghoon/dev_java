package dev_java.D2212.date221206;

public class DoWhile {
  public static void main(String[] args) {
    int i = 1;
    // 조건을 수렴하지 않으면 단 한 번도 실행기회가 없다.
    while (i > 3) {// 1>3 =>아니? =>false - 조건을 먼저 따진다.
      System.out.println("while 실행문 출력됨");
    }
    // 굳이 i갑을 1로 초기화한 것은 동일한 조건에서 테스트하기 위함임
    i = 1;
    do {// 조건을 나중에 따진다.- 무조건 한 번은 실행이 됨
      System.out.println("do...while 실행문 출력됨");
    } while (i > 3);
  }
}

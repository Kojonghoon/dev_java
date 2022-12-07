package dev_java.D2212.date221207;

public class IntArray3 {
  void methodA(int ages[]) {
    for (int i = 0; i < 3; i++) {
      System.out.println(ages[i]);
    }
  }

  void methodB(int ages[]) {
    for (int i : ages) {
      System.out.println(i);
    }
  }

  public static void main(String[] args) {
    // 한번에 세 사람의 나이를 담으려면?
    int ages[] = new int[3];
    ages[0] = 1;
    ages[1] = 2;
    ages[2] = 3;
    IntArray3 ia = new IntArray3();
    System.out.println("=======[[ methodA   출력 -   고전 for  문 ]]=======");
    ia.methodA(ages);
    System.out.println("=======[[ methodB   출력 -   개선된 for  문 ]]=======");
    ia.methodB(ages);
    // 한 번에 세가지의 부서번호를 담으려면
    int deptnos[] = { 10, 20, 30 };
    System.out.println(deptnos[0]);
    System.out.println(deptnos[1]);
    System.out.println(deptnos[2]);
  }
}

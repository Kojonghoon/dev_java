package dev_java.D2212.date221205;

public class Operator {
  void methodA(int i, int j) {// call by value - 지변의 값은 호출될 때 결정됨
    j = ++i;
    System.out.println("i : " + i + "j : " + j);
  }

  void methodB(int i, int j) {// call by value - 지변의 값은 호출될 때 결정됨
    j *= i;
    System.out.println("i : " + i + "j : " + j);
  }

  public static void main(String[] args) {
    Operator operator = new Operator();
    operator.methodA(1, 2);
    operator.methodB(1, 2);
    int i = 1; // i=1
    int j = i++;// 1
    System.out.println("i : " + i + "j : " + j); // 2 , 1
  }
}

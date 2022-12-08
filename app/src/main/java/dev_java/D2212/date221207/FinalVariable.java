package dev_java.D2212.date221207;

public class FinalVariable {
  static void methodA() {
    int i = 5;
    i = 7;

    final double PIE = 3.14;
    // PIE = 5.45;// final이 붙으면 재 할당이 안댐
    System.out.println(i);
    System.out.println(PIE);
  }

  public static void main(String[] args) {
    FinalVariable.methodA();
    System.out.println(); // final은 non-static
  }
}

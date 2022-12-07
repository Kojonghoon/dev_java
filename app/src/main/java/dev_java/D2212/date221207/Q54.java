package dev_java.D2212.date221207;

public class Q54 {
  public void testIfA() {
    if (testifB("true")) {
      System.out.println("True");
    } else {
      System.out.println("Not True");
    }
  }

  public Boolean testifB(String str) {
    return Boolean.valueOf(str);
  }

  public static void main(String[] args) {
    Q54 q = new Q54();
    q.testIfA();
  }
}

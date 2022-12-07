package dev_java.D2212.date221207;

public class Q28 {
  int x = 12;

  public void method(int x) {
    x += x; // x=x+x; => x = 5+5;
    System.out.println(x);
  }

  public static void main(String[] args) {
    Q28 q28 = new Q28();
    q28.method(5);
  }
}

package dev_java.D2212.date221205;

public class WhileTest_5 {
  int i;
  int hap;

  public WhileTest_5(int i, int hap) {
    // public XXXXXXXXXXX_5(int i, int hap) {
    this.i = i;
    this.hap = hap;
  }

  public void account() {
    while (i < 6) {
      hap = hap + i;
      // hap = hap + X;
      System.out.println("i : " + i);
      System.out.println("hap : " + hap);
      i++;
    }
  }

  public static void main(String[] args) {
    int i = 1;
    int hap = 0;
    WhileTest_5 w = new WhileTest_5(i, hap);
    // WhileTest_5 X = new WhileTest_5(i, XXX);
    w.account();
    System.out.println("1부터 5  까지의합은 " + w.hap);
    // System.out.println("1부터 5 까지의합은 " + X.hap);
  }

}
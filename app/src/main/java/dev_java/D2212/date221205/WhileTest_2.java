package dev_java.D2212.date221205;

public class WhileTest_2 {
  public void account() {
    // public XXXX account() {
    int i = 1;
    int hap = 0;
    while (i < 6) {
      hap = hap + i;
      System.out.println("i : " + i);
      System.out.println("hap : " + hap);
      i++;
      // X++;
    }
    System.out.println("1부터 5  까지의합은 " + hap);
    // System.out.println("1부터 5 까지의합은 " + XXX);
  }

 public static void main(String[] args) {
    WhileTest_2 w = new WhileTest_2();
    //WhileTest_2 w = XXX WhileTest_2();
    w.account();
    //X.account();
}
}

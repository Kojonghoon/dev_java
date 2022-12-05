package dev_java.D2212.date221205;

public class WhileTest_3 {
  /****************************************************
   * 합을구하는메소드구현
   * 
   * @param i   카운트하는변수
   * @param hap 합을담을변수
   ****************************************************/
  public void account(int i, int hap) {
    // public void account(int i, int XXX) {
    while (i < 6) {
      // while (i < X) {
      hap = hap + i;
      // XXX = hap + i;
      System.out.println("i : " + i);
      System.out.println("hap : " + hap);
      i++;
    }
    System.out.println("1부터 5  까지의합은 " + hap);
  }

  public static void main(String[] args) {
    WhileTest_3 w = new WhileTest_3();
    int i = 1;
    // int i = X;
    int hap = 0;
    // int hap = X;
    w.account(i, hap);
    // w.account(X, hap);
  }
}

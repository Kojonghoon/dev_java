package dev_java.D2212.date221205;

public class WhileTest {
  public static void main(String[] args) {
    int i = 1;
    int hap = 0;
    // int XXX = 0;
    while (i < 6) {
      // while(X<6){
      hap = hap + i;
      System.out.println("i : " + i);
      System.out.println("hap : " + hap);
      i++;
    }
    System.out.println("1부터 5  까지의합은 " + hap);
  }
}

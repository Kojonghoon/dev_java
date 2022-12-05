package dev_java.D2212.date221205;

public class WhileTest_4 {
   /*
    * 합을구하는메소드구현
    * 
    * @param i
    * 
    * @param hap
    */
   public int account(int i, int hap) {
      while (i < 6) {
         hap = hap + i;
         System.out.println("i : " + i);
         System.out.println("hap : " + hap);
         i++;
      }
      return hap;
      // return XXX;
   }

   public static void main(String[] args) {
      // public static void XXXX(String[] args) {
      WhileTest_4 w = new WhileTest_4();
      int i = 1;
      int hap = 0;
      hap = w.account(i, hap);
      // hap = w.XXXXXXX(i, hap);
      System.out.println("1부터 5  까지의합은 " + hap);
   }
}

package dev_java.D2212.week2.date221206;

public class ArrayEx {
  public int[] Number() {
    int[] com = new int[3];
    for (int i = 0; i < com.length; i++) {
      com[i] = (int) (Math.random() * 10);
      System.out.println(com[i]);
      System.out.println("=========");
    }
    return com;
  }

  public static void main(String[] args) {
    ArrayEx arr = new ArrayEx();
    arr.Number();
  }

}

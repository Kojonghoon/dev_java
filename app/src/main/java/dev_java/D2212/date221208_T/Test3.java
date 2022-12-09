package dev_java.D2212.date221208_T;

public class Test3 {
  public static void main(String[] args) {
    int[] arr = new int[4];
    for (int i = 0; i < arr.length; i++) {
      // try {
      arr[i] += (10 + i);
      // } catch (ArrayIndexOutOfBoundsException e) {
      // System.out.println(e);
    }
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println(arr[3]);
    System.out.println(arr[4]);
  }
}

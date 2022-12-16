package dev_java.D2212.date221216.quiz221216;

public class Quiz3 {
  int counts[] = new int[10];

  int[] initArray(int datas[], int size) {
    int i;
    for (i = 0; i < datas.length; i++) {
      datas[i] = (int) (Math.random() * 10);
    }
    dataPrint(datas);
    return datas;
  }

  void nunberCount(int[] datas) {
    int index = 0;
    for (int i = 0; i < 100; i++) {
      index = datas[i];
      counts[index]++;
    }
  }

  void dataPrint(int[] datas) {
    for (int i = 0; i < datas.length; i++) {
      System.out.print(datas[i]);
      if (i % 10 == 9) {
        System.out.println();
      }
    }
  }

  public static void main(String[] args) {
    Quiz3 q3 = new Quiz3();
    int datas[] = new int[100];
    q3.initArray(datas, 100);
    q3.nunberCount(datas);
    for (int i = 0; i < q3.counts.length; i++) {
      System.out.println(i + "가 반복된 횟수는 " + q3.counts[i]);
    }
  }
}

package dev_java.D2212.date221209;

//2배열 -> liss<map< >>제네릭 ->웹개발 , 앱개발 (하이브디르앱)-JSON
public class TwoArray1 {
  void toWhile(int[][] arr) {
    System.out.println("=============[[while 문으로]]==========");
    int i = 0;
    while (i < arr.length) {
      int j = 0;
      while (j < arr.length) {
        System.out.println("arr[" + i + "][" + j + "] =" + arr[i][j]);
        j++;
      } // end of inner
      i++;
    } // end of outter
  }

  public static void main(String[] args) {
    int arr[][] = new int[2][3];
    TwoArray1 ta1 = new TwoArray1();
    ta1.toWhile(arr);
    System.out.println("=============[[for 문으로]]==========");
    for (int i = 0; i < arr.length; i++) {// 로우 인덱스
      for (int j = 0; j < arr.length; j++) {// 컬럼인덱스
        System.out.println("arr[" + i + "][" + j + "] =" + arr[i][j]);
      } // end of inner
    } // end of outter
  }
}

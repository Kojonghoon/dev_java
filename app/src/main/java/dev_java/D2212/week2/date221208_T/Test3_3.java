package dev_java.D2212.week2.date221208_T;

public class Test3_3 {
  void 메소드이름() {
    System.out.println("메소드이름 호출 성공");
    // int arr[] = new int[4]; // 0 0 0 0
    int arr[] = { 0, 0, 0, 0 }; // 0 0 0 0
    for (int i = 0; i <= arr.length; i++) {
      try {
        arr[i] += (10 + i);
        System.out.println(arr[i]);
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e.toString());
      } // end of try
    } // end of for
    System.out.println("여기....");
  }

  public static void main(String[] args) {
    Test3_3 t3 = new Test3_3();
    t3.메소드이름();
  }

}

package dev_java.D2212.week3.date221216.quiz221216;

public class Quiz2 {
  int users[] = null;
  int mhap = 0;
  int phap = 0;

  void setArray() {
    users = new int[10];
    for (int i = 0; i < users.length; i++) {
      users[i] = (int) (Math.random() * 21) % 21 - 10;
    }
  }

  void setArray(int size) {
    users = new int[size];
    for (int i = 0; i < users.length; i++) {
      users[i] = (int) (Math.random() * 21) % 21 - 10;
    }
  }

  void total() {
    for (int i = 0; i < users.length; i++) {
      // users[i] = (int) (Math.random() * 21) % 21 - 10;
      if (users[i] > 0) {
        phap += users[i];
      } else if (users[i] < 0) {
        mhap += users[i];
      }
    }
    // nansuPrint();
    System.out.println("채번된 양수의 합은" + phap);
    System.out.println("채번된 음수의 합은" + mhap);
  }

  // 난수 수집 체크
  void nansuPrint() {
    // insert here
    for (int i = 0; i < users.length; i++) {
      System.out.println(users[i]);
    }
  }

  public static void main(String[] args) {
    Quiz2 q2 = new Quiz2();
    q2.setArray();
    q2.nansuPrint();
    q2.total();
  }
}
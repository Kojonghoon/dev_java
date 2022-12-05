package dev_java.D2212.date221205;

public class Quiz2 {
  // 1부터 10까지 세면서 짝수의 합을 구하는 프로그램
  public static void main(String[] args) {
    int total = 0; // 지변이니까 초기화 해야돼-main메소드 안에 선언했잖아
    int cnt;
    cnt = 1;
    // for(초기화; 조건식; 증감연산자){
    for (; cnt <= 10; cnt++) {
      // 너 짝수니?
      if (cnt % 2 == 0) {
        total = total + cnt;// 1
      }
    }
    // System.out.println("tot: " + total + ", cnt :" + cnt);
    System.out.printf("tot: %d, cnt: %d %n", total, cnt);
  }
}
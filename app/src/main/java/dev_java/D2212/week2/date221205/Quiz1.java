package dev_java.D2212.week2.date221205;

public class Quiz1 {
  public static void main(String[] args) {
    // 합을 담는 변수 선언
    // 0으로 초기화 하는 이유는 답에 영향을 주면 안되니까...
    int total = 0; // 지변이니까 초기화 해야돼-main메소드 안에 선언했잖아
    // 1씩 세는 변수 선언
    int cnt;
    cnt = 1;
    // for(초기화; 조건식; 증감연산자){
    for (; cnt <= 3; cnt++) {
      total = total + cnt;// 1
      System.out.println("tot: " + total + ", cnt :" + cnt);
    }
  }
}
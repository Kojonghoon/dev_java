package dev_java.D2212.week5.date221227;

import javax.swing.JFrame;

public class KiwiServer extends JFrame {
  // 선언부

  // 생성자
  public KiwiServer() {
    System.out.println("KiwiServer디폴트 생성자 호출");
  }

  public void initDisplay() {
    this.setTitle("키위톡");
    this.setSize(400, 300);
    this.setVisible(true);
  }

  // 메인메소드
  public static void main(String[] args) {
    KiwiServer ks = new KiwiServer();
    ks.initDisplay();
  }
}

package dev_java.D2212.week5.date221226.thread1;

import javax.swing.JFrame;

public class JFrameTImerClose extends JFrame {
  public JFrameTImerClose() {
    super("JFrame테스트 - 5초후 창 닫기");
    this.setSize(500, 500);
    this.setVisible(true);
    // 대기
    try {
      Thread.sleep(5000);
    } catch (InterruptedException ie) {
      ie.printStackTrace();
    }
    setVisible(false);
  }

  public static void main(String[] args) {
    new JFrameTImerClose();// 생성자 호출하기
  }

}

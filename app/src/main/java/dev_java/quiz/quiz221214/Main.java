package dev_java.quiz.quiz221214;

import javax.swing.JFrame;

public class Main {
  Sub sub = new Sub();// 5 같이 호출
  JFrame jf = new JFrame();

  public Main() {// 디폴트 생성자 //2
    initDisplay();// 메소드 호출 //3
  }

  public void initDisplay() {
    jf.setSize(300, 200);// 4
    jf.setVisible(true);
  }

  public static void main(String[] args) {
    new Main1(); // 1 생성자
  }
}

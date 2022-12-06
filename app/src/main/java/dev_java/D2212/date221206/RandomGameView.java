package dev_java.D2212.date221206;

import javax.swing.JButton;
import javax.swing.JPanel;

public class RandomGameView {
  // 선언부
  JPanel jp_east = new JPanel();
  JButton jbtn_new = new JButton("새게임");
  JButton jbtn_dap = new JButton("정답");
  JButton jbtn_clear = new JButton("지우기");
  JButton jbtn_exit = new JButton("종료");

  // 생성자
  RandomGameView() {
    initDisplay();
  }

  // 화면그리기 구현
  public void initDisplay() {

  }

  // 메인 메소드
  public static void main(String[] args) {
    new RandomGameView();
  }

}

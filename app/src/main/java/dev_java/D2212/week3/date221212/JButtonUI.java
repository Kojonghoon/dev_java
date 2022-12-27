package dev_java.D2212.week3.date221212;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonUI {
  // 선언부
  JFrame jf = new JFrame();
  JButton jbtn_south = new JButton("전송");
  JButtonUIEvent jbtnEvent = new JButtonUIEvent(this);

  // 생성자
  public JButtonUI() {
    initDisplay();
  }

  // 화면처리부
  public void initDisplay() {
    // 이벤트 소스와 이벤트 핸들러 매핑시 this를 쓸 수 있는 건
    // 오직 내안의 actionPerformed가 구현되어 있을떄 뿐임
    jbtn_south.addActionListener(jbtnEvent);
    // 윈도창 X버튼 클릭시 자원반납 - 어플정상 종료
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.add("South", jbtn_south);
    jf.setSize(300, 200);
    jf.setVisible(true);
  }

  public static void main(String[] args) {
    new JButtonUI();
  }
}

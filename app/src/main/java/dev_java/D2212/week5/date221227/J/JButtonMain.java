package dev_java.D2212.week5.date221227.J;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonMain implements ActionListener {
  // 선언부
  JFrame jf = new JFrame();
  JButton jbtn_south = new JButton("전송");

  // 생성자
  public JButtonMain() {
    initDisplay();
  }

  // 화면처리부
  public void initDisplay() {
    // 이벤트 소스와 이벤트 핸들러 매핑시 this를 쓸 수 있는 건-이벤트구현체클래스
    // 오직 내안에 actionPerformed가 구현되어 있을때 뿐임
    // JButtonMain은 화면을 출력하는것과 동시에 이벤트 처리를 담당하는 클래스란 뜻
    jbtn_south.addActionListener(this);// this가 가리키는건 JButtonMain
    // 윈도창 x버튼 클릭시 자원반납 - 어플정상 종료
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.add("South", jbtn_south);
    jf.setSize(300, 250);
    jf.setVisible(true);
  }

  // 실행 순서
  // 35-37-15(11,12초기화-이른인스턴스화)-16-20~29-
  //
  // 메인메소드
  public static void main(String[] args) {
    JFrame.setDefaultLookAndFeelDecorated(true);
    new JButtonMain();
  }

  @Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == jbtn_south) {
			System.out.println(jbtn_south.getText() + "버튼 클릭");
		}

	}
}
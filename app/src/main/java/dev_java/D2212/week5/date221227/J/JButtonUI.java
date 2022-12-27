package dev_java.D2212.week5.date221227.J;

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
		// 이벤트 소스와 이벤트 핸들러 매핑시 this를 쓰는 것 대신
		// 이벤트 처리를 담당하는 핸들러 클래스의 인스턴스변수 사용가능함
		jbtn_south.addActionListener(jbtnEvent);
		// 윈도창 x버튼 클릭시 자원반납 - 어플정상 종료
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add("South", jbtn_south);
		jf.setSize(300, 250);
		jf.setVisible(true);

	}
	public static void main(String[] args) {
		new JButtonUI();
	}
}

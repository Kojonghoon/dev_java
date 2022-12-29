package dev_java.D2212.week5.date221228;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// DeamonThreadTest.java -> DeamonThreadTest.class,  DeamonThreadTest$1.class(익명클래스)
//node.js, ES5,6,7 arrow fuction, 람다식, 최신문법
public class DeamonThreadTest {
	JButton jbtn = new JButton("전송");

	public DeamonThreadTest() {
		jbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.out.println("전송 버튼 클릭");
			}// end of actionPerformed
		});
	}

	public static void main(String[] args) {
		Thread th = new Thread() {
			public void run() {
				try {
					Thread.sleep(5000);
					System.out.println("MyThread 종료");
				} catch (InterruptedException e) {

				}
			}
		};
		// 데몬 스레드로 설정함.
		// 아래와 같이 데몬스레드를 설정하면 내부의 모든 스레드가 종료되지 않아도 어플리케이션이 종료된다.
		th.setDaemon(true);// false로 하면 MyThread 종료가 출력된다. 이문장이 없으면 false와 결과같음.
		th.start();
		System.out.println("main() 종료");
	}/////////////// end of main
}
/*
 * 상황에 따라 분리된 스레드로 백그라운드 작업을 해야 하는 경우도 있다.
 * JVM안의 가비지 컬렉션과 같은 작업이 대표적이다.
 * 이런 백그라운드 작업이 일반 스레드로 설정되어 있다면 전원이 종료되거나 사용자가 강제 종료하지 않는 한
 * 애플리케이션은 영원히 정지 하지 않을 것이다.
 */
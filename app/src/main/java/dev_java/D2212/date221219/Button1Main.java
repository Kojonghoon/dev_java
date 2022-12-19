package dev_java.D2212.date221219;

import java.awt.event.ActionEvent;
//java.lang 패키지가 아닌것은 모두 import 사용함
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class Button1 extends JFrame {
  // 선언부
  Button1Event bevent = new Button1Event(this); // 상속, 추상클래스 중심, 인터페이스 중심 코딩 전개
  // 게으른 인스턴스화
  // 북쪽 배치
  JButton jbtn_ins = null; // 선언만 했다. 생성자 호출 안됨
  // 이른 인스턴스화
  // 남쪽 배치
  JButton jbtn_upd = new JButton("수정"); // 선언및 생성 동시에 생성자 호출까지 일어남
  // 생성자

  Button1() {
    jbtn_upd.addActionListener(bevent);
    System.out.println("Button1디폴트 생성자 호출" + jbtn_ins);
    // 생성자 안에서 버튼객체를 생성하면 뭐가 다르지? 어떻게 다른걸까? - 시점에 따라 NullPointerException 발생
    initDisplay(); // new Button1()이 호출되면 자동으로 호출이 일어남
    System.out.println("initDisplay 호출 후 " + (jbtn_ins == null));
    jbtn_ins = new JButton("입력");
    System.out.println("입력버튼 생성 후 ==> " + (jbtn_ins == null));
  }

  // 화면처리부
  public void initDisplay() {
    System.out.println("initDisplay 호출 성공");
    // 동쪽 배치
    JButton jbtn_del = new JButton("삭제");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    if (jbtn_ins != null) {
      this.add("North", jbtn_ins);
    }
    this.add("South", jbtn_upd);
    this.add("East", jbtn_del);
    this.setSize(400, 300);
    this.setVisible(true);

  }

}

// ActionListener의 구현체 클래스이다 - 이벤트 핸들러 클래스
// 인터페이스는 추상메소드만 가진다.
class Button1Event implements ActionListener {

  Button1 button1 = null;
  // Button1 button1 = new Button1(); 이렇게 하면 원본이 아니고 복사본이라서 주소값 달라서 안됨!

  public Button1Event(Button1 button1) {

    this.button1 = button1;

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    Object obj = e.getSource();
    // 너 수정버튼 누른거야?
    if (obj == button1.jbtn_upd) {
      System.out.println("수정버튼 클릭");
    }
  }

}

public class Button1Main {
  public static void main(String[] args) {

    Button1 b1 = new Button1(); // 선언,생성 동시에 Button1() 생성자 호출됨!
    // Button1 b2 = new Button1(); 다른 주소값으로 생성됨
    // Button1 b3 = new Button1();

  }

}
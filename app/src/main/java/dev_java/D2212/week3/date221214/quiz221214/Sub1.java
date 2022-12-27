package dev_java.D2212.week3.date221214.quiz221214;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
//기본패키지인 java.lang이외에는 모두 import필요함
//인터페이스를 implements하면 반드시 추상메소드를 재정의 해야함 - overriding라고 함
import java.awt.event.ActionEvent;

public class Sub1 implements ActionListener {
  // 선언부 - 전역변수의 위치
  // 선언에서 결절되는 건 무엇입니까? - 타입만 결정됨
  // 원시형은 필드와 메서드를 가질수 없다
  // 원시형은 부르면 값이 나온다.
  // 참조형은 부르면 주소번지가 나온다
  // 원시형 에서는 NullPointerException X
  // sub1.insert();
  JDialog jdg = new JDialog();
  JButton jbtn = new JButton("저장");
  Main1 main1 = null; // 선언만 했다 - null의미는 결정되는 않았다. 원본을 사용하겠다는 뜻
  // Main1 main1 = new Main1();// 선언도 했고 생성도 했고 생성자도 호출한다. - 복제본이 만들어짐
  // public Sub1(){}

  public Sub1(Main1 main1) { // Main1 main1 = null 의미됨
    System.out.println(main1);
    if (main1 == null)
      System.out.println("main1은 null입니다. 객체생성안된 상태임");
    // 나는 언제 호출 되나요? - 메인앱이 실행될때
    // 나는 어디서 호출 되나요? - Main1클래스에서
    // 나는 왜 호출하는거죠? - 입력을 눌렀을 때, 주문을 할때, 회원가입을 할때
    this.main1 = main1;// 객체 치환
    initDisplay();
  }

  public void initDisplay() {
    jbtn.addActionListener(this);
    jdg.add("South", jbtn);
    jdg.setTitle("Sub1");
    jdg.setSize(300, 400);
    jdg.setVisible(true);
  }

  int insert() {// 1: 입력성공, 0 : 입력실패
    // insert 메소드에서 main1사용이 불가하다 - 지변이니까
    return 1;
  }

  public static void main(String[] args) {
    // new Sub1();
    new Sub1(null); // sub1만 단독 테스트
    // new Main1();
  }

  /****************
   * 콜백메소드라고 부른다
   * 저장버튼이 클릭되었을때 JVM이 이를 감지하고 인터셉트 하여 메소드 호출을 해줌
   * 파라미터인 ActionEvent객체를 통해서 이벤트가 감지된 버튼을 구분할 수 있음.
   * 이 객체는 파라미터에 있으므로 JVM으로 부터 주입이 되는 객체이다.
   * 다시말해 개발자가 인스턴스화 하지 않고 JVM이 대신 해준다
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    // 너 저장버튼 누른거야?
    Object obj = e.getSource();
    // 반복문을 탈출할 떄는 break문을 사용하고
    // 조건문을 탈출할 때는 return을 사용함
    if (obj == jbtn) {
      int result = insert();
      if (result == 1) {
        JOptionPane.showMessageDialog(jdg, "입력 성공하였습니다.");
        main1.refresh();
        jdg.dispose();
      } else if (result == 0) {
        JOptionPane.showMessageDialog(jdg, "입력 실패하였습니다.");
        return;// actionPerformed를 탈출함
      }
    }
  }
}

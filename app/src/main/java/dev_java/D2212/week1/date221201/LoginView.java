package dev_java.D2212.week1.date221201;
//java.lang폴더에 없는 클래스는 모두 import문을 작성함
import javax.swing.JFrame;

public class LoginView {
  public static void main(String[] args) {
    // 윈도우 운영체제안에서 창을 만들어 띄울 때 사용하는 클래스 임
    JFrame jf_login = new JFrame();
    // 로그인창의 가로길이를 담는 변수 선언
    int width = 300;
    width = 500;
    // 로그인창의 세로길이를 담는변수 선언
    int height = 200;
    // 내가 만든 창의 타이틀바에 문자열찍기
    jf_login.setTitle("로그인화면ver2.0");
    // 내가 만든 창의 가로와 세로크를 정해주는 메소드 호출
    jf_login.setSize(width, height);
    jf_login.setVisible(true);
    Return1 r1 = new Return1();
    // 내가 만든 창의 화면에 활성화 또는 비활성화
    jf_login.setVisible(r1.isView1());
  }

}

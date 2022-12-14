package dev_java.D2212.week5.date221227;

import javax.swing.JFrame;

public class BananaServer extends JFrame {
  // 생성자
  BananaServer() {
    initDisplay();
  }

  BananaServer(String title) {
    super(title);
    initDisplay(title);
    // 아래서 this는 BananaServer를 가리키는 것임
    // this(title);자기자신을 호출하는 것이므로 에러임
  }

  public void initDisplay(String title) {
    this.setTitle(title);
    this.setSize(400, 300);
    this.setVisible(true);
  }

  public void initDisplay() {
    this.setTitle("바나나톡");
    this.setSize(400, 300);
    this.setVisible(true);
  }

  // this는 클래스 쪼개기 즉 화면과 로직의 분리 또는 하나의 클래스를 여러개의 클래스로
  // 나누어(분업) 처리할 때만 필요함 -this(), this("안녕") - 실무에서 사용할 일이 없다.
  public static void main(String[] args) {
    // 생성자 호출하기
    // new BananaServer();
    // 생성자 파라미터에는 this말고도 다른 타입을 사용가능함 - String
    new BananaServer("생성자 파라미터로 제목을 결정함 - 초기화");
  }
}
/*
 * 관전포인트
 * initDisplay를 메인메소드에서 호출하는 것과 생성자 안에서 호출하는 것이 가능하다
 * 그렇다면 둘의 차이는 있나? 혹은 없나?
 * 작업지시서
 * 키위톡은 메인메소드에서 initDisplay호출함
 * 바나나톡은 생성자에서 initDisplay호출함
 */
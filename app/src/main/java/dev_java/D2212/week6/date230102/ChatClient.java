package dev_java.D2212.week6.date230102;

import java.net.InetAddress;
import java.net.Socket;

public class ChatClient {
  public void client() {
    int port = 3000;
    String serverIP = null;
    // java.net, java.io 인터넷회선 장애 문제발생 원인
    // io 생성시에 소켓을 통해 인스턴스화를 하니까 의존관계있다.
    // 이런패키지는 반드시 예외처리 할 것(Thread - 인터셉트를 당할 수 있다.- 제어권을 뺴앗김)
    //Object마다 lock flag값이 있어서 스레드가 점유하면 잠금- 다른 스레드 사용불가
    //데드락 상태에 빠질 수 있다.(안에서 잠금으로 다른 스레드가 사용불가)
    //한정된 자원을 여러 사람이 이용하기 위해 제공되는 클래스가 Thread
    //Thread.sleep(), join, yield, intrecept....

    try {
      System.out.println(InetAddress.getLocalHost().getHostAddress());
      Socket socket = new Socket(serverIP, 3000);
    } catch (Exception e) {
      //에러메시지에대한 히스토리를 기억하고 라인번호와 함꼐 이력을 출력해줌
      //디버깅시에 꼭 필요
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {
    ChatClient cc = new ChatClient();
    cc.client();
  }
}

package dev_java.D2212.week5.date221230T;

import java.net.ServerSocket;
import java.net.Socket;

public class NetworkServer {
	public void server() {
		int port = 3000;
		ServerSocket server = null;
		try {
			server = new ServerSocket(port);
			System.out.println("서버 소켓 생성되었습니다.");
			// 대기상태가 진행됨 - 이 뒤에 있는 코드는 진행이 안된다 - wait상태
			while (true) {
				// 언제 이 코드로 진입하는가? - while 문
				Socket client = server.accept();
				System.out.println("client : " + client);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		NetworkServer ns = new NetworkServer();
		ns.server();
	}

}
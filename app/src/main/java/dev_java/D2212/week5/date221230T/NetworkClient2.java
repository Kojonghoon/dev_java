package dev_java.D2212.week5.date221230T;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class NetworkClient2 {
	public void client() {
		int port = 3000;
		String serverIP = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
			serverIP = "127.0.0.1";
			Socket socket = new Socket(serverIP, port);
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			System.out.println("NetworkClient socket " + socket);
			oos.writeObject("100#NetworkClient_2");
			String msg = (String) ois.readObject();
			System.out.println("client msg : " + msg);
		} catch (Exception e) {
			System.out.println("NetworkClient client " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		NetworkClient2 nc = new NetworkClient2();
		nc.client();
	}

}
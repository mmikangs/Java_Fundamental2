package java_20190617;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketScanDemo extends Thread {

	public void run() {
		Socket s = null;

		for (int i = 20; i < 65535; i++) {

			try {
				// Socket 객체가 생성 되었다는 이야기는 host, port로 통신할 수 있기 때문에
				// 해당 host, port를 사용중이다는 얘기다.
				s = new Socket("127.0.0.1", i);
				System.out.println(i + "번호를 사용중입니다.");

			} catch (UnknownHostException e) {

				System.out.println("해당 호스트가 잘못 되었습니다.");
				// TODO: handle exception
			} catch (IOException e) {

				System.out.println(i + "번호가 사용중입니다.");
			}

		}

	}

	public static void main(String[] args) {

		SocketScanDemo s = new SocketScanDemo();
		s.start(); 

	}

}

package java_20190618.multicastserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import java_20190618.unicastserver.UnicastServer;

public class MultiServer {
	
	private ServerSocket serverSocket;
	private ArrayList<MultiServerThread> list;
	
	public MultiServer(int port) {
		
		list = new ArrayList<MultiServerThread>();

		// 해당 포트를 사용하고 있을 때 에러가 발생한다.
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			System.out.println(port + "번호를 사용하고 있습니다.");
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);

		}
		MultiServerThread mst = null;

		
		while (true) {
			System.out.println("클라이언트 접속을 대기하고 있습니다.");
			Socket socket = null;

			try {
				socket = serverSocket.accept();
				System.out.println("client ip : " + socket.getInetAddress().getHostAddress());

				mst= new MultiServerThread(socket, list);
				
				list.add(mst);
				
				
				Thread t = new Thread(mst);
				t.start();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				
			}

		}
	}
	public static void main(String[] args) {

		//UnicastServer us = new UnicastServer(3002) ; <= 이 변수를 재사용에서 사용하지 않을 것이기 때문에 따로 선언할 필요가 없다. 
		new UnicastServer(3003);

	}
}

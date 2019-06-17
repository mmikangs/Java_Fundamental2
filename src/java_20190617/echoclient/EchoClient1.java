package java_20190617.echoclient;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient1 {

	private String ip;
	private int port;
	private Socket socket;

	public EchoClient1(String ip, int port) {
		this.ip = ip;
		this.port = port;

		// 3.4. 클라이언트 Socket 객체를 생성한다.
		try {
			socket = new Socket(ip, port);

			// 4.5 서버와 TCP 커넥션이 만들어지면서 클라이언트와 통신할 수 있는 Socket 객체가 생성된다.

			// 6.서버에게 메세지를 보낸다.
			OutputStream out = socket.getOutputStream();
			
			
			//6-1 
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("졸려 ㅋㅋㅋㅋㅋㅋㅋ!!!!~!");
			bw.newLine();
			bw.flush();
			
			
	
			// 9. 서버로부터 메세지를 받는다.
			InputStream in = socket.getInputStream();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new EchoClient1("192.168.0.162", 3001);

	}
}

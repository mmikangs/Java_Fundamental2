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

		// 3.4. Ŭ���̾�Ʈ Socket ��ü�� �����Ѵ�.
		try {
			socket = new Socket(ip, port);

			// 4.5 ������ TCP Ŀ�ؼ��� ��������鼭 Ŭ���̾�Ʈ�� ����� �� �ִ� Socket ��ü�� �����ȴ�.

			// 6.�������� �޼����� ������.
			OutputStream out = socket.getOutputStream();
			
			
			//6-1 
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("���� ��������������!!!!~!");
			bw.newLine();
			bw.flush();
			
			
	
			// 9. �����κ��� �޼����� �޴´�.
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

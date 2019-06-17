package java_20190617.echoserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer2 {

	private int port;
	private ServerSocket ServerSocket;

	public EchoServer2(int port) {

		this.port = port;

		try {
			ServerSocket = new ServerSocket(port);

			Socket socket = ServerSocket.accept();

			InetAddress ia = socket.getInetAddress();
			String ip = ia.getHostAddress();
			System.out.println(ip + "접속했습니다");

			InputStream in = socket.getInputStream();

			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			String readLine = br.readLine();

			System.out.println(readLine);

			OutputStream out = socket.getOutputStream();

			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write(readLine);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new EchoServer2(3001);

	}

}

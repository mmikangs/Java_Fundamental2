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

		// 3.4. 適虞戚情闘 Socket 梓端研 持失廃陥.
		try {
			socket = new Socket(ip, port);

			// 4.5 辞獄人 TCP 朕学芝戚 幻級嬢走檎辞 適虞戚情闘人 搭重拝 呪 赤澗 Socket 梓端亜 持失吉陥.

			// 6.辞獄拭惟 五室走研 左浬陥.
			OutputStream out = socket.getOutputStream();
			
			
			//6-1 
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("噌形 せせせせせせせ!!!!~!");
			bw.newLine();
			bw.flush();
			
			
	
			// 9. 辞獄稽採斗 五室走研 閤澗陥.
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

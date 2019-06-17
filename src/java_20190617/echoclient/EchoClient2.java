package java_20190617.echoclient;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient2 {

	
	private String ip;
	private int port;
	private Socket socket;
	
	
	public EchoClient2(String ip, int port){
		this.ip = ip;
		this.port = port;
		
		
		
		try {
			socket = new Socket (ip, port);
			
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("도레미파솔라시도");
			bw.newLine();
			bw.flush();
			
		
			InputStream in = socket.getInputStream();
					
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
			
			// TODO: handle exception
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}
}

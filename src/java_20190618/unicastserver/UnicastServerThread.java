package java_20190618.unicastserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class UnicastServerThread implements Runnable {
	private Socket socket;

	public UnicastServerThread(Socket socket) {
		this.socket = socket;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean isStop = false;
		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			InputStream in = socket.getInputStream();
			br = new BufferedReader(new InputStreamReader(in));

			OutputStream out = socket.getOutputStream();
			pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(out)), true);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (!isStop) {
			try {
				String readLine = br.readLine();
				if (readLine != null && readLine.equals("exit")) {
					isStop = true;
				}
				System.out.println(readLine);
				pw.println(readLine);

			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("강제로 나가지 마세요.");
				isStop = true;
			}

		}
		try {

			if (br != null) br.close();
			if (pw != null) pw.close();
			if (socket != null)	socket.close();

		} catch (IOException e) 
		{
			e.printStackTrace();

		}

	}

}
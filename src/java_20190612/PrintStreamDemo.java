package java_20190612;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		try {
			fis = new FileInputStream("C:\\down\\BANDIZIP-SETUP-KR.EXE");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("C:\\down\\2019\\BANDIZIP-SETUP-KR.EXE");
			bos = new BufferedOutputStream(fos);
			
			//PrintStream의 목적지 파일 
			//flush안하려고 printstream사용하는데 굳이 한번 더 해서 autoflush하기에는 너무 복잡해.
			//목적지가 파일이 아니라 모니터인 경우가 있기 때문에.
			ps = new PrintStream(bos,true);//true = > autoFlush
			
			int readByteCount = 0;
			byte[] readBytes = new byte[1024];
			
			while((readByteCount = bis.read(readBytes))!=-1) {
				ps.write(readBytes, 0, readByteCount);
				
			}
			
			
			//PrintStream의 목적지는 모니터
			PrintStream ps1 = System.out;
			ps1.println(1);
			ps1.println("취뽀하자.");
			ps1.println(43.6);
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			try {
				if (fis != null) fis.close();
				if (bis != null) bis.close();
				if (fos != null) fos.close();
				if (bos != null) bos.close();
				if (ps != null) ps.close();

			} catch (IOException e) {
				e.printStackTrace();

			}
		
		
			
		
	}
	}
}

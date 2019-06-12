package java_20190612;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputOuputDemo {

	public static void main(String[] args) {
		
		//ctrl+shift+O
		//BUFFER에 공간이 차지 않으면 
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("C:\\down\\BANDIZIP-SETUP-KR.EXE");
			//stream chaining
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("C:\\down\\2019\\BANDIZIP-SETUP-KR.EXE");
			bos = new BufferedOutputStream(fos);
			
			
			int readByteCount = 0;
			byte[] readBytes = new byte[10240];
			
			while((readByteCount = bis.read(readBytes))!=-1) {
				bos.write(readBytes, 0, readByteCount);
			}
				bos.flush();
			
			}  catch (IOException e) {
				e.printStackTrace();

				// TODO: handle exception
			} finally {
				try {
					if (fis != null) fis.close();
					if (bis != null) bis.close();
					if (fos != null) fos.close();
					if (bos != null) bos.close();

				} catch (IOException e) {
					e.printStackTrace();

				}

			}
	}
}
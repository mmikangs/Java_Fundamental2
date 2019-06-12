package java_20190611;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputDemo {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("C:\\down\\BANDIZIP-SETUP-KR.EXE");
			//fin = new FileInputStream("C:\\down\\java-5.pdf");
			//디렉토리를 만들어주는 것은 아님!!!!!
			//위의 경로에 파일을 생성해주고 해당 경로가 없으면 FileNotFoundException 예외를 발생시킨다. 
			fos = new FileOutputStream("C:\\down\\2019\\BANDIZIP-SETUP-KR.EXE");


			/*int readByte = 0;
				
			
			while ((readByte = fin.read()) != -1) {
				fos.write(readByte);
			}
*/
			long start = System.currentTimeMillis();
			
			int readByteCount = 0;
			byte[] readBytes = new byte[102400];
			while((readByteCount = fis.read(readBytes))!= -1){
				fos.write(readBytes,0,readByteCount);
			}
				
			long end = System.currentTimeMillis();
			
			System.out.println("경과시간 : "+(end-start));
			
			
			}catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		}finally{
				try {
					if(fis != null) fis.close();
					if(fos != null) fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	
		}
	}

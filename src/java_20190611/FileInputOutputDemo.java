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
			//���丮�� ������ִ� ���� �ƴ�!!!!!
			//���� ��ο� ������ �������ְ� �ش� ��ΰ� ������ FileNotFoundException ���ܸ� �߻���Ų��. 
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
			
			System.out.println("����ð� : "+(end-start));
			
			
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

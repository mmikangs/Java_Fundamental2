package java_20190612;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutTestDemo {

	public static void main(String[] args) {

		FileInputStream fin = null;
		FileOutputStream fos = null;

		try {

			fin = new FileInputStream("C:\\down\\BANDIZIP-SETUP-KR.EXE");
			fos = new FileOutputStream("C:\\down\\2019\\BANDIZIP-SETUP-KR.EXE");

			int readByteCount = 0;
			byte[] readBytes = new byte[1020400];
			while ((readByteCount = fin.read(readBytes)) != -1) {
				fos.write(readBytes, 0, readByteCount);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

			// TODO: handle exception
		} catch (IOException e) {
			e.printStackTrace();

			// TODO: handle exception
		} finally {
			try {
				if (fin != null)
					fin.close();
				if (fos != null)
					fos.close();

			} catch (IOException e) {
				e.printStackTrace();

			}

		}

	}
}

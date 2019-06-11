package java_20190611;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputDemo {

	public static void main(String[] args) {

		try {
			FileInputStream fin = new FileInputStream("C:\\down\\Git-2.21.0-64-bit.exe");
			FileOutputStream fos = new FileOutputStream("C:\\down\\2019\\06\\11\\Git-2.21.0-64-bit.exe");

			int readByte = 0;
			while ((readByte = fin.read()) != -1) {
				fos.write(readByte);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}

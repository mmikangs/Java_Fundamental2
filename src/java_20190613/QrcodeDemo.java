package java_20190613;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QrcodeDemo {

	public void execute(boolean isTrue) throws WriterException, IOException {

		QRCodeWriter writer = new QRCodeWriter();

		BitMatrix qrCode = writer.encode("http://blog.naver.com/katey095", BarcodeFormat.QR_CODE, 300, 300);
		BufferedImage qrImage = MatrixToImageWriter.toBufferedImage(qrCode);

		File f = new File("C:\\down\\checkqrcode.png");
		boolean isSuccess = ImageIO.write(qrImage, "PNG", f);
		System.out.println(isSuccess);
	}

	public static void main(String[] args) throws WriterException, IOException {

		QrcodeDemo q = new QrcodeDemo();
		boolean isTrue = false;

		q.execute(isTrue);

	}
}

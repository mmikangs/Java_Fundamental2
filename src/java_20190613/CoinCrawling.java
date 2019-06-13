package java_20190613;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoinCrawling {

	public static void main(String[] args) {

		HSSFWorkbook workbook = new HSSFWorkbook(); // �� ���� ����
		HSSFSheet sheet = workbook.createSheet("��Ʈ����"); // �� ��Ʈ(Sheet) ����

		// HSSFRow row = null;
		// HSSFCell cell = null;

		String ur1 = "https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20180613&end=20190613";

		// ��ü HTML������ �����ϱ� ���� ��ü (CTRL+SHIFT+O)
		Document doc = null;

		try {
			// url�ּҿ� get ������� ����
			doc = Jsoup.connect(ur1).get();

		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		// headElements�� Ÿ��Ʋ ���� �������� ���� Elements
		Elements headElements = doc.select(".table-responsive .table thead tr");

		// bodyElements�� �ǵ����� ������ �������� ���� Elements
		Elements bodyElements = doc.select(".table-responsive .table tbody tr");

		int rowIndex = 0;

		HSSFRow row = null;
		HSSFCell cell = null;

		for (int i = 0; i < headElements.size(); i++) {
			row = sheet.createRow(rowIndex++);

			Element e = (Element) headElements.get(i); // <tr>
			String date = e.child(0).text(); // e.child(0) => <th>

			cell = row.createCell(0);
			cell.setCellValue(date);

			String open = e.child(1).text();

			cell = row.createCell(1);
			cell.setCellValue(open);

			String high = e.child(2).text();
			cell = row.createCell(2);
			cell.setCellValue(high);

			String low = e.child(3).text();
			cell = row.createCell(3);
			cell.setCellValue(low);

			String close = e.child(4).text();

			cell = row.createCell(4);
			cell.setCellValue(close);

			String volume = e.child(5).text();

			cell = row.createCell(5);
			cell.setCellValue(volume);

			String marketCap = e.child(6).text();
			cell = row.createCell(6);
			cell.setCellValue(marketCap);

			System.out.printf("%s\t\t%s\t%s\t%s\t%s\t%s\t\t%s\n", date, open, high, low, close, volume, marketCap);

		}

		for (int i = 0; i < bodyElements.size(); i++) {
			row = sheet.createRow(rowIndex++);
			Element e = (Element) bodyElements.get(i); // <tr>
			String date = e.child(0).text(); // e.child(0) => <th>

			cell = row.createCell(0);
			cell.setCellValue(date);

			String open = e.child(1).text();

			cell = row.createCell(1);
			cell.setCellValue(date);

			String high = e.child(2).text();
			cell = row.createCell(2);
			cell.setCellValue(high);

			String low = e.child(3).text();
			cell = row.createCell(3);
			cell.setCellValue(low);

			String close = e.child(4).text();

			cell = row.createCell(4);
			cell.setCellValue(close);

			String volume = e.child(5).text();

			cell = row.createCell(5);
			cell.setCellValue(volume);

			String marketCap = e.child(6).text();
			cell = row.createCell(6);
			cell.setCellValue(marketCap);
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", date, open, high, low, close, volume, marketCap);
		}

		try {
			FileOutputStream fileoutputstream = new FileOutputStream("C:\\down\\swi11m.xls");
			workbook.write(fileoutputstream);
			fileoutputstream.close();
			System.out.println("�������ϻ�������");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("�������ϻ�������");
		}

	}
}

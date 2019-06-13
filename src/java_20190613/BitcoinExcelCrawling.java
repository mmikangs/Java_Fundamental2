package java_20190613;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class BitcoinExcelCrawling {

 public static void main(String[] args)  {

// Declare a variable 'filePath' with Datatype String to store the path of the file.   
       String filePath="C:\\down\\gogo.xls";
 
       HSSFWorkbook workbook = new HSSFWorkbook(); // �� ���� ����
       HSSFSheet sheet = workbook.createSheet("sheet1"); // �� ��Ʈ(Sheet) ����
       HSSFRow row = sheet.createRow(0); // ������ ���� 0������ ����
       HSSFCell cell = row.createCell(0); // ���� ���� 0������ ����
       cell.setCellValue("data"); //������ ���� ������ ����
       try {
           FileOutputStream fileoutputstream = new FileOutputStream("C:\\down\\gogo.xls");
           workbook.write(fileoutputstream);
           fileoutputstream.close();
           System.out.println("�������ϻ�������");
       } catch (IOException e) {
           e.printStackTrace();
           System.out.println("�������ϻ�������");
       }

}
}

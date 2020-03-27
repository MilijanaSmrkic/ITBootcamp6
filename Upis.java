package apachePOI;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*; // a bio je row
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Upis {

	public static void main(String[] args) {
		// xssf- novije ili hssf- za starije verzije

		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("osobe");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("id");
		cell = row.createCell(1);
		cell.setCellValue("ime i prezime");

		// upisivanje ovoga u fajl

		try {
			FileOutputStream os = new FileOutputStream("osobe.xls"); // biramo surround with try/catch
			wb.write(os); // biramo add catch clause
			wb.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

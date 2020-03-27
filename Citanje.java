package apachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class Citanje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HSSFWorkbook wb;
		FileInputStream fi; // da procitamo iz excel fajla
		try { // try(FileInputStream fi= new FileInputStream("osobe.xls"), HSSFWorkbook wb=new
				// HSSFWorkbook(fi)) {
			fi = new FileInputStream("osobe.xls");
			wb = new HSSFWorkbook(fi);

			Sheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(1);

			System.out.println(cell.toString());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// finally {
		// fi.close(); // moze da se opkruzi sa try catch ali mora gore da se
		// inicijalizuje fi=null; ili ovako
		// }

	}

}

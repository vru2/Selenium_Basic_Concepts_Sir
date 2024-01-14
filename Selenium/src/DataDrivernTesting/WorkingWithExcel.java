package DataDrivernTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingWithExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\raki9\\OneDrive\\Documents\\SeleniumWeekendBatch2\\Book1.xlsx");
		//To access workbook
		Workbook book = WorkbookFactory.create(fis);
		//To access sheet
		Sheet sh=book.getSheet("Sheet2");
		//To access row
//		Row row=sh.getRow(0);
//		//To access cell
//		Cell cell=row.getCell(0);
//		//To fetch the data in String format
//		String value=cell.getStringCellValue();
//		System.out.println(value);
//		//To fetch the data number format
//		double numberValue = sh.getRow(2).getCell(0).getNumericCellValue();
//		System.out.println(numberValue);
		
		//To fetch the cell value in String format
//		String data=sh.getRow(0).getCell(0).toString();
//		System.out.println(data);
//		String data1=sh.getRow(2).getCell(0).toString();
//		System.out.println(data1);
		
		System.out.println(sh.getPhysicalNumberOfRows());
		System.out.println(sh.getRow(0).getPhysicalNumberOfCells());
		
	}

}

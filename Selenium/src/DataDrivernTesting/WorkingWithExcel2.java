package DataDrivernTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingWithExcel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\raki9\\OneDrive\\Documents\\SeleniumWeekendBatch2\\Book1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		
		Sheet sh=book.getSheet("Sheet3");
		
		System.out.println(sh.getRow(0).getCell(0).toString());
		
		sh.getRow(0).getCell(0).setCellValue("123selenium");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\raki9\\OneDrive\\Documents\\SeleniumWeekendBatch2\\Book1.xlsx");
		
		book.write(fos);
		fos.flush();
	}
}

package DataDrivernTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingWithExcel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\raki9\\OneDrive\\Documents\\SeleniumWeekendBatch2\\Book1.xlsx");
		//To access workbook
		Workbook book = WorkbookFactory.create(fis);
		//To access sheet
		Sheet sh=book.getSheet("Sheet2");
		//To fetch the last row number
		int lastRowNum=sh.getPhysicalNumberOfRows();
		//To fetch the last cell number
		int lastCellNum=sh.getRow(0).getPhysicalNumberOfCells();
		
		for(int i=0;i<lastRowNum;i++)
		{
			for(int j=0;j<lastCellNum;j++)
			{
				String value=sh.getRow(i).getCell(j).toString();
				System.out.print(value+" ");
			}
			System.out.println();
		}

	}

}

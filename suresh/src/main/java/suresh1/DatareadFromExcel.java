package suresh1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class DatareadFromExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./facebookuserpwd.xlsx");
		Workbook wbf = WorkbookFactory.create(fis);
		Sheet gs = wbf.getSheet("Sheet1"); 
		 Row row = gs.getRow(1);
		 Cell cell = row.getCell(0);
		String value = cell.getStringCellValue();
		
		/*		for(int i=0;i <=1;i++) {
			for(int j=1;j<=10; j++) {
			String value = wbf.getSheet("sheet1").getRow(j).getCell(i).getStringCellValue();
			System.out.println(value);
			}
			}*/
		
	}

}

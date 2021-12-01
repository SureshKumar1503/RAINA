package mock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("./Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=9;j++) {
				
				String value = wb.getSheet("Sheet1").getRow(j).getCell(i).getStringCellValue();
				System.out.println(value);
			}
		}
	}

}

package raina;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.BeforeMethod;

import Base.IpathConstants;

public class excelutility {

	@BeforeMethod
	public String readexcelutility(String sheet1,int row,int cell) throws IOException {
		FileInputStream fis= new FileInputStream(IpathConstants.excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		String value = wb.getSheet(sheet1).getRow(row).getCell(cell).getStringCellValue();
		return value;
		
		
		
		
	}
}

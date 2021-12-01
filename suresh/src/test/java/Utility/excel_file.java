package Utility;

import java.io.IOException;

import raina.excelutility;

public class excel_file {
	public void loginfile() throws IOException {
		excelutility fs=new excelutility();
		String excel = fs.readexcelutility("sheet1",1, 0);
		System.out.println(excel);
	}

}

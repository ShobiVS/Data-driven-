package org.sam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewXL {
	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Users\\SHOBI\\eclipse-workspace\\DataDriven\\Excel\\New.xlsx");
		Workbook wb=new XSSFWorkbook();
		Sheet newSheet = wb.createSheet("NewFile");
		Row r = newSheet.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("Selenium");
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		
		
	}

}

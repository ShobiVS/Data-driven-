package org.sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ch1 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\SHOBI\\eclipse-workspace\\DataDriven\\Excel\\SampleData.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb= new XSSFWorkbook(fis);
		Sheet mySheet = wb.getSheet("Data");
		Row particularRow = mySheet.getRow(1);
		Cell particularCell = particularRow.getCell(0);
		System.out.println(particularCell);
		
		
		
	}

}

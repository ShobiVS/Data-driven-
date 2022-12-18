package org.sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ch3 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\SHOBI\\eclipse-workspace\\DataDriven\\Excel\\Test.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet mySheet = wb.getSheet("Sheet1");
		
		for (int i = 0; i < mySheet.getPhysicalNumberOfRows(); i++) {
			Row r = mySheet.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int cellType = c.getCellType();
				if (cellType==1) {
					String cellValue = c.getStringCellValue();
					System.out.println(cellValue);
				}
				     else if (DateUtil.isCellDateFormatted(c)) {
					Date dateCellValue = c.getDateCellValue();
					SimpleDateFormat s=new SimpleDateFormat("dd-MMM-yy");
					String format = s.format(dateCellValue);
				     }
				     else {
				    	 double d = c.getNumericCellValue();
				    	 long l=(long)d;
				    	 String valueOf = String.valueOf(l);
				    	 System.out.println(valueOf);
				    	 
					
					
						
					}
						
						
					}
					
				}
				
			}
			
		
	}



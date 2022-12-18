package org.sam;

import java.io.IOException;

public class CreatingNewWb extends BaseClass {
	public static void main(String[] args) throws IOException {
		CreateNewExcelFile(0, 0, "Selenium");
		CreateCell(0, 1, "Java");
		CreateCell(0, 2, "Data Driven");
		CreateCell(0, 3, "POM");
		CreateRow(1, 0, "Appium");
		CreateCell(1, 1, "Cucumber");
		CreateCell(1, 2, "Junit");
		CreateCell(1, 3, "TestNG");
	}
	

}

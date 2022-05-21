package com.md.utilities;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelClass {
	
	public HSSFWorkbook wb;
	
	public ExcelClass() {
		File src=new File("./testdata/DataUL.xls");
		
		
			
			FileInputStream fis;
			try {
				fis = new FileInputStream(src);
				wb=new HSSFWorkbook(fis);
			} catch (Exception e) {
				
				e.printStackTrace();
				System.out.println("Unable to fetch data from workbook");
			}
			
		
	}
	
	public String getStringData(String shName,int row,int column) {
		return wb.getSheet(shName).getRow(row).getCell(column).getStringCellValue();
		
	}
	
	public double getNumberData(String shName,int row,int column) {
		return wb.getSheet(shName).getRow(row).getCell(column).getNumericCellValue();
	}

}

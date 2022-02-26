package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData1 {
	
	public static void readdata1() throws IOException {
		
		File f = new File ("/Users/admin/eclipse-workspace/Adactin/DataDriven/Testfile (1).xlsx");
		FileInputStream fis = new FileInputStream (f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet SheetAt = wb.getSheetAt(0);
		int rowsize = SheetAt.getPhysicalNumberOfRows();
		
		for (int i =0; i< rowsize; i++) {

			Row row = SheetAt.getRow(i);
			
			int cells = row.getPhysicalNumberOfCells();
			
			for (int j=0;j<cells;j++)
			{
			Cell cell = row.getCell(j);
			CellType celltype = cell.getCellType();
			
			if (celltype.equals(CellType.STRING))
			{
				String stringcellvalue = cell.getStringCellValue();
				System.out.println(stringcellvalue);
			}
			else if (celltype.equals(CellType.NUMERIC))
			{
				double numericcellvalue  = cell.getNumericCellValue();
				System.out.println(numericcellvalue);
			}
			
			else 
				
			{
				System.out.println("Invalid Data");
			}
			}
			}
		    }
			
			
			public static void main(String[] args) throws IOException

			{
				readdata1();
			}
		}
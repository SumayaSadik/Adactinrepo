package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	
	public static void readParticularData() throws IOException
	{
	
	File f = new File("/Users/admin/eclipse-workspace/Adactin/DataDriven/Testfile.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheetAt = wb.getSheetAt(0);
	Row row = sheetAt.getRow(2);
	Cell cell = row.getCell(0);
	CellType cellType = cell.getCellType();
	
	if (cellType.equals(cellType.STRING))
	{
		String stringcellvalue = cell.getStringCellValue();
		System.out.println(stringcellvalue);
		
	}
	
	else if (cellType.equals(cellType.NUMERIC))
	{
		double numericCellValue = cell.getNumericCellValue();
		int value =(int)numericCellValue;
		System.out.println(numericCellValue);
	}

	else
	{
		System.out.println("Program failed");
	}
}
	public static void main(String[] args) throws IOException
	{
		readParticularData();
	}
}
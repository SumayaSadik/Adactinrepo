package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static void  Write_Data() throws IOException

	{
		File f = new File ("/Users/admin/eclipse-workspace/Adactin/DataDriven/Testfile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		//wb.createSheet("newSheet").createRow(0).createCell(0).setCellValue("email");
		wb.getSheet("newsheet").getRow(0).createCell(1).setCellValue("Password");
		wb.getSheet("newsheet").createRow(1).createCell(0).setCellValue("riyasurana@gmail.com");
		wb.getSheet("newsheet").getRow(1).createCell(1).setCellValue(7891011);
		wb.getSheet("newsheet").createRow(2).createCell(0).setCellValue("riyaa@gmail.com");
		wb.getSheet("newsheet").getRow(2).createCell(1).setCellValue(123456);
		wb.getSheet("newsheet").createRow(3).createCell(0).setCellValue("abc@gmail.com");
		wb.getSheet("newsheet").getRow(3).createCell(1).setCellValue(2595);


		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	
	public static void main (String[] args) throws IOException
	{
		Write_Data();
		System.out.println("Sheet created sucessfully");
		
	}
}

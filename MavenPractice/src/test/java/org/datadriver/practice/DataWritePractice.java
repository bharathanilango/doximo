package org.datadriver.practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWritePractice {
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\User\\eclipse-workspace\\MavenPractice\\sampleData\\empDetails.xlsx");
		Workbook  w=new XSSFWorkbook();
		Sheet s=w.createSheet("employee");
		Row r=s.createRow(0);
		Row r1=s.createRow(1);
		Row r2=s.createRow(2);
		Row r3=s.createRow(3);
		
		Cell cc=r.createCell(0);
		Cell c1=r1.createCell(0);
		Cell c2=r2.createCell(0);
		Cell c3=r3.createCell(0);
		
		Cell cc1=r.createCell(1);
		Cell c11=r1.createCell(1);
		Cell c12=r2.createCell(1);
		Cell c13=r3.createCell(1);
		
		Cell cc2=r.createCell(2);
		Cell c21=r1.createCell(2);
		Cell c22=r2.createCell(2);
		Cell c23=r3.createCell(2);
		
		cc.setCellValue("si no");
		c1.setCellValue("name");
		c2.setCellValue("salary");
		c3.setCellValue("location");
		
		cc1.setCellValue("1");
		c11.setCellValue("bharathan");
		c12.setCellValue("10000");
		c13.setCellValue("thanjavur");
		
		cc2.setCellValue("2");
		c21.setCellValue("arun");
		c22.setCellValue("10000");
		c23.setCellValue("cuddalore");

		
		
		FileOutputStream fos=new FileOutputStream(file);
		w.write(fos);
		System.out.println("done...");
	} 
}

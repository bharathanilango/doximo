package org.datadriven.framework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWrite {
	public static void main(String[] args) throws InvalidFormatException, IOException {
		File file = new File("C:\\Users\\User\\eclipse-workspace\\MavenOctBatch\\SampleData\\FileOutput.xlsx");
		
		
		Workbook w = new XSSFWorkbook();
		
		Sheet s = w.createSheet("Input");
		
		//Rows
		Row r = s.createRow(0);
		Row r1 = s.createRow(1);
		Row r2 = s.createRow(2);
		Row r3 = s.createRow(3);
		
		//create cell for Column 1
		Cell cc = r.createCell(0);
		Cell c1 = r1.createCell(0);
		Cell c2 = r2.createCell(0);
		Cell c3 = r3.createCell(0);
		//create cell for column 2
		Cell cc1 = r.createCell(1);
		Cell c11 = r1.createCell(1);
		Cell c12 = r2.createCell(1);
		Cell c13 = r3.createCell(1);
		//create cell for column 3
		Cell cc2 = r.createCell(2);
		Cell c21 = r1.createCell(2);
		Cell c22 = r2.createCell(2);
		Cell c23 = r3.createCell(2);
		
		//set values for column 1
		cc.setCellValue("SI.No");
		c1.setCellValue("name");
		c2.setCellValue("dept");
		c3.setCellValue("rank");
		//set values for column 2
		cc1.setCellValue("1");
		c11.setCellValue("Bharathan");
		c12.setCellValue("EEE");
		c13.setCellValue("10");
		//set values for column 3
		cc2.setCellValue("2");
		c21.setCellValue("Arun");
		c22.setCellValue("Mech");
		c23.setCellValue("1");
		
		FileOutputStream fileOut = new FileOutputStream(file);
		w.write(fileOut);
		System.out.println("Done...");
	}
}

package org.datadriven.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataRead {
	public static void main(String[] args) throws IOException {
		
		//For file location
		File file = new File("C:\\Users\\User\\eclipse-workspace\\MavenOctBatch\\SampleData\\FileOutput.xlsx");
		//To read the file  by using FileInputStream class
		FileInputStream fileIn = new FileInputStream(file);
		//Workbook interface for accessing the fileIn
		Workbook w = new XSSFWorkbook(fileIn);
		//To get the particular sheet from the workbook
		Sheet s = w.getSheet("Input");
		//To get the particular row from the sheet
//		Row r = s.getRow(0);
		//To get particular cell from the row
//		Cell c = r.getCell(0);
		//To print the output in the console
//		System.out.println(c);
		
		//To get the all Rows and cells from the sheet by using iteration 
		for(int i=0; i<s.getPhysicalNumberOfRows() ; i++) {
			Row r = s.getRow(i);
			for(int j=0; j<r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				System.out.println(c);
			}
			System.out.println();
		}
	}
}

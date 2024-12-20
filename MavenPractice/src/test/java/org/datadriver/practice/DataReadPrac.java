package org.datadriver.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReadPrac {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\User\\eclipse-workspace\\MavenPractice\\sampleData\\empDetails.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook w=new XSSFWorkbook(fis);
		Sheet s=w.getSheet("employee");
		for(int i=0; i<s.getPhysicalNumberOfRows(); i++) {
			Row r=s.getRow(i);
			for(int j=0;j<r.getPhysicalNumberOfCells(); j++) {
				System.out.println(r.getCell(j));
			}
			System.out.println();
		}
	}
}

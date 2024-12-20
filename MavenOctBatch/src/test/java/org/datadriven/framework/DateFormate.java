package org.datadriven.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.hpsf.Date;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DateFormate {
	public static void main(String[] args) throws IOException {
		File sheetLocation = new File("C:\\Users\\User\\eclipse-workspace\\MavenOctBatch\\SampleData\\FileOutput.xlsx");
		FileInputStream Input = new FileInputStream(sheetLocation);
		Workbook w = new XSSFWorkbook(Input);
		Sheet s = w.getSheet("input");
		Row r = s.getRow(0);
		Cell c = r.getCell(2);
		System.out.println(c);
		CellType type = c.getCellType();
//		if (type == 1) {
//			String value = c.getStringCellValue();
//
//		}
//		if (type == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				java.util.Date d = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-mm-yyyy");
				String value = sim.format(d);
				System.out.println(value);

			} else {
				double d = c.getNumericCellValue();
				long l = (long) d;
				String value = String.valueOf(l);
				System.out.println(value);
//			}

		}
	}
}

package datadriventesting;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestData {

	public static void main (String[]args) throws Exception {
		
		FileInputStream file = new FileInputStream("D:\\files\\User ajay\\SOFT TESTING TOOL\\Untitled spreadsheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file); // we area reading this file se exel workbook.
//		xlsx -- XSSFWorkbook
//		xlx  -- HSSFWorkbook
		
		
		XSSFSheet sheet = workbook.getSheet("Data");
		int row;
		row = sheet.getLastRowNum();
		System.out.println(row);
		int column;
		column = sheet.getRow(0).getLastCellNum();
		System.out.println(column);
		for (int i = 0; i<=row ; i++) {//to itrate from  one row to another
			for (int j = 0; j <column ; j++) {//to itrate from one column to another
				String celldata = sheet.getRow(i).getCell(j).toString();
				System.out.print(celldata+"                 ");
			}
			System.out.println();
		}
		
		
		
	}
}

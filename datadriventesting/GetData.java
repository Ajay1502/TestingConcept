package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetData {

	public static void main(String[] args) throws Exception {
		GetData gtData = new GetData();
		gtData.getData();
	}
 
	public static String[][] getData() throws Exception {
		FileInputStream file = new FileInputStream("D:\\files\\User ajay\\SOFT TESTING TOOL\\Untitled spreadsheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("data");
		int row ;
		row = sheet.getLastRowNum();
		
		int column;
		column = sheet.getRow(0).getLastCellNum();
		String data[][]= new String[row][column];
		for (int i = 0; i <row;i++) {
			for (int j = 0; j <column; j++) {
	    data[i][j] = sheet.getRow(i+1).getCell(j).toString();
	    
			}
			
		}
		return data;
		
	}
}

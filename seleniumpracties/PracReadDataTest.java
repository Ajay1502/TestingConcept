package seleniumpracties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracReadDataTest {

	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("D:\\files\\User ajay\\SOFT TESTING TOOL\\Untitled spreadsheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Data");
		int row;
		row = sheet.getLastRowNum();
		System.out.println(row);
		int column;
		column = sheet.getRow(0).getLastCellNum();
        System.out.println(column);
        for (int i = 0; i <=row; i++) {
			for (int j = 0; j < column; j++) {
				String cell = sheet.getRow(i).getCell(j).toString();
				System.out.print(cell + "   ");
				
			}
			System.out.println();
		}
	}

}

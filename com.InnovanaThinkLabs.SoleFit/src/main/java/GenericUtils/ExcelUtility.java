package GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	/**
	 * read the excel data with row and column number
	 * @param sheetName
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws Throwable
	 */
	
	public String getExcelData(String sheetName, int rownum, int cellnum) throws Throwable {
		FileInputStream file = new FileInputStream(IPathConstants.EXCELPATH);
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String value = cell.getStringCellValue();
		return value;
	}
	
	/**
	 * read the data from excel sheet using the sheet name
	 * @param sheetName
	 * @return
	 * @throws Throwable
	 */
	
	 public Object[][] getExcelData(String sheetName) throws Throwable{
		 FileInputStream file = new FileInputStream(IPathConstants.EXCELPATH);
		 Workbook workbook = WorkbookFactory.create(file);
		 Sheet sheet = workbook.getSheet(sheetName);
		 int lastrow = sheet.getLastRowNum();
		 int lastcell = sheet.getRow(0).getLastCellNum();
		 Object[][] data = new Object[lastrow][lastcell];
		 
		 for(int i=0; i<lastrow; i++ ) {
			 for(int j=0; j<lastcell; j++) 
			 {
				 data[i][j] = sheet.getRow(i+1).getCell(j).getStringCellValue();
			 }
		 }
		 return data;
	
		
		
	 }
	
}
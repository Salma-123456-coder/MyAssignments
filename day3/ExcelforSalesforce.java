package week6.day3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelforSalesforce {

	public static String[][]getValue(String Filename) throws IOException {

		// Step1: Settingup the excel file / workBook
		XSSFWorkbook wb = new XSSFWorkbook("./Readdata/"+Filename+".xlsx");

		// Step2: to get the sheet from the wb
		XSSFSheet sheet = wb.getSheetAt(0);

		// Step3: to get the row value
		XSSFRow row = sheet.getRow(0);

		// System.out.println(row);

		// getLastRowNum(); - excludes the Header
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("This is the lastRowNum " +lastRowNum);

		// getPhysicalNumberOfRows(); - includes the header
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("This is the physicalNumberOfRows " +physicalNumberOfRows);

		// get the cell/column value
		XSSFCell getCell = sheet.getRow(2).getCell(1);
		System.out.println("This is the Cellvalue1 in row 2 " +getCell);

		// to get the cell value along with the header
		int physicalNumberOfCells = sheet.getRow(1).getPhysicalNumberOfCells();
		System.out.println("This is the physicalNumberOfCells " +physicalNumberOfCells);

		// getLastCellNum();
		//short lastCellNum = sheet.getRow(2).getLastCellNum();
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("This is the lastCellNum " +lastCellNum);
		
		//common integration
		//Step 1:To store the rows and columns
		String[][] data=new String[lastRowNum][lastCellNum];

		// store the cell values
		XSSFCell cell = row.getCell(1);

		// OuterLoop is for rows
		//for (int i = 1; i <= lastRowNum; i++) {

			// InnerLoop is for cell/Column
			//for (int j = 0; j < lastCellNum; j++) {
			//	String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
			//	System.out.println(data[i-1][j] =stringCellValue);
				
				//common integration
				//step 5:to store the iterated values from i & j
				
			//	data[i-1][j] =stringCellValue;
				
		// OuterLoop is for rows
		for (int i = 1; i <= lastRowNum; i++) {

		    XSSFRow currentRow = sheet.getRow(i);

		    // InnerLoop is for columns
		    for (int j = 0; j < lastCellNum; j++) {

		        XSSFCell currentCell = currentRow.getCell(j);

		        if(currentCell != null) {
		            String stringCellValue = currentCell.toString();
		            System.out.println(data[i-1][j] = stringCellValue);
		        }

		    }
		}
				
	

		wb.close();
		//common integration
		//step 2:to return the data/String[][]stored column&row values
		return data;

	}


}



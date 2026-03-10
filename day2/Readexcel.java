package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {

		public static void main(String[] args) throws IOException {

			// Step1: Settingup the excel file / workBook
			XSSFWorkbook wb = new XSSFWorkbook("./Readdata/CreateLead.xlsx");

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
			short lastCellNum = sheet.getRow(2).getLastCellNum();
			System.out.println("This is the lastCellNum " +lastCellNum);

			// store the cell values
			XSSFCell cell = row.getCell(1);

			// OuterLoop is for rows
			for (int i = 1; i <= lastRowNum; i++) {

				// InnerLoop is for cell/Column
				for (int j = 0; j < lastCellNum; j++) {
					String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.println("This is the stringCellValue " +stringCellValue);
				}

			}

		}

	

	}



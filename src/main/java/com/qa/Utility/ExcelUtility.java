package com.qa.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import Trash.ReadExcel;
import Trash.WriteExcel;

import java.util.ArrayList;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.util.NumberToTextConverter;

/**
 * @author Silampur Girish 
 * Date 09-01-2010
 * class ExcellUtility
 */

public class ExcelUtility {

	/**
	 * @author Silampur Girish 
	 * Method to writeExcel 
	 * description it write the column wise data in the row 
	 * Date 09-01-2020
	 * para fileName;sheetName;Writedta
	 *  example [List<String> supplierNames = Arrays.asList("Girish","Shilpa","Cherry");]
	 */
	public void writeExcel(String fileName,String sheetName,List<String> Writedta) throws IOException{
		String filePath = (System.getProperty("user.dir")+".\\src\\main\\java\\com\\qa\\Resource\\AppdataExcell");
		File file =    new File(filePath+"\\"+fileName);		
		FileInputStream inputStream = new FileInputStream(file);
		Workbook TestdataWorkbook = null;		
		String fileExtensionName = fileName.substring(fileName.indexOf("."));		
		if(fileExtensionName.equals(".xlsx")){

			TestdataWorkbook = new XSSFWorkbook(inputStream);
		}

		else if(fileExtensionName.equals(".xls")){

			TestdataWorkbook = new HSSFWorkbook(inputStream);
		}   	

		Sheet sheet = TestdataWorkbook.getSheet(sheetName);	

		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();		

		Row row = sheet.getRow(0);

		Row newRow = sheet.createRow(rowCount+1);


		for(int j = 0; j<row.getLastCellNum(); j++)
		{

			//Fills data in row by coul

			Cell cell = newRow.createCell(j);

			cell.setCellValue(Writedta.get(j));

		}
		inputStream.close();
		FileOutputStream outputStream = new FileOutputStream(file);
		TestdataWorkbook.write(outputStream);		
		outputStream.close();

	}	
	
	/**
	 * @author Silampur Girish 
	 * Method to setExcelData 
	 * description it write data in row  wise 
	 * Date 09-01-2020
	 * para fileName;sheetName;rowNum;colNum;data	
	 */
	
	public void setExcelData(String fileName,String sheetName,int rowNum,int colNum,String data) throws InvalidFormatException, IOException{

		 FileInputStream inp = new FileInputStream(System.getProperty("user.dir")+".\\src\\main\\java\\com\\qa\\Resource\\AppdataExcell"+"\\"+fileName);
		 Workbook wb = WorkbookFactory.create(inp); 
		 Sheet sheet = wb.getSheet(sheetName); 
		//int lastRow = sheet.getLastRowNum();
		 Row row = sheet.createRow(rowNum);		 
		row.createCell(colNum).setCellValue(data);			 
		// Now this Write the output to a file 
		FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+".\\src\\main\\java\\com\\qa\\Resource\\AppdataExcell"+"\\"+fileName);
		wb.write(fos); 
		fos.close();  
	}
	
	
	/**
	 * @author Silampur Girish 
	 * Method to getExcelData 
	 * description it get data 
	 * Date 09-01-2020
	 * para fileName;sheetName;rowNum;colNum;data	 
	 */
	public String getExcelData(String fileName,String sheetName , int rowNum , int colNum) throws InvalidFormatException, IOException{
	      FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+".\\src\\main\\java\\com\\qa\\Resource\\AppdataExcell"+"\\"+fileName);
	      Workbook wb = WorkbookFactory.create(fis);
	      Sheet sh = wb.getSheet(sheetName);    
	      Row row = sh.getRow(rowNum);
	      String data = row.getCell(colNum).getStringCellValue();
	      return data;
	}
	
	/**
	 * @author Silampur Girish 
	 * Method to getRowCount 
	 * description gets RowCount
	 * Date 09-01-2020
	 * para fileName;sheetName	 
	 */

	public int getRowCount(String fileName,String sheetName) throws InvalidFormatException, IOException{    
	      FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+".\\src\\main\\java\\com\\qa\\Resource\\AppdataExcell"+"\\"+fileName);
	      Workbook wb = WorkbookFactory.create(fis);
	      Sheet sh = wb.getSheet(sheetName);
	      int rowCount = sh.getLastRowNum()+1;
	      return rowCount;
	}	

	/**
	 * @author Silampur Girish 
	 * Method to getcellCount 
	 * description getcellCount
	 * Date 09-01-2020
	 * para fileName;sheetName;rowNum
	*/
	public int getcellCount(String fileName,String sheetName,int rowNum) throws InvalidFormatException, IOException{
	      FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+".\\src\\main\\java\\com\\qa\\Resource\\AppdataExcell"+"\\"+fileName);
	      Workbook wb = WorkbookFactory.create(fis);
	      Sheet sh = wb.getSheet(sheetName);    
	      Row row = sh.getRow(rowNum);
	     return row.getLastCellNum();     
	}

////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * @author Silampur Girish 
	 * Date 09-01-2020
	 * DataRead class file merged with ExcellUtility
	*/

	@DataProvider(name = "LoginDataXLS")
	public Object[][] ReadExcelXLS() throws Exception{
		
		String absolutepath=System.getProperty("user.dir");
		String fileName=absolutepath+"\\src\\main\\java\\com\\qa\\Resource\\AppdataExcell\\AppData.xlsx";
		String sheetname="WriteExcelDemo";

	//ReadExcel excel = new ReadExcel();
	Object[][] testObjArray = getExcelData(fileName,sheetname);
	System.out.println(testObjArray);
	return testObjArray;

	}
	
	@DataProvider(name = "LoginDataXLSX")
    public Object[][] ReadExcelXLSX() throws Exception{
   	 
   	 String absolutepath=System.getProperty("user.dir");
   		String fileName=absolutepath+"\\src\\main\\java\\com\\qa\\Resource\\AppdataExcell\\AppData.xlsx";
   		String sheetname="WriteExcelDemo";

   		//ReadExcel excel = new ReadExcel();
	Object[][] testObjArray = getExcelData(fileName,sheetname);
	System.out.println(testObjArray);
	return testObjArray;

	}	
	@DataProvider(name = "RowXLSX")
    public Object[][] ReadRow() throws Exception{
   	 
   	 String absolutepath=System.getProperty("user.dir");
   		String fileName=absolutepath+"\\src\\main\\java\\com\\qa\\Resource\\AppdataExcell\\AppData.xlsx";
   		String sheetname="WriteExcelDemo";

   		//ReadExcel excel = new ReadExcel();
	Object[][] testObjArray = getExcelData(fileName,sheetname);
	System.out.println(testObjArray);
	return testObjArray;

	}	
	
	/////////////////////////////
	
	
	
	public String[][] getExcelData(String fileName, String sheetName) throws EncryptedDocumentException, IOException {
		XSSFSheet ExcelWSheet;
		XSSFWorkbook ExcelWBook;
		String[][] arrayExcelData = null;
		// Reading Excel File
		FileInputStream ExcelFile = new FileInputStream(fileName);

		String fileExtensionName = fileName.substring(fileName.indexOf("."));

		if (fileExtensionName.equals(".xlsx")) {
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(sheetName);
			int totalNoOfRows = ExcelWSheet.getLastRowNum();
			int totalNoOfCols_0 = ExcelWSheet.getRow(0).getLastCellNum();
			arrayExcelData = new String[totalNoOfRows][totalNoOfCols_0];
			for (int i = 0; i < totalNoOfRows; i++) {
				int totalNoOfCols = ExcelWSheet.getRow(i).getLastCellNum();
				for (int j = 0; j < totalNoOfCols; j++) {
					arrayExcelData[i][j] = ExcelWSheet.getRow(i + 1).getCell(j).getStringCellValue();
				}
			}
			System.out.println(arrayExcelData);
		}

		else if (fileExtensionName.equals(".xls")) {
			Workbook ExcelWBook1;
			Sheet ExcelWSheet1;
			ExcelWBook1 = WorkbookFactory.create(ExcelFile);
			ExcelWSheet1 = ExcelWBook1.getSheet(sheetName);
			int totalNoOfRows = ExcelWSheet1.getLastRowNum();
			int totalNoOfCols_0 = ExcelWSheet1.getRow(0).getLastCellNum();
			arrayExcelData = new String[totalNoOfRows][totalNoOfCols_0];
			for (int i = 0; i < totalNoOfRows; i++) {
				int totalNoOfCols = ExcelWSheet1.getRow(i).getLastCellNum();
				for (int j = 0; j < totalNoOfCols; j++) {
					arrayExcelData[i][j] = ExcelWSheet1.getRow(i + 1).getCell(j).getStringCellValue();
				}
			}
			System.out.println(arrayExcelData);
		}

		return arrayExcelData;
	}

	public ArrayList<String> getData(String testcaseName, String fileName) throws IOException {
		// fileInputStream argument
		ArrayList<String> a = new ArrayList<String>();

		FileInputStream fis = new FileInputStream(fileName);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("WriteExcelDemo")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				// Identify Testcases coloum by scanning the entire 1st row

				Iterator<Row> rows = sheet.iterator();// sheet is collection of rows
				Row firstrow = rows.next();
				Iterator<Cell> ce = firstrow.cellIterator();// row is collection of cells
				int k = 0;
				int coloumn = 0;
				while (ce.hasNext()) {
					Cell value = ce.next();

					if (value.getStringCellValue().equalsIgnoreCase("Testcase")) {
						coloumn = k;

					}

					k++;
				}
				System.out.println(coloumn);

				//// once coloumn is identified then scan entire testcase coloum to identify
				//// purcjhase testcase row
				while (rows.hasNext()) {

					Row r = rows.next();

					if (r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testcaseName)) {

						//// after you grab purchase testcase row = pull all the data of that row and
						//// feed into test

						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
							Cell c = cv.next();
							if (c.getCellType() == CellType.STRING) {

								a.add(c.getStringCellValue());
							} else {

								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));

							}
						}
					}

				}
			}

		}
		return a;
	}

///////////////////////////
	/**
	 * Date 09-01-2020
	 * WriteExcel class file merged with ExcellUtility
	*/
	
	public boolean writeExcel1(String excelfilePath, String WfileName, String sheetName, String[] dataToWrite)
			throws IOException {

		boolean isWriteSucess;
		try {
			// Create an object of File class to open xlsx file

			File file = new File(excelfilePath + "\\" + WfileName);

			// Create an object of FileInputStream class to read excel file

			FileInputStream inputStream = new FileInputStream(file);

			Workbook WriteExcelWorkbook = null;

			// Find the file extension by splitting file name in substring and getting only
			// extension name

			String fileExtensionName = WfileName.substring(WfileName.indexOf("."));

			// Check condition if the file is xlsx file

			if (fileExtensionName.equals(".xlsx")) {

				// If it is xlsx file then create object of XSSFWorkbook class

				WriteExcelWorkbook = new XSSFWorkbook(inputStream);

			}

			// Check condition if the file is xls file

			else if (fileExtensionName.equals(".xls")) {

				// If it is xls file then create object of XSSFWorkbook class

				WriteExcelWorkbook = new HSSFWorkbook(inputStream);

			}

			// Read excel sheet by sheet name

			Sheet sheet = WriteExcelWorkbook.getSheet(sheetName);

			// Get the current count of rows in excel file

			int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

			// Get the first row from the sheet

			Row row = sheet.getRow(0);

			// Create a new row and append it at last of sheet

			Row newRow = sheet.createRow(rowCount + 1);

			// Create a loop over the cell of newly created Row

			for (int j = 0; j < row.getLastCellNum(); j++) {

				// Fill data in row

				Cell cell = newRow.createCell(j);

				cell.setCellValue(dataToWrite[j]);

			}

			// Close input stream

			inputStream.close();

			// Create an object of FileOutputStream class to create write data in excel file

			FileOutputStream outputStream = new FileOutputStream(file);

			// write data in the excel file

			WriteExcelWorkbook.write(outputStream);

			// close output stream

			outputStream.close();
			isWriteSucess = true;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			isWriteSucess = false;
		}

		return isWriteSucess;

	}

	// Call the data by passing sheetname,values and it return true if writting data
	// in to the excel is successfull and returns false if it is not succssfull

	public static boolean WriteData(String sheetName, String value1, String value2) throws IOException {

		// Create an array with the data in the same order in which you expect to be
		// filled in excel file

		String[] valueToWrite = { value1, value2 };

		// Create an object of current class

		WriteExcel objExcelFile = new WriteExcel();

		// Write the file using file name, sheet name and the data to be filled

		boolean iswriteSuccessfull = objExcelFile.writeExcel1(System.getProperty("user.dir") + "\\ExportExcel","WriteData.xlsx", sheetName, valueToWrite);

		return iswriteSuccessfull;

	}
	
}

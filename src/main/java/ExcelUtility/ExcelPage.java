package ExcelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPage {
	// To read and return the username from excel

	public String excel_username(int a) throws IOException {

		FileInputStream fil = new FileInputStream(
				new File("D:\\Selenium\\eclipse\\LogaAutomation\\src\\test\\resources\\excel.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		String un = sheet.getRow(a).getCell(0).getStringCellValue();
		return un;
	}

	// To read and return the password from excel

	public String excel_password(int b) throws IOException {

		FileInputStream fil = new FileInputStream(
				new File("D:\\Selenium\\eclipse\\LogaAutomation\\src\\test\\resources\\excel.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		String pwd = sheet.getRow(b).getCell(1).getStringCellValue();
		return pwd;
	}
}
package nikhilselenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelsheetprogram 
{
  public static void main(String[] args) throws IOException 
  {
	String address ="C:\\Users\\OM\\Desktop\\Excelsheet program .xlsx";
	
	FileInputStream file =new FileInputStream(address);
	
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	
	XSSFSheet sheet =workbook.getSheet("JAVA");
	
	XSSFRow row=sheet.getRow(1);
	XSSFCell cell=row.getCell(1);
	String username =cell.getStringCellValue();
	System.out.println(username);
  }
}

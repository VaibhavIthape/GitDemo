package DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {

	
	@Test
	public void GetValuefromexcel() throws Exception
	{
		
		FileInputStream fis=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Demo.xlsx");
		
		XSSFWorkbook book=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=book.getSheet("Sheet1");
		
		String data=sheet.getRow(0).getCell(0).getStringCellValue();
		Row row=sheet.getRow(0);
		Cell cel=row.getCell(0);
		System.out.println(data);
		
		
	}
	
	
	
	
}

package DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetAllExcelDataIntoList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path = "D:\\WriteData.xlsx";
		FileInputStream fis = new FileInputStream(path);

		XSSFWorkbook wrrokbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = wrrokbook.getSheet("Sheet1");
		List<String> list=new ArrayList<>();
		int countofrow = sheet.getLastRowNum();
		int cellcount = 0;
		for (int i = 1; i <= countofrow; i++) {	
			Row row = sheet.getRow(i);
			cellcount = sheet.getRow(i).getLastCellNum();
			for (int j = 0; j < cellcount; j++) {

				String cell = row.getCell(j).getStringCellValue();
				list.add(cell);
			}

			
		}
		System.out.println(list.get(3));

	}
}
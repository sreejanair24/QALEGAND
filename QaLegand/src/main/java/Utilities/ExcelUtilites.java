package Utilities;
	import java.io.FileInputStream;
	import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	public class ExcelUtilites {
			static FileInputStream f;
			static XSSFWorkbook w;
			static XSSFSheet s;
			public static String getStringData(int a, int b, String filePathName, String sheetName) throws IOException
			{
				
				f = new FileInputStream(System.getProperty("user.dir")+filePathName);
				System.out.println(System.getProperty("user.dir")+filePathName);
				w = new XSSFWorkbook(f);
				s = w.getSheet(sheetName);
				Row r=s.getRow(a);
				Cell c=r.getCell(b);
				return c.getStringCellValue();
				
			}
			public static String getIntegerData(int a, int b,String filePathName, String sheetName ) throws IOException
			{
				f = new FileInputStream(System.getProperty("user.dir")+filePathName);
				w = new XSSFWorkbook(f);
				s = w.getSheet("Sheet1");
				Row r=s.getRow(a);
				Cell c=r.getCell(b);				
				int y = (int)c.getNumericCellValue();//to convert integer to string	
				return String.valueOf(y); //to return the value of y
									
								}

}

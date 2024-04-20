package Record;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider
{
	@DataProvider(name="loginData")
	public String[][] getData() throws Exception
	{
		File excelFile = new File("./src/test/resources/testData.xlsx");
		
		FileInputStream fis = new FileInputStream(excelFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rows = sheet.getPhysicalNumberOfRows();
		int columns = sheet.getRow(0).getLastCellNum();
	
		String[][] data = new String[rows-1][columns];
		
		for (int i = 0; i < rows-1; i++)
		{
			for (int j = 0; j < columns; j++)
			{
				DataFormatter df = new DataFormatter();
				data[i][j] =  df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		
		workbook.close();
		fis.close();
		
 		for (String[] dataArr : data)
 		{
 			System.out.println(Arrays.toString(dataArr));
 		}
 		
		return data;
	}
}
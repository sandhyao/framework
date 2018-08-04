package apache.week6;

import java.io.IOException;

import org.apache.poi.ss.usermodel.ObjectData;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelobject { 
	@Test
	public Object[][] readexcelobj(String filename) throws IOException
	{
		//finding the path
		XSSFWorkbook wBook=new XSSFWorkbook("./data/"+filename+".xlsx");
		
		//go to the sheet
		XSSFSheet sheet=wBook.getSheetAt(0);
		
		//find the row count
		int rowCount =sheet.getLastRowNum();
		
		//find the cell count
		short columnCount=sheet.getRow(0).getLastCellNum();
		
		//read the data
		Object[][] data =new Object[rowCount][columnCount];
		
		for(int i=1; i <=rowCount; i++) {
			XSSFRow row=sheet.getRow(i);
			for (int j=0; j< columnCount; j++ ) {
				XSSFCell cell =row.getCell(j);
			  data[i-1][j] =cell.getStringCellValue();
				//System.out.println(data);
								
			}
		}
		wBook.close();
		return data;
	}

		
	}



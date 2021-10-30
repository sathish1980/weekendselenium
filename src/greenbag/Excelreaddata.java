package greenbag;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreaddata {
	
	String filepath="C:\\Users\\sathishkumar\\eclipse-workspace\\weekend\\inputfile\\inputdata.xls";
	public void read() throws IOException
	{
		File F= new File(filepath);
		FileInputStream fs = new FileInputStream(F);
		//(.xlsx)
		
		XSSFWorkbook wbk= new XSSFWorkbook(fs);
		//or (.xls)
		HSSFWorkbook hsf = new HSSFWorkbook(fs);
		
		Sheet sh=hsf.getSheet("input");
		//Sheet sh=wbk.getSheetAt(1);
		
		//int totalusedrows=sh.getLastRowNum();
		int totalusedrows=sh.getPhysicalNumberOfRows();
		for(int i=0;i<totalusedrows;i++)
		{
			
			Row rw= sh.getRow(i);
			int usedcolumn=rw.getLastCellNum();
			for(int j=0;j<usedcolumn;j++)
			{
				Cell value=rw.getCell(j);
				System.out.println(value);
			}
			
		}
		hsf.close();
		fs.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Excelreaddata ex= new Excelreaddata();
		ex.read();
	}

}

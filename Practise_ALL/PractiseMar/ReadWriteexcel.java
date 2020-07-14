package PractiseMar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteexcel {

	public static void main(String[] args) throws IOException    {
		// TODO Auto-generated method stub

		
		
		File sc = new File("\\D:\\workspace\\LearnSpace\\ReadTest.xlsx");
		
		FileInputStream fis = new FileInputStream(sc);
		Workbook wb ; 
		wb = new XSSFWorkbook(fis);
		
		Sheet sh = wb.getSheet("Sheet0");
		int size = sh.getFirstRowNum();
		System.out.println(size);
		
		Row r = sh.getRow(0);
		
		
	}

}

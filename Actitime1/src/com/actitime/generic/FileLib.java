package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class FileLib {

		public String getPropertyData(String key) throws IOException {
			FileInputStream fis=new FileInputStream("./data/commandata.property");
			Properties p=new Properties();
			p.load(fis);
			String data = p.getProperty(key);
			return data;
		}
		public String getExcelData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
			FileInputStream fis=new FileInputStream("./data/testscript1.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			String data = wb.getSheet("InvalidLogin").getRow(1).getCell(1).getStringCellValue();
		return data;
		}
		
	}

package com.acttitme.mock2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	int rowcount = wb.getSheet("InvalidLogin").getLastRowNum();//getlastrownum
	
	for(int i=0;i<rowcount;i++) {
		String undata = wb.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
		String pwdata = wb.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
		System.out.println(undata+" "+pwdata);	
	}
}
}

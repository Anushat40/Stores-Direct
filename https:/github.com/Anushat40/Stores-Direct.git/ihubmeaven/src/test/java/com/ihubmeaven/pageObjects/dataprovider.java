package com.ihubmeaven.pageObjects;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class dataprovider {

	
	public String user;
	public String pass;
public String dp() throws IOException {	
	  FileInputStream fis = new FileInputStream("/home/vikas/Desktop/write.xlsx");
	    XSSFWorkbook wb = new XSSFWorkbook(fis);
	    XSSFSheet sh = wb.getSheetAt(0);
	    
	    for(int i=1;i<=1;i++) {
	    	user = sh.getRow(i).getCell(1).getStringCellValue();
	    	pass = sh.getRow(i).getCell(2).getStringCellValue(); 
	    }
		return user;	
 }}
package com.ihubmeaven.pageObjects;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class NewTest  {
  @Test()
  public void f() throws IOException {
	  dataprovider data = new dataprovider();
	 String user = data.dp();
	  
	System.out.println(user);
  }
}




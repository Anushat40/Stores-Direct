package com.ihubmeaven.offers;





import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ihubmeaven.pageObjects.baseclass;

public class testxl extends baseclass {
 
@Test
  public void f() throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("/home/vikas/Desktop/write.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(1);
		
		FileOutputStream fos = new FileOutputStream("/home/vikas/Desktop/write.xlsx");
	//	XSSFWorkbook wo = new XSSFWorkbook();
	//	XSSFSheet so = wo.createSheet("vikas");		
		for (int i=1;i<=sh.getLastRowNum();i++) {
			 
			String user  = sh.getRow(i).getCell(1).getStringCellValue();
			String pass = sh.getRow(i).getCell(2).getStringCellValue();
		
//			wb.write(fos);
//			sh.createRow(i).createCell(i+10).setCellValue(vikas[i][j]);
			
			driver.get("http://192.168.7.5/iHubReportsSQL/Login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.findElement(By.name("userName")).sendKeys(user);
			driver.findElement(By.name("password")).sendKeys(pass);
			driver.findElement(By.xpath("//button[@type=\\\"submit\\\"]")).click();
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
			
			
			  }}}
package com.ihubmeaven.pageObjects;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;

public class emailreport {
  @Test
  public void afterSuite() throws InterruptedException, IOException {
	  
	  WebDriver driver= new ChromeDriver();
	  System.setProperty("WebDriver.chrome.driver", System.getProperty("user+dir")+"//Drivers/chromedriver_linux64.exe");
	  ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	  driver.get("https://webmail.123-reg.co.uk/login/");
	  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	
	  driver.findElement(By.xpath("//input[@class=\"input input-big\"]")).sendKeys("vikasavarma.n@inativetech.com");
	  driver.findElement(By.id("password-id")).sendKeys("Inative@135");
	  driver.findElement(By.xpath("//button[@class=\"cta cta--primary\"]")).click();
	  Thread.sleep(30000);
	  driver.findElement(By.xpath("//a[@data-action=\"compose\"]")).click();
	  Thread.sleep(1000);
  //  driver.switchTo().alert().accept();
   	
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class=\"token-input tt-input\"])[1]")).sendKeys("dubbaprasannakumar@inativetech.com");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[@data-type='cc']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//input[@class='token-input tt-input'])[2]")).sendKeys("phanesh.k@inativetech.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name=\"subject\"]")).sendKeys("string sub");
		
	//	String image=System.getProperty("user.dir")+"//Scren Shorts/"+System.currentTimeMillis()+".png";
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"btn btn-link\"])[4]")).sendKeys("/home/vikas/Downloads/IMG_20190115_173630.jpg");
        Thread.sleep(5000);
//        Runtime.getRuntime().exec("/home/vikas/Downloads/IMG_20190115_173630.jpg");
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
	
   // d.findElement(By.xpath("//a[@data-action=\"compose\"]")).click();
    //System.out.print("successfully login to webmail123....");
    //d.findElement(By.id("background-loader")).click(); 
//driver.findElement(By.xpath("(//div[@class=\"contact-picture\"])[1]")).click();
//driver.findElement(By.xpath("//a[@data-name=\"logout\"]")).click();
	  }
  }

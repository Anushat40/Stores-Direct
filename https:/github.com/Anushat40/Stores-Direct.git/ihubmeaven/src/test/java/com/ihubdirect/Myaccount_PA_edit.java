package com.ihubdirect;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myaccount_PA_edit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://183.82.123.14/iHubMultiStoresDirectDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class=\"hidden-xs hidden-sm\"]//a[@ng-click=\"SignIn()\"]")).click();
		driver.findElement(By.xpath("//form[@name=\"LoginForm\"]//input[@name=\"userName\"]")).sendKeys("6309765343");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Store.123");
		driver.findElement(By.xpath("//form[@name=\"LoginForm\"]//button[@class=\"btn btn-prime btn-block\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@id=\"mobile-menu\"]//li[@ng-if=\"UserMobileNumber!=undefined&&UserMobileNumber!=''&&UserMobileNumber!=null\"]//a[@ng-click=\"DataToggle()\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//li[@class=\"mobile-dropdown open\"]//ul[@ng-show=\"Show_Buyer_Menu\"]//a[@ng-click=\"Buyer_Profile_Details()\"]"))
				.click();
		driver.findElement(By.xpath(
				"//div[@ng-show=\"BuyerDetailsShow\"]//a[@ng-click=\"Edit_Buyer_Details(BuyerProfileDetails)\"]"))
				.click();
		// Update
		driver.findElement(By.xpath(
				"//div[@id=\"EditBuyerDetailsFormModal\"]//button[@ng-click=\"Update_Buyer_Details('PersonalDetailsForm')\"]"))
				.click();
		// Cancel
		driver.findElement(By.xpath("//div[@id=\"EditBuyerDetailsFormModal\"]//button[@ng-click=\"CancelModals()\"]"))
				.click();
		// Close
		driver.findElement(By.xpath("//div[@id=\"EditBuyerDetailsFormModal\"]//button[@ng-click=\"Cancel()\"]"))
				.click();

	}

}
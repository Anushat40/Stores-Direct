package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS12_Schemes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.7.5/iHubstoressqlQA");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");

		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		
		/*Monthly Pay
		driver.findElement(By.linkText("Schemes")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"offer-badge\"]//h4[contains(text(),'iHub Monthly Pay')]")).click();
		Thread.sleep(2000);
		String Mainwindow = driver.getWindowHandle();
		java.util.Set<String> s1 = driver.getWindowHandles();
		java.util.Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			if (!Mainwindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				driver.findElement(By.xpath("//button[@class=\"btn buy-btn\"]")).click();
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"MobileNumber\"]")).sendKeys("6309765343");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"btnSave\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"btn buy-btn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"cart-bag\"]")).click();

		// Full Amount
		// driver.findElement(By.xpath("//input[@value=\"10\"]")).click();
		WebElement checkbox = driver.findElement(By.xpath("//input[@value=\"10\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);

		Thread.sleep(2000);
		WebElement checkbox0 = driver.findElement(By.xpath("//div[@class=\"cart-total\"]//button[@ng-click=\"CheckOut()\"]"));
		JavascriptExecutor js0 = (JavascriptExecutor) driver;
		js0.executeScript("arguments[0].click();", checkbox0);
		Thread.sleep(2000);
		// Store address
		WebElement link11 = driver.findElement(By.xpath(
				"//div[@class=\"col-md-4 address-details\"]//label[@class=\"label-wrapper\"]//input[@value=\"10\"]"));
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("arguments[0].click();", link11);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class=\"text-center\"]//button[@type=\"button\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Cash\"]")).click();
		driver.findElement(By.xpath("//button[@ng-click=\"GetStoreOTP_Valid('CashPaymentForm')\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"SOTP\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@ng-click=\"Confirm_OTP(SOTP)\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"InvoiceBtn print-hide\"]")).click();
		*/
		
		
		
		/*Monthly Scheme
		 driver.findElement(By.xpath("//div[@class=\"offer-badge\"]//h4[contains(text(),'iHub Monthly Scheme')]")).click();		
		Thread.sleep(2000);
		String Mainwindow = driver.getWindowHandle();
		java.util.Set<String> s1 = driver.getWindowHandles();
		java.util.Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			if (!Mainwindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				driver.findElement(By.xpath("//button[@class=\"btn buy-btn\"]")).click();
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"MobileNumber\"]")).sendKeys("6309765343");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"btnSave\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"btn buy-btn\"]")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@class=\"cart-bag\"]")).click();
		 /*Delete
		 driver.findElement(By.xpath("//div[@class=\"col-sm-6 col-md-8 col-lg-8\"]//tr[@ng-repeat=\"item in cartItems\"]//a[@class=\"remove\"]")).click();
		 Thread.sleep(2000);
		 //Yes
		 driver.findElement(By.xpath("//button[@class=\"btn btn-red\"]")).click();
		 //No
		 //driver.findElement(By.xpath("//button[@class=\"btn btn-default\"]")).click();
		 */
	 //Full Amount
			//driver.findElement(By.xpath("//input[@value=\"10\"]")).click();	
			WebElement checkbox = driver.findElement(By.xpath("//input[@value=\"10\"]"));
			 JavascriptExecutor js =(JavascriptExecutor) driver; 
			 js.executeScript("arguments[0].click();",checkbox);
	/*Booking Amount
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//input[@value=\"20\"]")).click();
			WebElement checkbox10 = driver.findElement(By.xpath(
			"//input[@value=\"20\"]"));
			 JavascriptExecutor js10=(JavascriptExecutor) driver; 
			 js10.executeScript("arguments[0].click();",checkbox10);
				//EMI
				Thread.sleep(2000);
				WebElement checkbox0 = driver.findElement(By.xpath("//input[@id=\"EMI-0\"]"));
				 JavascriptExecutor js0=(JavascriptExecutor) driver; 
				 js0.executeScript("arguments[0].click();",checkbox0);
*/
			 Thread.sleep(2000);
				WebElement checkbox0 = driver.findElement(By.xpath("//div[@class=\"cart-total\"]//button[@type=\"button\"]"));
				 JavascriptExecutor js0=(JavascriptExecutor) driver; 
				 js0.executeScript("arguments[0].click();",checkbox0);
				 Thread.sleep(2000);
				 //Store address
				WebElement link11= driver.findElement(By.xpath("//div[@class=\"col-md-4 address-details\"]//label[@class=\"label-wrapper\"]//input[@value=\"10\"]"));
				 JavascriptExecutor js11 =(JavascriptExecutor) driver; 
				 js11.executeScript("arguments[0].click();",link11);
				 Thread.sleep(2000);
				 /*Personal Address
					WebElement link10= driver.findElement(By.xpath("//div[@class=\"col-md-4 address-details\"]//label[@class=\"label-wrapper\"]//input[@value=\"5054\"]"));
					 JavascriptExecutor js10 =(JavascriptExecutor) driver; 
					 js10.executeScript("arguments[0].click();",link10);
					 */
				/*Add New Address
				 driver.findElement(By.xpath("//div[@class=\"add-address\"]")).click();
				 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"FullName\"]")).sendKeys("Lasya");
				 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//textarea[@name=\"Housenumber\"]")).sendKeys("Madhapur");
				 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//textarea[@name=\"Street\"]")).sendKeys("Jublihilss");
				 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"PinCode\"]")).sendKeys("500018");
				 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"MobileNumber\"]")).clear();
				 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"MobileNumber\"]")).sendKeys("8186814540");
				 driver.findElement(By.xpath("//div[@class=\"inline-block\"]//input[@id=\"btnSave\"]")).click();
				 */
				 driver.findElement(By.xpath("//div[@class=\"text-center\"]//button[@type=\"button\"]")).click(); 
				 Thread.sleep(2000);
				 
				 //Card types
				 //driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Cash\"]")).click();
				 driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Card\"]")).click();
				// driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Cheque\"]")).click();
				// driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"CCavenue\"]")).click();
				 
				 //Payment types
				 driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"MAESTRO\"]")).click();
				/* driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"MasterCard\"]")).click();
				 driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"Rupay\"]")).click();
				 driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"Visa\"]")).click();
				 
				 driver.findElement(By.xpath("//input[@name=\"CardNumber\"]")).sendKeys("4646");
				 driver.findElement(By.xpath("//div[@class=\"tab-content\"]//div[@class=\"text-center\"]//button[@class=\"btn btn-prime\"]")).click();
				 
		 */
				 
				 
				 
				 /*Sales Scheme
				  driver.findElement(By.xpath("//div[@class=\"offer-badge\"]//h4[contains(text(),'iHub Sales Scheme')]")).click();
	
		Thread.sleep(2000);
		String Mainwindow = driver.getWindowHandle();
		java.util.Set<String> s1 = driver.getWindowHandles();
		java.util.Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			if (!Mainwindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				driver.findElement(By.xpath("//button[@class=\"btn buy-btn\"]")).click();
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"MobileNumber\"]")).sendKeys("6309765343");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"btnSave\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"btn buy-btn\"]")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@class=\"cart-bag\"]")).click();
		 /*Delete
		 driver.findElement(By.xpath("//div[@class=\"col-sm-6 col-md-8 col-lg-8\"]//tr[@ng-repeat=\"item in cartItems\"]//a[@class=\"remove\"]")).click();
		 Thread.sleep(2000);
		 //Yes
		 driver.findElement(By.xpath("//button[@class=\"btn btn-red\"]")).click();
		 //No
		 //driver.findElement(By.xpath("//button[@class=\"btn btn-default\"]")).click();
		 */
	 //Full Amount
			//driver.findElement(By.xpath("//input[@value=\"10\"]")).click();	
			WebElement checkbox00 = driver.findElement(By.xpath("//input[@value=\"10\"]"));
			 JavascriptExecutor js00 =(JavascriptExecutor) driver; 
			 js00.executeScript("arguments[0].click();",checkbox00);
	/*Booking Amount
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//input[@value=\"20\"]")).click();
			WebElement checkbox10 = driver.findElement(By.xpath(
			"//input[@value=\"20\"]"));
			 JavascriptExecutor js10=(JavascriptExecutor) driver; 
			 js10.executeScript("arguments[0].click();",checkbox10);
				//EMI
				Thread.sleep(2000);
				WebElement checkbox0 = driver.findElement(By.xpath("//input[@id=\"EMI-0\"]"));
				 JavascriptExecutor js0=(JavascriptExecutor) driver; 
				 js0.executeScript("arguments[0].click();",checkbox0);
*/
			 Thread.sleep(2000);
				WebElement checkbox01 = driver.findElement(By.xpath("//div[@class=\"cart-total\"]//button[@type=\"button\"]"));
				 JavascriptExecutor js01=(JavascriptExecutor) driver; 
				 js01.executeScript("arguments[0].click();",checkbox01);
				 Thread.sleep(2000);
				 //Store address
				WebElement link10= driver.findElement(By.xpath("//div[@class=\"col-md-4 address-details\"]//label[@class=\"label-wrapper\"]//input[@value=\"10\"]"));
				 JavascriptExecutor js10 =(JavascriptExecutor) driver; 
				 js10.executeScript("arguments[0].click();",link10);
				 Thread.sleep(2000);
				 /*Personal Address
					WebElement link10= driver.findElement(By.xpath("//div[@class=\"col-md-4 address-details\"]//label[@class=\"label-wrapper\"]//input[@value=\"5054\"]"));
					 JavascriptExecutor js10 =(JavascriptExecutor) driver; 
					 js10.executeScript("arguments[0].click();",link10);
					 */
				/*Add New Address
				 driver.findElement(By.xpath("//div[@class=\"add-address\"]")).click();
				 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"FullName\"]")).sendKeys("Lasya");
				 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//textarea[@name=\"Housenumber\"]")).sendKeys("Madhapur");
				 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//textarea[@name=\"Street\"]")).sendKeys("Jublihilss");
				 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"PinCode\"]")).sendKeys("500018");
				 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"MobileNumber\"]")).clear();
				 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"MobileNumber\"]")).sendKeys("8186814540");
				 driver.findElement(By.xpath("//div[@class=\"inline-block\"]//input[@id=\"btnSave\"]")).click();
				 */
				 driver.findElement(By.xpath("//div[@class=\"text-center\"]//button[@type=\"button\"]")).click(); 
				 Thread.sleep(2000);
				 
				 //Card types
				 //driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Cash\"]")).click();
				 driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Card\"]")).click();
				// driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Cheque\"]")).click();
				// driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"CCavenue\"]")).click();
				 
				 //Payment types
				 driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"MAESTRO\"]")).click();
				/* driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"MasterCard\"]")).click();
				 driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"Rupay\"]")).click();
				 driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"Visa\"]")).click();
				 
				 driver.findElement(By.xpath("//input[@name=\"CardNumber\"]")).sendKeys("4646");
				 driver.findElement(By.xpath("//div[@class=\"tab-content\"]//div[@class=\"text-center\"]//button[@class=\"btn btn-prime\"]")).click();
				  
				  */
		
	}

}

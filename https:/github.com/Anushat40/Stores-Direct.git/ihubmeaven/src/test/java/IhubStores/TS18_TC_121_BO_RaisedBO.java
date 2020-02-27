package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS18_TC_121_BO_RaisedBO {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://183.82.123.14/iHubMultiStoresDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(4000);
		WebElement checkbox = driver.findElement(By.xpath("//div[@ng-click=\"getBulkOrders()\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);
		Thread.sleep(4000);
		WebElement checkbox1 = driver
				.findElement(By.xpath("//div[@ng-click=\"AllRaisedBulkOrders('Raised Bulk Orders')\"]"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", checkbox1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-show=\"raisedgrid\"]//input[@ng-model=\"OrdersFrom\"]"))
				.sendKeys("01/12/2019");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-show=\"raisedgrid\"]//input[@ng-model=\"OrdersTo\"]"))
				.sendKeys("31/12/2019");
		driver.findElement(By.xpath("//div[@ng-show=\"raisedgrid\"]//input[@ng-model=\"mobilenumber\"]"))
				.sendKeys("6309765343");
		driver.findElement(By.xpath("//div[@ng-show=\"raisedgrid\"]//input[@ng-model=\"Ordersid\"]")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@ng-show=\"raisedgrid\"]//input[@ng-click=\"SearchOrders(Orders,orderPaymentmode)\"]"))
				.click();
		Thread.sleep(2000);
//		driver.findElement(
//				By.xpath("//div[@ng-show=\"raisedgrid\"]//input[@ng-click=\"Reset(Orders,orderPaymentmode)\"]"))
//				.click();
	}

}
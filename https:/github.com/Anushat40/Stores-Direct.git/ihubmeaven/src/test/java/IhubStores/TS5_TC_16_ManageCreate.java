package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS5_TC_16_ManageCreate {

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
		Thread.sleep(2000);
		// Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement checkbox = driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//a[@ng-click=\"UserMenu()\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);
		Thread.sleep(2000);
		WebElement checkbox0 = driver
				.findElement(By.xpath("//div[@id=\"mobile-menu\"]//a[@ng-click=\"ManageExpenses()\"]"));
		JavascriptExecutor js0 = (JavascriptExecutor) driver;
		js0.executeScript("arguments[0].click();", checkbox0);
		Thread.sleep(2000);

		// create new
		WebElement checkbox1 = driver
				.findElement(By.xpath("//div[@class=\"content-wrapper\"]//input[@value=\"Create New\"]"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", checkbox1);
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@class=\"modal-content\"]//select[@name=\"MasterName\"]//option[@label=\"Special Discounts\"]"))
				.click();
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//input[@name=\"AmountSpent\"]")).sendKeys("2500");
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//textarea[@name=\"Description\"]"))
				.sendKeys("Testing");
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//input[@value=\"1\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//input[@value=\"2\"]")).click();
		driver.findElement(By
				.xpath("//div[@class=\"modal-content\"]//div[@ng-show=\"BillIssue==1\"]//input[@id=\"checkfileOne\"]"))
				.sendKeys("//home//anusha//Desktop//download.jpeg");
		driver.findElement(
				By.xpath("//div[@class=\"modal-content\"]//button[@ng-click=\"Save_Expense('CreateNewExpenseForm')\"]"))
				.click();
	}

}
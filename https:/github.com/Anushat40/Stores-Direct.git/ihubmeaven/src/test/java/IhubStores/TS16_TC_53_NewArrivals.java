package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS16_TC_53_NewArrivals  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://205.147.109.73/iHubMultistoresStoreTRG");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		Thread.sleep(2000);
		// Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		// Logo
		WebElement checkbox = driver
				.findElement(By.xpath("//div[@class=\"navbar-header\"]//img[@src=\"dist/images/logo.png\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);
		Thread.sleep(2000);
		WebElement checkbox1 = driver
				.findElement(By.xpath("//div[@class=\"add-banner container\"][4]"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", checkbox1);
		Thread.sleep(3000);
		// js1.executeScript("window.scrollBy(0,3000)");
		js1.executeScript("arguments[0].scrollIntoView();", checkbox1);
		/*Thread.sleep(3000);
		WebElement checkbox01 = driver.findElement(By.xpath("//div[@class=\"add-banner container\"][4]"));
		JavascriptExecutor js01 = (JavascriptExecutor) driver;
		js01.executeScript("arguments[0].click();", checkbox01);
*/
		Thread.sleep(3000);
	
	}

}
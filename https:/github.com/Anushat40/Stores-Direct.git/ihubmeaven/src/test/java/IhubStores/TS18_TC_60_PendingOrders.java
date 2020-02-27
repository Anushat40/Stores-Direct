package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS18_TC_60_PendingOrders {

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
		Thread.sleep(2000);
		// Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-class=\"{blink:DashboardDetails[0].pendingcount>0}\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"OrdersFrom\"]"))
				.sendKeys("12/12/2019");
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"OrdersTo\"]"))
				.sendKeys("14/12/2019");
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"mobilenumber\"]"))
				.sendKeys("6309765343");
		// driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"Ordersid\"]")).sendKeys("");
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@value=\"Search\"]")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@value=\"Reset\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//a[@ng-click=\"toggleGroup(i,i.Orders_Main_ID)\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@ng-click=\"ViewOrderedProducts(i.Orders_Main_ID,i)\"]")).click();
		driver.findElement(
				By.xpath("//div[@class=\"table-responsive\"]//a[@ng-click=\"NewToggleGroup(y,y.Product_Id)\"]"))
				.click();
	}

}

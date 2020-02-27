package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS4_TC_10_MyAccount_PA {

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
		driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//a[@ng-click=\"UserMenu()\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//i[@class=\"fa ion-iphone icn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@name=\"RegForm\"]//input[@name=\"MobileNumber\"]")).sendKeys("6309765343");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@name=\"RegForm\"]//input[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//span[@class=\"User_Mobile_Dropdown\"]")).click();
		driver.findElement(By.xpath(
				"//div[@id=\"mobile-menu\"]//span[@class=\"User_Mobile_Dropdown\"]//a[@ng-click=\"Buyer_Profile_Details()\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@class=\"my-account-section\"]//div[@ng-show=\"BuyerDetailsShow\"]//a[@ng-click=\"Edit_Buyer_Details(BuyerProfileDetails)\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//input[@ng-model=\"BuyerFullName\"]")).clear();
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//input[@ng-model=\"BuyerFullName\"]"))
				.sendKeys("Text");
		Thread.sleep(2000);
		// update
		driver.findElement(By.xpath(
				"//div[@class=\"modal-content\"]//button[@ng-click=\"Update_Buyer_Details('PersonalDetailsForm')\"]"))
				.click();
		/*
		 * cancel driver.findElement(By.xpath(
		 * "//div[@class=\"modal-content\"]//div[@class=\"modal-footer\"]//button[@ng-click=\"CancelModals()\"]"
		 * )) .click();
		 */
	}

}
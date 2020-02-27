package IhubStoresAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WalletManager {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://164.52.194.143/iHubBetaAdmin");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"userName\"]"))
				.sendKeys("superadmin@ihubstores.in");
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//button[@ng-click=\"Admin_SignIn('LoginForm')\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//header[@class=\"main-header\"]//a[@role=\"button\"]")).click();
		Thread.sleep(2000);
		// Bulk Order
		driver.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][10]"))
				.click();
		driver.findElement(By.xpath(
				"//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][10]//li[@ng-repeat=\"j in i.SubMenus\"][4]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-controller=\"iH_Wallet_ManagerController\"]//input[@value=\"S\"]"))
				.click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//div[@ng-controller=\"iH_Wallet_ManagerController\"]//input[@value=\"M\"]")).click();
		driver.findElement(By.xpath(
				"//div[@ng-controller=\"iH_Wallet_ManagerController\"]//input[@ng-model=\"MoblieNumberWallet\"]"))
				.sendKeys("6309765343");
		driver.findElement(By.xpath("//div[@ng-controller=\"iH_Wallet_ManagerController\"]//input[@value=\"Search\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-controller=\"iH_Wallet_ManagerController\"]//input[@value=\"C\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@ng-controller=\"iH_Wallet_ManagerController\"]//input[@name=\"EnterAmount\"]"))
				.sendKeys("500");
		driver.findElement(
				By.xpath("//div[@ng-controller=\"iH_Wallet_ManagerController\"]//textarea[@ng-model=\"Remarks\"]"))
				.sendKeys("Test");
		driver.findElement(By.xpath("//div[@class=\"content-wrapper\"]//button[@ng-click=\"SingleUserOtp()\"]"))
				.click();
	}

}
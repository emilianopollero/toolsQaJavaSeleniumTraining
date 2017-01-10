package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import appModule.SignIn_Action;
import pageObjects.Home_Page;

public class Param_TC {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");

		SignIn_Action.Execute(driver, "testuser_1", "Test@123");
		System.out.println("Login Successfully, now it is time to Log Off buddy.");
		Home_Page.lnk_LogOut(driver).click();
		driver.quit();
	}

}

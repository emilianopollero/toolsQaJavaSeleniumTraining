package automationFramework;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import appModule.SignIn_Action;
import pageObjects.Home_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

public class Log4j_Logging_TC {

	private static WebDriver driver = null;
	
	public static void main(String[] args) throws Exception {

		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("Selenium_Test_001");
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");
		Log.info(" Excel sheet opened");
		driver = new FirefoxDriver();
		Log.info("New driver instantiated");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Log.info("Implicit wait applied on the driver for 10 seconds");
		driver.get(Constant.URL);
		Log.info("Web application launched");
		SignIn_Action.Execute(driver);
		System.out.println("Login successful");
		Home_Page.lnk_LogOut(driver).click();
		Log.info("Clicked logout");
		driver.quit();
		Log.info("Browser closed");
		ExcelUtils.setCellData("Pass", 1, 3);
		Log.endTestCase("Selenium_Test_001");
	}

}

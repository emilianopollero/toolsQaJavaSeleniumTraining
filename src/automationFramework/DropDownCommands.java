package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCommands {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");
		Select oSelect = new Select(driver.findElement(By.id("continents")));
		oSelect.selectByVisibleText("Europe");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		oSelect.selectByIndex(2);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> oSize = oSelect.getOptions();
		int iListSize = oSize.size();
		
		for (int i = 0; i < iListSize; i++) {
			String sValue = oSelect.getOptions().get(i).getText();
			System.out.println(sValue);
			if (sValue.equals("Africa")) {
				oSelect.selectByIndex(i);
				break;
			}
		}
		driver.quit();
	}

}

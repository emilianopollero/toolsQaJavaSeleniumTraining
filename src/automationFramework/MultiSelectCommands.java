package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectCommands {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");
		Select oSelect = new Select(driver.findElement(By.name("selenium_commands")));
		oSelect.selectByIndex(0);
		oSelect.deselectByIndex(0);
		oSelect.selectByVisibleText("Navigation Commands");
		oSelect.deselectByVisibleText("Navigation Commands");
		
		List<WebElement> oSize = oSelect.getOptions();
		int iListsize = oSize.size();
		
		for (int i = 0; i < iListsize; i++) {
			String sValue = oSelect.getOptions().get(i).getText();
			System.out.println(sValue);
			oSelect.selectByIndex(i);
		}
		oSelect.deselectAll();
		driver.quit();
	}

}

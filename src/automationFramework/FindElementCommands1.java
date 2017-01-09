package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementCommands1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/Automation-practice-form/");
		driver.findElement(By.name("firstname")).sendKeys("Lakshay");
		driver.findElement(By.name("lastname")).sendKeys("Sharma");
		driver.findElement(By.id("submit")).click();
	}

}

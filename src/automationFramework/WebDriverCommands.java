package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String url = "http://store.demoqa.com";
		driver.get(url);
		String title = driver.getTitle();
		int titleLenght = driver.getTitle().length();

		System.out.println("Title of the page is: " + title);
		System.out.println("Lenght of the title is: " + titleLenght);

		String actualUrl = driver.getCurrentUrl();

		if (actualUrl.equals(url)) {
			System.out.println("Verification Successful - The correct Url is opened.");
		} else {
			System.out.println("Verificaciont Failed - An incorrect Url is opened.");
			System.out.println("Actual URL is: " + actualUrl);
			System.out.println("Expected URl is: " + url);
		}
		String pageSource = driver.getPageSource();
		int pageSourceLenght = pageSource.length();
		System.out.println("Total lenght of the Page Source is: " + pageSourceLenght);
		driver.close();
	}

}

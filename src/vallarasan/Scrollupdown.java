package vallarasan;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollupdown {
	// Scroll down and scroll up 
	//1. in selenium there is no methods
	//2. so we are using JavaScriptexecutor

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Vallarasan\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		// this is for scroll down
		jse.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);
		//this is for scroll up
		jse.executeScript("window.scrollBy(0,-200)");



		Thread.sleep(3000);

		driver.quit();
	}

}

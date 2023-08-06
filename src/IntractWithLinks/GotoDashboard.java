package IntractWithLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GotoDashboard {

	public static void main(String[] args) throws InterruptedException {
		//	take me to dashboard

		// Set the path to the chrome driver executable.
		System.setProperty("webdriver.chrome.driver", "C:\\Vallarasan\\chromedriver_win32\\ChromeDriver.exe");

		// Initialize the WebDriver (ChromeDriver).
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Replace "your_url_here" with the actual URL of the webpage.
		String url = "https://www.leafground.com/link.xhtml";
		// Navigate to the webpage.
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// here we can use either Xpath or linktext
	//	WebElement link=driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/a"));
		WebElement link=driver.findElement(By.linkText("Go to Dashboard"));
		link.click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
	}

}

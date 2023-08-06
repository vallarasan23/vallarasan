package IntractWithLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class duplicatelinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		// Set the path to the chrome driver executable.
		System.setProperty("webdriver.chrome.driver", "C:\\Vallarasan\\chromedriver_win32\\ChromeDriver.exe");

		// Initialize the WebDriver (ChromeDriver).
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Replace "your_url_here" with the actual URL of the webpage.
		String ur = "https://www.leafground.com/link.xhtml";

		// Navigate to the webpage.
		driver.get(ur);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// first we gonna use findelements for fetching all the tag usually its located "a" for this return type list
		WebElement link=driver.findElement(By.linkText("How many links in this page?"));
		link.click();
		
		System.out.println(link.getSize());
	}

}

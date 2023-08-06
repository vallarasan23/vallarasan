package IntractWithLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findmydestinationwthoutclick {

	public static void main(String[] args) throws InterruptedException {

		// Set the path to the chrome driver executable.
		System.setProperty("webdriver.chrome.driver", "C:\\Vallarasan\\chromedriver_win32\\ChromeDriver.exe");

		// Initialize the WebDriver (ChromeDriver).
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Replace "your_url_here" with the actual URL of the webpage.
		String url = "https://www.leafground.com/link.xhtml";
		// Navigate to the webpage.
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement links=driver.findElement(By.linkText("Find the URL without clicking me."));
		System.out.println(links.getAttribute("href"));
		driver.quit();

	}}

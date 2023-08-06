package vallarasan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class setup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Vallarasan\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement username= driver.findElement(By.xpath("//*[@id=\"email\"] "));
		username.sendKeys("vallarasan24@gmail.com");

		WebElement password=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		password.sendKeys("valla");
		WebElement button=driver.findElement(By.xpath("//*[@id=\\\"u_0_5_bz\\\"]"));

		button.click();

		driver.close();
	}


}

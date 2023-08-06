package com.qa.TextBox;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabRetrive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Vallarasan\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement t= driver.findElement(By.name("j_idt88:j_idt97"));
		String text=	t.getAttribute("value");
		System.out.println(text);
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt99\"]"));
		email.sendKeys("vallarasan24@gmail.com");
		email.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		WebElement about = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt101\"]"));
		about.sendKeys("\"hi my name is vallarasan. i have around 4+ year's of experience "
				+ "with focusing manual and automation testing ");
		driver.quit();
	}

}




package com.qa.radiobutton;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiabutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Vallarasan\\chromedriver_win32\\ChromeDriver.exe");

		// Initialize the WebDriver (ChromeDriver).
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Replace "your_url_here" with the actual URL of the webpage.
		String url = "https://www.leafground.com/radio.xhtml";
		// Navigate to the webpage.
		driver.get(url);
		List<WebElement> drive=	driver.findElements(By.xpath("//*[@id=\"j_idt87:console1\"]"));
		for (WebElement webElement : drive) {
			String all=	webElement.getText();
			System.out.println(all);
			if(all.contains("Safari"))
			{
				webElement.click();
			}

		}
		Thread.sleep(2000);
	WebElement b=driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[2]/div[1]/div/div"));
	boolean b1=b.isSelected();
		System.out.println(b1);
		
	
		driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[3]/div/div[2]")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}

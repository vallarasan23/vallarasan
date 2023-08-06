package com.qa.Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt_box {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Vallarasan\\chromedriver_win32\\ChromeDriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
			WebElement promptbox=driver.findElement(By.id("promptBox"));
			promptbox.click();
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.sendKeys("valla vallarasan");
			alert.accept();
			Thread.sleep(3000);
			System.out.println(driver.findElement(By.id("output")).getText());
			driver.quit();
	}

}

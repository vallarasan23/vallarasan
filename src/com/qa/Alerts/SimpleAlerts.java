package com.qa.Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Vallarasan\\chromedriver_win32\\ChromeDriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));  	
		
		WebElement alerts=driver.findElement(By.xpath("//button[@id='alertBox']"));
		alerts.click();
		try {
			Alert al= driver.switchTo().alert();
			System.out.println(al.getText());
			Thread.sleep(3000);
			al.accept();
		} catch (Exception NoAlertPresentException)
		{
			
	
		}
     driver.quit();
	}

}

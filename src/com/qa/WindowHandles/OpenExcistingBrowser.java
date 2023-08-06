package com.qa.WindowHandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenExcistingBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Vallarasan\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		String parent_window=	driver.getWindowHandle();
		System.out.println("parent window:"+parent_window);
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> exwindow=driver.getWindowHandles();
		for(String newwin:exwindow)
		{
			if(!newwin.equals(parent_window))
			{
				driver.switchTo().window(newwin);
				System.out.println(newwin);
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.findElement(By.id("alertBox")).click();
				Alert alert=driver.switchTo().alert();
				Thread.sleep(1000);
				System.out.println(alert.getText());
				if(alert.getText().equalsIgnoreCase("I am an alert box!")) {
					System.out.println("correct alerts");
				}else
					System.out.println("incorrect alerts");
				alert.accept();
				Thread.sleep(1000);
				driver.close();
			}
		}
		driver.switchTo().window(parent_window);
		System.out.println("parent window:"+parent_window);
		Thread.sleep(2000);
		driver.quit();
	}

}

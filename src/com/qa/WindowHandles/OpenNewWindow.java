package com.qa.WindowHandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Vallarasan\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		String parent_window=	driver.getWindowHandle();
		System.out.println("parent window:"+parent_window);
		WebElement window=driver.findElement(By.id("newWindowBtn"));
		window.click();

		Set<String> win=driver.getWindowHandles();
		for (String Childwin : win) {
			if (!Childwin.equals(parent_window)) {
				driver.switchTo().window(Childwin);
				System.out.println("Child window:"+Childwin);
				driver.manage().window().maximize();
				System.out.println(driver.getCurrentUrl());
				Thread.sleep(2000);
				driver.findElement(By.id("firstName")).sendKeys("vallarasan");
				driver.close();
			}	
		}
		driver.switchTo().window(parent_window);
		System.out.println(parent_window);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}

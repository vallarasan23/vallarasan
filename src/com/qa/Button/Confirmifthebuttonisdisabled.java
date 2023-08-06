package com.qa.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmifthebuttonisdisabled {

	public static void main(String[] args) throws InterruptedException {
		//Requirement
		// 1. Find the button and confirm button is disabled
		// 2. so, here we should use the isEnabled() or isDisabled()


		System.setProperty("webdriver.chrome.driver","C:\\Vallarasan\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement dis= driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt92\"]"));
		if(dis.isEnabled()) {
			System.out.println("button is Enabled");
		}
		else {
			System.out.println("button is Disabled");
			Thread.sleep(1000);

		}driver.quit();
	}

}

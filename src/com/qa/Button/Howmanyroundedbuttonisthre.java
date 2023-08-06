package com.qa.Button;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Howmanyroundedbuttonisthre {

	public static void main(String[] args) throws InterruptedException {
		


		// Set the path to the chrome driver executable.
		System.setProperty("webdriver.chrome.driver", "C:\\Vallarasan\\chromedriver_win32\\ChromeDriver.exe");

		// Initialize the WebDriver (ChromeDriver).
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Replace "your_url_here" with the actual URL of the webpage.
		String url = "https://www.leafground.com/button.xhtml";

		// Navigate to the webpage.
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Find the button element.
		List<WebElement> button = driver.findElements(By.xpath("//*[@id=\"j_idt88\"]/div/div[2]/div[4]"));
	System.out.println(	button.size());
		for(WebElement list:button) {
	           
			System.out.println(list);
		}
			
		
	
	}

}

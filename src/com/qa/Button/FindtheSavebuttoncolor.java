package com.qa.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FindtheSavebuttoncolor {

	public static void main(String[] args) throws InterruptedException {

		// Set the path to the chromedriver executable.
		System.setProperty("webdriver.chrome.driver", "C:\\Vallarasan\\chromedriver_win32\\ChromeDriver.exe");

		// Initialize the WebDriver (ChromeDriver).
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Replace "your_url_here" with the actual URL of the webpage.
		String url = "https://www.leafground.com/button.xhtml";

		// Navigate to the webpage.
		driver.get(url);
		
		// Find the button element.
		WebElement button = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt100\"]"));
		
		// Get the button's CSS property (e.g., color) before the hover.
		String bc=button.getCssValue("background-color");
		System.out.println("The color of before the hover is:"+bc);

		// Perform a mouse hover over the button.
		Actions actions = new Actions(driver);
		actions.moveToElement(button).build().perform();
		Thread.sleep(2000);
		// Get the button's CSS property after the hover.
		String ac=button.getCssValue("background-color");
		System.out.println("The color of after the hover is:"+ac);


		// Compare the initial and hovered colors to confirm the change.
		if (!bc.equals(ac)) {
			System.out.println("The button color changes when the mouse hovers over it");
		} else {
			System.out.println("The button color does not change when the mouse hovers over it");
		}  
		Thread.sleep(2000);

		// Close the WebDriver.

		driver.quit();
	}

}



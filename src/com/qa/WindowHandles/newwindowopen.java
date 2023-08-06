package com.qa.WindowHandles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newwindowopen {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Vallarasan\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		// A new window is opened and switches to it
		driver.switchTo().newWindow(WindowType.WINDOW);
		// Loads Sauce Labs open source website in the newly opened window
		driver.get("https://opensource.saucelabs.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/");
		driver.close();
	}

}

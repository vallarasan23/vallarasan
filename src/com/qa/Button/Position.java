package com.qa.Button;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Position {

	// here i have got three different error  socket exception  and invalid argument exception
	// and stale element reference exception


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Vallarasan\\chromedriver_win32\\ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement but= driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[2]"));
		
		// if need to get height and width or position then we should use Point class
		Point p= but.getLocation();
		int Xval=p.getX();
		int Yval=p.getY();
		System.out.println("The value of Xposition is:"   
			             	+Xval+"the value of Yposition is:" +Yval);

		int h= but.getSize().getHeight();
		int w=but.getSize().getWidth();
		System.out.println("The button height is:"  +h+  
				"The button Width is:"   +w);
		Thread.sleep(3000);
		driver.quit();
	}

}

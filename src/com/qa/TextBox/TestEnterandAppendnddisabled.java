package com.qa.TextBox;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestEnterandAppendnddisabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Vallarasan\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(2000);
				WebElement text = driver.findElement(By.id("j_idt88:name"));
				text.sendKeys("vallarasan ponnusamy");
				Thread.sleep(3000);
				WebElement append = driver.findElement(By.name("j_idt88:j_idt91"));
				append.sendKeys("hate");
				Thread.sleep(1000);
				WebElement dis = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
				if(dis.isEnabled()) {
					System.out.println("yes it is enabled");
				}else {
					System.out.println("yes it is disabled");
					
		}	driver.quit();

	}

}

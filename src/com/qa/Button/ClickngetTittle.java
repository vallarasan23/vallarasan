package com.qa.Button;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickngetTittle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Vallarasan\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		//https://www.leafground.com/button.xhtml
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> list=	driver.findElements(By.tagName("a"));
		System.out.println(list.size());


//		for(int i =0;i<list.size();i++) {
//			String s=	list.get(i).getText();
//			System.out.println(s);
//		}

			for (WebElement webElement : list) {
				String s=webElement.getText();
				System.out.println(s);

		}



		//		WebElement click = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt90\"]/span"));
		//		click.click();
		//		String Tittle = driver.getTitle();
		//		System.out.println(Tittle);
				Thread.sleep(1000);
		driver.quit();

	}
}

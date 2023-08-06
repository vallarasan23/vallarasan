package com.qa.CheckBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Checkboxfunctions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Vallarasan\\chromedriver_win32\\ChromeDriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		//Basic Checkbox
		WebElement bc= driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]"));
		bc.click();
		Thread.sleep(2000);
		//Notification
		WebElement notificationcheckbox = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt91\"]/div[2]"));
		boolean	beforecheck=notificationcheckbox.isSelected();
		System.out.println("Is the checkbox initially checked:"+beforecheck);
		notificationcheckbox.click();
		boolean aftercheck = notificationcheckbox.isSelected();
		Thread.sleep(000);
		System.out.println("Is the checkbox after checked:"+aftercheck);
		//Choose your favorite language(s)

		WebElement chooselanguage = driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[3]/div/div[2]"));
		chooselanguage.click();
		Thread.sleep(1000);

		List<WebElement> SelectMultiple = driver.findElements(By.xpath("//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']"));


		for (WebElement list : SelectMultiple) {
			if(list.getText().contains("London")) {
				list.click();
				//						Dimension li=list.getSize();
				//						System.out.println(li);
			}	
		}
	}

	//driver.quit();
}



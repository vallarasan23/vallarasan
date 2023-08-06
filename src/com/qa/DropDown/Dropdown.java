package com.qa.DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Vallarasan\\chromedriver_win32\\ChromeDriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Fui=driver.findElement(By.className("ui-selectonemenu"));
		Select select = new Select(Fui);
		select.selectByIndex(1);
		List<WebElement> list=	select.getOptions();
		int l=list.size();
		System.out.println(l);
		//	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		//    WebElement w=	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\\\"j_idt87:auto-complete\\\"]/ul"))));
		//	w.sendKeys();
		driver.quit();
	}


}

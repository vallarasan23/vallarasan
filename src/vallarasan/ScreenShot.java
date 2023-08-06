package vallarasan;


import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	// how to takes screen shot -------- so actually there are 2 type normal selenium methos another one is by using Robot class

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Vallarasan\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Thread.sleep(20);

		TakesScreenshot screen = (TakesScreenshot) (driver);
		File source = screen.getScreenshotAs(OutputType.FILE);
		File des= new File ("F:\\01-PHOTO\\COLLEGE\\MY FRIENDS\\VALLARASAN\\Screen\\book.png");
		FileHandler.copy(source, des);


		Thread.sleep(20);

		Robot r = new Robot();
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec =new Rectangle(screensize);
		BufferedImage s=r.createScreenCapture(rec);
		File file =new File("F:\\01-PHOTO\\COLLEGE\\MY FRIENDS\\VALLARASAN\\Screen\\robot.png");
		ImageIO.write(s, "png", file);
		driver.quit();





	}



}




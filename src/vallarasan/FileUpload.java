package vallarasan;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUpload {
//   How to upload file
	// so we have to use StringSelection class avail awt package
	// then we have to use Toolkit through access system clip board
	// then use Robot class it is also available awt package
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Vallarasan\\chromedriver_win32\\ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement button=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]/span[1]"));
		button.click();
		Thread.sleep(3000);

		String file="F:\\01-PHOTO\\COLLEGE\\MY FRIENDS\\VALLARASAN\\New Text Document.txt";
		StringSelection selection =new StringSelection(file);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);


		//driver.close();
	}

}

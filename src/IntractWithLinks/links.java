package IntractWithLinks;



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	//what is broken links?
	//broken links is a link on web page that is no longer access or no longer exist.

	// what is the reason?
	//May be that page removed from the web site.
	// may be web page structure modified.

	public static void main(String[] args) throws InterruptedException, IOException {

		// Set the path to the chrome driver executable.
		System.setProperty("webdriver.chrome.driver", "C:\\Vallarasan\\chromedriver_win32\\ChromeDriver.exe");

		// Initialize the WebDriver (ChromeDriver).
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Replace "your_url_here" with the actual URL of the webpage.
		String ur = "https://www.facebook.com";

		// Navigate to the webpage.
		driver.get(ur);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// first we gonna use findelements for fetching all the tag usually its located "a" for this return type list

		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		// step 2: we need to use foreach loop to iterate all links

		for(WebElement link:links) {
			// step 3: we need to get href because all link represent href so here we have to getattribute

			String linkurl=	link.getAttribute("href");
			// step 4: use URL class available in java.net and pass the href variable to URL class

			URL url= new URL(linkurl);
			// step 5: we need to open the url connection. so we can use url.openconnection.
			//it will return to store URLConnection abstract class now connection open
			//The abstract class URLConnection is the super class of all classes that represent 
			//a communications link between the application and a URL*//

			URLConnection urlconnection=url.openConnection();
			// step 6: now we only open the connection now we want to send the request to server
			// so we gonna use HttpURLConnectin is a abstract class so we need to casting to urlconnection variable

			HttpURLConnection httpurlconnection =(HttpURLConnection) urlconnection;
			//step 7: set the time and connect
			httpurlconnection.setConnectTimeout(5000);
			httpurlconnection.connect();
			// step 8: then use if else to verify the links for by get the response message and response code.

			if(httpurlconnection.getResponseCode()==200) {
				System.out.println(linkurl  +"-"+ httpurlconnection.getResponseMessage());
			}

			else
				System.err.println(linkurl  +"-"+ httpurlconnection.getResponseCode()+"-"+   linkurl  +"-"+ httpurlconnection.getResponseMessage());
			httpurlconnection.disconnect();

		}
		driver.quit();
	}

}
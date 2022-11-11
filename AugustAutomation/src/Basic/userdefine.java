package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class userdefine {
public static WebDriver openBrowser(String url) {
	System.setProperty("webdriver.chrome.driver", "D:\\ChromedriverNew\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();//upcasting // here driver(variable)  contained all the property of webdriver(data type) 

	driver.get(url);
	
	driver.manage().window().maximize();
	
	return driver;
}
}

package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\ChromedriverNew\\chromedriver.exe");
	
WebDriver driver = new ChromeDriver();//upcasting // driver = reference variable of  WebDriver
	
	// driver.get("https://vctcpune.com/"); // it open the url on browser
	
	
	//Navigation nav = driver. navigate();
	
	//nav.to("https://vctcpune.com/"); 
	 
	driver.navigate().to("https://vctcpune.com/"); // method chaining
	
	Thread.sleep(2000); ///InterruptedException, 2000 mili second = 2second
	
	driver.navigate().back(); 
	
	Thread.sleep(2000); 
	
	driver.navigate().forward();
	
	Thread.sleep(2000); 

	driver.navigate().refresh();

}
}

package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\ChromedriverNew\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();//upcasting
	
	driver.get("https://vctcpune.com/"); // it open the url on browser
	
	
	String title = driver.getTitle(); // here title is a String variable 
	System.out.println(title);
	
	String CurrentUrl = driver.getCurrentUrl();
	System.out.println(CurrentUrl);
	
	driver.manage().window().maximize();
	
	
	// method chaining
  // Options option = driver.manage(); // manage is method of webdriver returns options interface
  // Window win = option.window(); // window  is method of option  returns Window interface
  // win.maximize();      // then by using  maximize method of Window interface we can maximize the browser
	
	
	
	driver.manage().window().minimize();
	

	
	
	
	
}
}
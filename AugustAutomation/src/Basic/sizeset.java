package Basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class sizeset {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\ChromedriverNew\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://vctcpune.com");
	
	Dimension d = new Dimension(300,600);
	driver.manage().window().setSize(d);
}

}

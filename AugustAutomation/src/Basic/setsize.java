package Basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromedriverNew\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();//upcasting
		
		driver.get("https://vctcpune.com/"); // it open the url on browser
		
	
		driver.manage().window().maximize();

	Dimension d = new Dimension(200,500); // width = 200, height = 500 fixle
	
	driver.manage().window().setSize(d);
	
	Point p = new Point(200,500);
	
	driver.manage().window().setPosition(p);

	}
}
   
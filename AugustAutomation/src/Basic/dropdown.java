package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromedriverNew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting

		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		 WebElement DropDown = driver.findElement(By.xpath("//select[@id ='dropdown-class-example']"));	
		 
		 Select a = new Select(DropDown);
		 //a.selectByIndex(3);
		 
	  a.selectByVisibleText("Option3");

	 a.selectByValue("option2");
		
	}

}

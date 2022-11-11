package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator2 {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "D:\\ChromedriverNew\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();//upcasting

	//driver.get("https://vctcpune.com/selenium/practice.html");
	//driver.manage().window().maximize();
	
	
	
	//WebElement radio =driver.findElement(By.xpath("//input[@value='Radio2']"));
	
	//boolean status = radio.isSelected();
	
	
	//System.out.println(status);
	
	//radio.click();
	
	//boolean status1 = radio.isSelected();
	
	//System.out.println(status1);
	
	
	//WebElement text =driver.findElement(By.xpath("//input[@id='displayed-text']"));

	//boolean status2 = text.isDisplayed();
	
	//System.out.println(status2);
 
	
	
	//WebElement hide =driver.findElement(By.xpath("//input[@id='hide-textbook']"));
	
	//hide.click();
	//boolean status3 = text.isDisplayed();
	//System.out.println(status3);

	
	
	//WebElement text1 =driver.findElement(By.xpath("//h1[@class= ' header1 font-weight-bold text-white text-center']"));

	//String value =  text1.getText();
	
	
	//System.out.println(value);
	
	
	driver.get("https:www.facebook.com");
		driver.manage().window().maximize();
	
	
	WebElement email  = driver.findElement(By.id("email")); // field = email
	email.sendKeys("shraddhanjalinayak007@gmail.com "); 
	
	WebElement password = driver.findElement(By.name("pass")); // field = password
      password.sendKeys("shraddha@21");
	
      email.clear();
      password.clear();  	
	
	
	
	
	
	
	
	
	
	

	
}

}

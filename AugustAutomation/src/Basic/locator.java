package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {
	public static void main(String[] args) throws InterruptedException{
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\ChromedriverNew\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();//upcasting

	driver.get("https:www.facebook.com");
	driver.manage().window().maximize();
	
	

	WebElement email  = driver.findElement(By.id("email")); // field = email
	//email.sendKeys("shraddhanjalinayak007@gmail.com "); 
	
	WebElement password = driver.findElement(By.name("pass")); // field = password
	//password.sendKeys("shraddha@21");

	WebElement login = driver.findElement(By.tagName("button")); // field = login 
	
	//login.click();  
	
	WebElement forgot = driver.findElement(By.className("_6ltj")); // field = forgot
	//forgot.click();

	WebElement email2 = driver.findElement(By.cssSelector("input[type='text']")); // field = email
	//email2.sendKeys("shraddhanjalinayak007@gmail.com "); 
	

	WebElement forgot2 = driver.findElement(By.linkText("Forgotten password?")); // field = forgotten account
    // forgot2.click();
	
 	WebElement forgot3 = driver.findElement(By.partialLinkText("Forgotten")); // field = forgotten account
     //forgot3.click();
	
	
 	WebElement email3 = driver.findElement(By.xpath("//input[@id='email']")); // field = email
   //email3 .sendKeys("abc@gmail.com"); // xpath atttribute
	
	WebElement password2 = driver.findElement(By.xpath("//input[@type='password']")); // field = password
	//password2.sendKeys("12234");// xpath attribute
	
	WebElement login2 = driver.findElement(By.xpath("//button[@value= '1']")); // field = login
	//login.click();// xpath attribute
	
	WebElement forgot4= driver.findElement(By.xpath("//a[text()= 'Forgotten password?']")); // field = forgotten account
    //forgot4.click(); // xpath text
	
       
    WebElement password3 = driver.findElement(By.xpath("//input[contains(@class,'_9npi ')]")); // field = password
      
    //password3.sendKeys("12234"); //// xpath contains
	
	
	
    WebElement password4 = driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[2] ")); // field = password
    
     // password4.sendKeys("12234"); // // xpath by index
    

    WebElement email4 = driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[1]")); // field = email

	//email4.sendKeys("abc@gmail.com");
	
    WebElement email5 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")); // field = email

	email5.sendKeys("abc@gmail.com");
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	

	
}
}
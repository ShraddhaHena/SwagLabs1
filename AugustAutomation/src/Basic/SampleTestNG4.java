package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestNG4 {
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
		driver=userdefine.openBrowser("https://www.facebook.com");
	}
	
	
	@Test
	public void loginwithvalidcredential() {
		WebDriver driver =userdefine.openBrowser("https://www.facebook.com/");
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("xyz@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("12345");
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
        login.click();
}
	@Test
public void loginWithoutPassword() {
	WebDriver driver =userdefine.openBrowser("https://www.facebook.com/");
	
	WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
	Email.sendKeys("xyz@gmail.com");
	WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
    login.click();
}
	@Test
public void loginWithoutEmail() {
	WebDriver driver =userdefine.openBrowser("https://www.facebook.com/");
	
	WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	password.sendKeys("12345");
	WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
    login.click();
}
	
	
	@AfterMethod
	public void postTest() {
		driver.close();
	}

}

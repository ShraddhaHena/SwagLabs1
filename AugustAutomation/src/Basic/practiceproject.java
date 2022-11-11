package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class practiceproject {
public static void main(String[] args) {
	WebDriver driver = userdefine.openBrowser("https://www.khanacademy.org");
	WebElement loginoption = driver.findElement(By.xpath("//a[@id='login-or-signup']"));
    loginoption.click();
	WebElement email = driver.findElement(By.id("uid-login-form-2-wb-id-identifier-field"));
	email.sendKeys("shraddhanayak974@gmail.com");
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("shraddha@21");
	
	
}
}	


//Accept() method
package Basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =  userdefine.openBrowser("https://vctcpune.com/selenium/practice.html");
	
	 WebElement alertpop = driver.findElement(By.xpath("//input[@id='alertbtn']"));
	 alertpop.click(); 
	
	
 Alert a = driver.switchTo().alert(); // here the alert() is the method also SwitchTo() ,, Alert is interface ,, a =reference variable
  a.accept(); // accept() is a method.
	 

 Thread.sleep(2000);

	WebElement hide = driver.findElement(By.xpath("//input[@value='Hide']"));
	hide.click(); 




}
}

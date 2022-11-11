

// gettext() method

package Basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPopup2 {
public static void main(String[] args) {
WebDriver driver =  userdefine.openBrowser("https://vctcpune.com/selenium/practice.html");
	
	WebElement alertpop = driver.findElement(By.xpath("//input[@id='alertbtn']"));
	alertpop.click(); 
	
	Alert a = driver.switchTo().alert(); // here the alert() is the method also SwitchTo() ,, Alert is interface ,, a =reference variable
		String text = a.getText();
		System.out.println(text);
}
}

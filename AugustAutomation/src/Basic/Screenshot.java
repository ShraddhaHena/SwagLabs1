package Basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class Screenshot {
public static void main(String[] args )throws IOException{
	
		System.setProperty("webdriver.chrome.driver", "D:\\ChromedriverNew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting
	
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		
		//TakesScreenshot s = ((TakesScreenshot)driver);
		
		// s.getScreenshotAs(null);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //FILE is a class java which recieve screenshots in every format
		
		                                                             // source is reference variable 
		File destination = new File("C:\\Users\\shrad\\OneDrive\\Desktop\\Screenshot\\vctc1.png"); // destination is a reference variable for File claa
		
		FileHandler.copy(source, destination); // it throws an expection i.e;  IOException
			
	
	
	
}
}

package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	 
  public static void clickss(String name, WebDriver driver) throws IOException {
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //sorce is reference of File class 
	File destination = new File("D:\\Eclipse\\KhanAcademy\\Screenshot\\" + name + ".png");
	FileHandler.copy(source, destination);
	
	 
}
}


// File is class of java & FileHandler is class of java as well as Selenium We use FileHandler class of selenium
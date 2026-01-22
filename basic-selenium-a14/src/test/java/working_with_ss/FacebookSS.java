package working_with_ss;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FacebookSS {
	public static void main(String[] args) throws IOException {
//		upcasting till webdriver type
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

//		downcast till takesscreenshot level for ss of webpage
		TakesScreenshot tks = (TakesScreenshot) driver;

//		take ss using method
		File source = tks.getScreenshotAs(OutputType.FILE); // file

//		get ready for saving or copying the ss in one dummy file
		File destination = new File("./src/test/java/working_with_ss/webpage.png");

//		copy paste the content from source to destination
		FileHandler.copy(source, destination);

		System.out.println("SS of webpage taken successfully !!!");
		
//		take ss of login button
		WebElement login = driver.findElement(By.name("login"));
		
		File src = login.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./src/test/java/working_with_ss/login.png");
		
//		copy paste
		FileHandler.copy(src, dest);
		
		
		
		
		
		
		
		

		driver.quit();
	}

}

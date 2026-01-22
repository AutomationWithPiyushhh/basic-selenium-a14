package working_with_jse;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		driver.get("https://www.zomato.com/");
		
		Thread.sleep(2000);
		
//		downcasting
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
//		open the url
		jse.executeScript("window.location='https://www.zomato.com/';");
		
//		return the title
		System.out.println(jse.executeScript("return document.title;"));
		
//		scrolling
		jse.executeScript("window.scrollTo(0, -500);");
		
		jse.executeScript("window.scrollBy(0, 200)");
		

		Thread.sleep(3000);
		driver.quit();
		
		
		
	}
}

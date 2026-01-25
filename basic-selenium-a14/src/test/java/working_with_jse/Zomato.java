package working_with_jse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		driver.get("https://www.zomato.com/");

		Thread.sleep(1000);

//		downcasting
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		String url1 = "https://www.zomato.com/";
		String url2 = "https://www.facebook.com/";
		String url3 = "https://www.instagram.com/";

		System.out.println("url1");
		System.out.println(url1);

//		jse.executeScript("window.location='https://www.zomato.com/';");
//		jse.executeScript("window.location='" + url1 + "';");
		jse.executeScript("window.location=arguments[0];", url1);

		Thread.sleep(1000);
//		jse.executeScript("window.location='" + url2 + "';");
		jse.executeScript("window.location=arguments[0];", url2);

		Thread.sleep(1000);
//		jse.executeScript("window.location='" + url3 + "';");
		jse.executeScript("window.location=arguments[0];", url3);

//		return the title
		System.out.println(jse.executeScript("return document.title;"));

//		scrolling
//		jse.executeScript("window.scrollTo(0, -500);");
//
//		int x = 0;
//		int y = 1000;
//		jse.executeScript("window.scrollBy(" + x + "," + y + ");");
//
//		Thread.sleep(2000);
//
//		jse.executeScript("window.scrollBy(" + x + "," + y * 2 + ");");

		driver.get("https://www.facebook.com/");
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
		
		
//		click on webelement
		
		
		
		Thread.sleep(3000);
		driver.quit();

	}
}

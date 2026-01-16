package automationwithpiyush;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/direct.html");

		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("admin@123");

		driver.findElement(By.id("terms_checkbox")).click();

		driver.findElement(By.cssSelector("button[type='submit']")).submit();

		Thread.sleep(3000);
		driver.quit();
	}
}

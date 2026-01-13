package working_with_sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_sync {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://automationwithpiyush.vercel.app/synchronization.html");
		
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("add")).click();
		
		driver.findElement(By.id("remove")).click();
		
		System.out.println("clicked on remove");
		
		Thread.sleep(10000);
		driver.quit();

	}
}

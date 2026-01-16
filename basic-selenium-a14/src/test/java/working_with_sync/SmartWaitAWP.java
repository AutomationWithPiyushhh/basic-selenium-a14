package working_with_sync;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SmartWaitAWP {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/synchronization.html");

		WebElement t1 = driver.findElement(By.id("trigger1"));
		t1.click();

//		we should never ever use hardcoded wait into our test script
//		Thread.sleep(5000);

		WebElement ip1 = driver.findElement(By.id("target-1"));

//		explicit wait
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		wait.until(ExpectedConditions.elementToBeClickable(ip1));

//		Fluent wait
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(15));
		wait.pollingEvery(Duration.ofSeconds(2));
		
		wait.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.elementToBeClickable(ip1));

		ip1.sendKeys("dinga");

//		boolean status = ip1.isEnabled();
//		
//		if (status) {
//			ip1.sendKeys("dinga....");
//		}else {
//			System.out.println("it's not enabled....");
//		}

		/* 1. click on enable box 2
		 * 2. wait for textfield 2 to be clickable
		 * 3. enter some value in textfield 2
		*/
		
		driver.findElement(By.id("trigger2")).click();		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("target-2")));
		driver.findElement(By.id("target-2")).sendKeys("dingi");
		
		Thread.sleep(3000);
		driver.quit();

	}
}

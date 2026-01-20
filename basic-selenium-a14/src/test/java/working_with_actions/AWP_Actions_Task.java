package working_with_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AWP_Actions_Task {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://automationwithpiyush.vercel.app/actions.html");
		
		WebElement slider = driver.findElement(By.id("precision-seekbar"));
		Actions act = new Actions(driver);
		
		
//		scroll till last
		act.scrollByAmount(0, 700).build().perform();
		act.scrollToElement(slider).perform();
		
		
		
		Thread.sleep(2000);
		
//		act.moveToElement(slider).moveByOffset(-50, 0).click().build().perform();
		act.moveToElement(slider, 50, 0).click().build().perform();
		
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		
		
	}
}

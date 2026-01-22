package working_with_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("1234567");
		Thread.sleep(3000);
		pwd.clear();
		Thread.sleep(3000);
		pwd.sendKeys("1234567");
		Thread.sleep(10000);
		
		
//		act.sendKeys("admin@123" + Keys.TAB + "123456789" + Keys.ENTER).build().perform();
		
		act.sendKeys(pwd , "admin@123").build().perform();
		
//		act.sendKeys("admin@123").pause(Duration.ofSeconds(1))
//				.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
//				.sendKeys("123456").pause(Duration.ofSeconds(1))
//				.sendKeys(Keys.ENTER).build().perform();
		
//		enter un
		act.sendKeys("admin@123").build().perform();
		
//		press ctrl + a
		act.keyDown(Keys.CONTROL).build().perform();
		act.sendKeys("a").build().perform();
		act.keyUp(Keys.CONTROL).build().perform();
		
//		press ctrl + c
		act.keyDown(Keys.CONTROL).build().perform();
		act.sendKeys("c").build().perform();
		act.keyUp(Keys.CONTROL).build().perform();
			
//		click on tab
		act.sendKeys(Keys.TAB).perform();		
		
//		press ctrl + v
		act.keyDown(Keys.CONTROL)
			.sendKeys("v")
			.keyUp(Keys.CONTROL).build().perform();
		
//		click on enter
		act.sendKeys(Keys.ENTER).build().perform();
				
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}

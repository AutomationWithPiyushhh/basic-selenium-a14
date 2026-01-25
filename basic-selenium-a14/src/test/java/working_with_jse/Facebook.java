package working_with_jse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		WebElement un = driver.findElement(By.id("email"));
		WebElement loginBtn = driver.findElement(By.name("login"));
		WebElement createNewAcc = driver.findElement(By.linkText("Create new account"));
//		un.sendKeys("admin");
//		loginBtn.click();

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		String cred = "admin";

//		dont use single quote when using args
//		jse.executeScript("arguments[0].value='arguments[1]';", un, cred);

//		jse.executeScript("arguments[0].value='admin';", un);
//		jse.executeScript("arguments[0].value=arguments[1];", un, cred);

//		jse.executeScript("arguments[1].click();", loginBtn, createNewAcc);

		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
//		java selenium
		WebElement cg = driver.findElement(By.id("custom_gender"));
//		cg.sendKeys("Male");
		
//		javascript selenium
		jse.executeScript("arguments[0].value='male';", cg);
		
		
		
		
		
		

		Thread.sleep(2000);
//		driver.quit();
	}
}

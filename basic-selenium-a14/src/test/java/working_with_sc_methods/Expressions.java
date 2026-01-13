package working_with_sc_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expressions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.facebook.com/");
		
		WebElement un = driver.findElement(By.cssSelector("#email"));
		WebElement pwd = driver.findElement(By.cssSelector("._9npi"));
		WebElement loginButton = driver.findElement(By.cssSelector("button[data-testid='royal-login-button']"));
		WebElement createNewAcc = driver.findElement(By.cssSelector("._6ltg ._4jy2"));
		
		un.sendKeys("admin");
		Thread.sleep(1000);
		pwd.sendKeys("12345678");
		Thread.sleep(1000);
//		loginButton.click();
		createNewAcc.click();
		Thread.sleep(5000);

		driver.quit();
	}
}

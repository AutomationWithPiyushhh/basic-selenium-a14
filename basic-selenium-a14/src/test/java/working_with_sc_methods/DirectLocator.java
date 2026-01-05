package working_with_sc_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(1000);

//		write admin in un input field using id 
		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys("admin");
		
		Thread.sleep(1000);
		
//		write 12345678 in pwd input field using name
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("12345678");

		Thread.sleep(1000);
		
//		click on forgotten pwd? using linktext & partialLinkText
//		WebElement fp = driver.findElement(By.linkText("Forgotten password?"));
		WebElement fp = driver.findElement(By.partialLinkText("Forgotten password"));
		fp.click();
		
		Thread.sleep(5000);
		driver.quit();
	}
}

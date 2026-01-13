package working_with_sc_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://automationwithpiyush.vercel.app/");
		
//		Synchronization 
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Practice")).click();
		
		driver.findElement(By.xpath("//h4[text()='Locators']")).click();
		
		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys("qwerty@123");
		
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("123456789");
		
		WebElement cb = driver.findElement(By.className("custom-checkbox"));
		cb.click();
		
		driver.findElement(By.xpath("//button[contains(@id,'u_0_5')]")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}
}

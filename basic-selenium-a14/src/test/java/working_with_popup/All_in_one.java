package working_with_popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_in_one {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/popups.html");

		Thread.sleep(1000);

//		Javascript popup
		Alert ale = driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("Saurabh");
		ale.accept();

		driver.findElement(By.xpath("//button[contains(text(),'Alert')]")).click();
		Thread.sleep(500);
		ale.accept();

		driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
		Thread.sleep(500);
		ale.dismiss();

		driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
		Thread.sleep(500);

		ale.sendKeys("Saurabh");
		String text = ale.getText();
		System.out.println(text);

		ale.accept();

//		Authentication popup
		
		driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		
		
		Thread.sleep(5000);
		driver.quit();
	}
}

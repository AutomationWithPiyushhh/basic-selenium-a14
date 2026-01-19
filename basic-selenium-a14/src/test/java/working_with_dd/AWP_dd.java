package working_with_dd;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AWP_dd {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://automationwithpiyush.vercel.app/dropdown.html");
		
		WebElement techDD = driver.findElement(By.id("multi-select"));
		
		Select selTech = new Select(techDD);

		selTech.selectByIndex(0);
		selTech.selectByIndex(1);
		selTech.selectByIndex(3);
		selTech.selectByIndex(4);
		selTech.selectByIndex(5);
		
		WebElement first = selTech.getFirstSelectedOption();
//		System.out.println(first.getText());
		
		List<WebElement> all = selTech.getAllSelectedOptions();
		for (WebElement i : all) {
			System.out.println(i.getText());
		}
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}

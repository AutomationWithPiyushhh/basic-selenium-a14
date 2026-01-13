package working_with_sc_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		int totalLinks = links.size();
		System.out.println(totalLinks);

		driver.quit();
	}
}

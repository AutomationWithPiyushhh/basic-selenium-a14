package initial_days;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Rohit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/hotels/");

		Thread.sleep(3000);
		String bcolor = driver.findElement(By.xpath("//span[text()='Hotels']")).getCssValue("color");
		String beforeClick = Color.fromString(bcolor).asHex();
		System.out.println(beforeClick);
	}
}

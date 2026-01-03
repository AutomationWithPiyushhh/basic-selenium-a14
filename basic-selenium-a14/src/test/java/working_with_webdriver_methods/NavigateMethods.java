package working_with_webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
//		will wait until the page loads.
		
		Navigation nav = driver.navigate();

		Thread.sleep(2000);

//		will not wait until the page loads
		nav.to("https://www.instagram.com/");

		Thread.sleep(2000);

		nav.back();

		Thread.sleep(2000);

		nav.forward();

		Thread.sleep(2000);

		nav.refresh();

		Thread.sleep(2000);
		driver.quit();
	}
}

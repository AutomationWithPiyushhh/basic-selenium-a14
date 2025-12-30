package working_with_webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/"); // fqp

		String title = driver.getTitle();
		System.out.println(title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);

		Thread.sleep(5000);

//		driver.close(); // it will close current window
		// it will not stop the server
		driver.quit(); // it will close all windows
						// it will stop the server
	}
}

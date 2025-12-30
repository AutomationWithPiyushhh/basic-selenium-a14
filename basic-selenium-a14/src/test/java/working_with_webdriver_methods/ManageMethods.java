package working_with_webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

//		driver.manage().window().maximize();'

		Options opt = driver.manage();
		Window win = opt.window();

		Thread.sleep(1000);

		win.maximize();

		Thread.sleep(1000);

		win.minimize();

		Thread.sleep(1000);

		win.fullscreen();

		Thread.sleep(2000);

		driver.quit();

	}
}

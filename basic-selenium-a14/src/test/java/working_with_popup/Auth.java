package working_with_popup;

import java.time.Duration;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auth {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		HasAuthentication auth = (HasAuthentication) driver;
		auth.register(UsernameAndPassword.of("admin", "admin"));
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");

		Thread.sleep(1000);
		driver.quit();
	}
}

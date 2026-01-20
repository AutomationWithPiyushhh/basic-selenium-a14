package working_with_actions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative {
	public static void main(String[] args) throws InterruptedException {
		// 1. Setup Driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		try {
			// 2. Load the Relative Anatomy Page
			// Replace with your actual local file path
			driver.get("C:\\portfolio\\relative.html");

			// STEP 0: Define our 'Anchor' or Reference Point
			WebElement coreMonitor = driver.findElement(By.id("center_monitor"));
			System.out.println("--- Starting Relative Scan ---");

			// 3. Locate RESPIRATORY button (Above the Core)
			WebElement respBtn = driver.findElement(with(By.tagName("button")).above(coreMonitor));
			System.out.println("Located Above is  is : " + respBtn.getText());
			respBtn.click();
			Thread.sleep(1000);

			// 4. Locate MUSCULAR button (Below the Core)
			WebElement muscBtn = driver.findElement(with(By.tagName("button")).below(coreMonitor));
			System.out.println("Located Below is : " + muscBtn.getText());
			Thread.sleep(1000);

			// 5. Locate LIVER button (To the Left of the Core)
			WebElement liverBtn = driver.findElement(with(By.tagName("button")).toLeftOf(coreMonitor));
			System.out.println("Located Left is : " + liverBtn.getText());
			Thread.sleep(1000);

			// 6. Locate KIDNEY button (To the Right of the Core)
			WebElement kidneyBtn = driver.findElement(with(By.tagName("button")).toRightOf(coreMonitor));
			System.out.println("Located Right is : " + kidneyBtn.getText());
			Thread.sleep(1000);

			// 7. ADVANCED: Chaining Locators
			// Find the Cardiac button which is Above the Liver AND Left of Respiratory
			WebElement cardiacBtn = driver.findElement(with(By.tagName("button")).above(liverBtn).toLeftOf(respBtn));

			System.out.println("Located via Chain is : " + cardiacBtn.getText());
			cardiacBtn.click();

		} catch (Exception e) {
			System.out.println("Scan Error: " + e.getMessage());
		} finally {
			Thread.sleep(3000);
			driver.quit();
			System.out.println("--- Scan Complete ---");
		}
	}
}
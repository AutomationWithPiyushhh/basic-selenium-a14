package automationwithpiyush;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopupAndWindowMastery {

	public static void main(String[] args) throws InterruptedException, IOException {

		// 1. Setup Chrome with Notification Blocking
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications"); // crucial for handling browser-level popups

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Update this path to where you saved the HTML file
		driver.get("https://automationwithpiyush.vercel.app/popups.html");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// ============================================================
		// SCENARIO 1: JS ALERTS
		// ============================================================
		System.out.println("--- 1. Handling Alerts ---");

		// 1.1 Simple Alert
		driver.findElement(By.xpath("//button[contains(text(),'Alert')]")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text: " + alert.getText());
		alert.accept();

		Thread.sleep(1000);
		
		// 1.2 Confirm Alert (Dismissing it)
		driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
		alert = driver.switchTo().alert();
		System.out.println("Confirm Text: " + alert.getText());
		alert.dismiss(); // Clicks 'Cancel'

		Thread.sleep(1000);
		
		// 1.3 Prompt Alert (Typing text)
		driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
		alert = driver.switchTo().alert();
		alert.sendKeys("Automation Hero");
		alert.accept();

		Thread.sleep(1000); // Just for visual observation

		// ============================================================
		// SCENARIO 2: MODAL (HIDDEN DIVISION)
		// ============================================================
		System.out.println("--- 2. Handling HTML Modals ---");

		driver.findElement(By.xpath("//button[contains(text(),'Modal')]")).click();

		// Explicit wait is mandatory for Modals to ensure visibility
		WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customModal")));

		if (modal.isDisplayed()) {
			System.out.println("Modal is visible.");
			// Click the 'Sign Off' button inside the modal
			driver.findElement(By.xpath("//button[contains(text(),'Off')]")).click();
		}

		Thread.sleep(1000);
		
		// ============================================================
		// SCENARIO 3: FILE UPLOAD
		// ============================================================
		System.out.println("--- 3. Handling File Upload ---");

		// Trick: Do not click the "Choose File" button.
		// Send keys directly to the <input type="file"> element.

		// Creating a dummy file to upload
		File uploadFile = new File("src/main/resources/testData.txt");
		if (!uploadFile.exists())
			uploadFile.createNewFile(); // Ensure file exists

		WebElement fileInput = driver.findElement(By.id("fileUpload"));
		fileInput.sendKeys(uploadFile.getAbsolutePath());

		System.out.println("File uploaded: " + uploadFile.getName());

		Thread.sleep(1000);
		
		// ============================================================
		// SCENARIO 4: MULTIPLE WINDOW HANDLING (Amazon, Flipkart, eBay)
		// ============================================================
		System.out.println("--- 4. Handling Multiple Windows ---");

		String parentWindowID = driver.getWindowHandle();

		// This button opens 3 new windows
		WebElement multiWindowBtn = driver.findElement(By.xpath("//button[contains(text(),'Window')]"));
		multiWindowBtn.click();

		// Wait for windows to open
//        wait.until(d -> d.getWindowHandles().size() > 3);

		Set<String> allWindowIDs = driver.getWindowHandles();

		for (String windowID : allWindowIDs) {
			// Switch to every window that isn't the parent
			if (!windowID.equals(parentWindowID)) {
				driver.switchTo().window(windowID);

				String title = driver.getTitle();
				System.out.println("Switched to window: " + title);

				// Specific Logic for specific windows
				if (title.contains("Amazon")) {
					System.out.println(" > Found Amazon! Performing Amazon specific actions...");
					// driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptops");
					driver.close(); // Close only this child window
				} else if (title.contains("Flipkart")) {
					System.out.println(" > Found Flipkart! Verifying deals...");
					driver.close();
				} else if (title.contains("eBay")) {
					System.out.println(" > Found eBay! Checking cart...");
					driver.close();
				}
			}
		}

		// Switch back to parent to continue execution
		driver.switchTo().window(parentWindowID);
		System.out.println("Returned to Parent Window: " + driver.getTitle());

		Thread.sleep(1000);
		
		// ============================================================
		// SCENARIO 5: FILE DOWNLOAD
		// ============================================================
		System.out.println("--- 5. Handling Download ---");
		driver.findElement(By.xpath("//span[contains(text(),'Download ')]")).click();
		// Verification would typically involve checking the downloads folder on your OS

		System.out.println("Test Execution Finished.");
		driver.quit(); // Uncomment to close the browser automatically
	}
}
package working_with_actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        
        // 1. Setup Driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationwithpiyush.vercel.app/actions.html"); // Replace with local path or URL

        // 2. Initialize Actions Class
        Actions act = new Actions(driver);

        // --- SCENARIO: Match Ottawa to Canada ---

        // 3. Locate the Source Element (The Capital)
        WebElement sourceCapital = driver.findElement(By.id("cap-ottawa"));

        // 4. Locate the Target Element (The Country)
        WebElement targetCountry = driver.findElement(By.id("target-canada"));

        // 5. Perform the Drag and Drop
        // logic: Click & Hold Source -> Move to Target -> Release
        act.dragAndDrop(sourceCapital, targetCountry).perform();
        
        /* * ALTERNATIVE METHOD (If dragAndDrop is flaky):
         * act.clickAndHold(sourceCapital)
         * .moveToElement(targetCountry)
         * .release()
         * .build()
         * .perform();
         */

        // 6. Validation
        // The HTML changes the text to "Canada: MATCHED" and adds a green class upon success.
        String actualText = targetCountry.getText();
        
        if(actualText.contains("MATCHED")) {
            System.out.println("Success! Ottawa was dropped correctly.");
        } else {
            System.err.println("Failed! Element did not match.");
        }

        // Optional: Solve for Madrid -> Spain
        WebElement sourceMadrid = driver.findElement(By.id("cap-madrid"));
        WebElement targetSpain = driver.findElement(By.id("target-spain"));
        act.dragAndDrop(sourceMadrid, targetSpain).perform();

        // Teardown
        // driver.quit();
    }
}
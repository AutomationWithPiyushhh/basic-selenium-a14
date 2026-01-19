package working_with_actions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class AWP_actions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        driver.get("https://automationwithpiyush.vercel.app/actions.html"); 
        
        Actions actions = new Actions(driver);

        WebElement hoverBox = driver.findElement(By.id("hover-box"));
        actions.moveToElement(hoverBox).perform();
        System.out.println("Step 1: Hover performed.");
        Thread.sleep(2000);

        WebElement clickTarget = driver.findElement(By.id("click-target"));
        actions.click(clickTarget).perform();
        System.out.println("Step 2: Standard click performed.");
        Thread.sleep(2000);

        WebElement contextArea = driver.findElement(By.id("context-area"));
        actions.contextClick(contextArea).perform();
        System.out.println("Step 3: Right-click diagnostic performed.");
        Thread.sleep(2000);

        WebElement doubleClickBtn = driver.findElement(By.id("double-click-target"));
        actions.doubleClick(doubleClickBtn).perform();
        System.out.println("Step 4: Double-tap successful.");
        Thread.sleep(2000);

        WebElement holdTarget = driver.findElement(By.id("hold-target"));
        actions.clickAndHold(holdTarget).pause(Duration.ofSeconds(3)).release().perform();
        System.out.println("Step 5: Pressure applied (Click & Hold).");
        Thread.sleep(2000);

        WebElement source = driver.findElement(By.id("drag-source"));
        WebElement target = driver.findElement(By.id("drop-target"));
        actions.dragAndDrop(source, target).perform();
        System.out.println("Step 6: Transplant successful (Drag & Drop).");
        Thread.sleep(2000);

        WebElement slider = driver.findElement(By.id("precision-seekbar"));

        int width = slider.getSize().getWidth();
        
        actions.moveToElement(slider).moveByOffset(width / 5, 0).click().perform();
        System.out.println("Step 7: Slider moved to Tachycardia.");
        Thread.sleep(2000);
        
        actions.moveToElement(slider,-width/5, 0).click().perform();
        System.out.println("Step 7: Slider moved to Bradycardia.");
        
        Thread.sleep(10000);
        driver.quit();
    }
}
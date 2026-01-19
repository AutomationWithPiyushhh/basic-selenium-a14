package working_with_dd;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDD {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("C:/Users/User/git/basic-14/basic-selenium-a14/src/test/java/HTML/dd.html");
		
//		create object for dropdown webelement
		WebElement dayDD = driver.findElement(By.cssSelector("select[title='Day']"));
		
//		Create object for select class
		Select selDay = new Select(dayDD);
		
		
//		Perform the task
		selDay.selectByIndex(0);

		
//		create object for dropdown webelement
		WebElement hobbiesDD = driver.findElement(By.id("hobbies"));
		
//		Create object for select class
		Select selHob = new Select(hobbiesDD);
		
		
//		Perform the task
		selHob.selectByIndex(0);
		Thread.sleep(1000);
		selHob.selectByValue("s");
		Thread.sleep(1000);
		selHob.selectByVisibleText("Playing Volleyball");
		
//		deselection
		Thread.sleep(1000);

		if (selDay.isMultiple()) {
			selDay.deselectAll();
		}
		
		if (selHob.isMultiple()) {
			selHob.deselectAll();
		}
		
		
		WebElement yearDD = driver.findElement(By.id("year"));
		Select selYear = new Select(yearDD);
		
		List<WebElement> years = selYear.getOptions();
		for (WebElement i : years) {
			String yearText = i.getText();
			System.out.println(yearText);
		}
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}

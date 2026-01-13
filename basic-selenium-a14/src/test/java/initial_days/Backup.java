package initial_days;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Backup {
	public static void main(String[] args) {
//		ChromeDriver driver1 = new ChromeDriver();
//		EdgeDriver driver2 = new EdgeDriver();
//		FirefoxDriver driver3 = new FirefoxDriver();

//		RemoteWebDriver driver1 = new ChromeDriver();
//		RemoteWebDriver driver2 = new EdgeDriver();
//		RemoteWebDriver driver3 = new FirefoxDriver();

//		an object showing different behaviour at the diff stages of lifecycle
//		RemoteWebDriver driver = new ChromeDriver();
//						driver = new EdgeDriver();
//						driver = new FirefoxDriver();
						
		WebDriver driver = new ChromeDriver();
		/* The first line of code explanation
		 * webdriver is a type
		 * driver is the ref var
		 * new is a keyword which will create random memory space in heap area
		 * CD() will do 3 jobs
		 * 		1. it will load, register, re-initialize the ns members in the heap area
		 * 		2. it will start the server
		 * 		3. it will launch the empty browser
		*/
//						driver = new EdgeDriver();
//						driver = new FirefoxDriver();
		
		
		
		/* 1. get(String url) => void
		 * 
		 * 2. getTitle() => String title
		 * 3. getCurrentUrl() => String url
		 * 4. getPageSource() => String source code
		 * 
		 * 5. close() => void
		 * 		it will close current window
		 * 		it will not stop the server
		 * 6. quit() => void
		 * 		it will close all windows 
		 * 		it will stop the server
		 * 
		 * 7. manage() => Options <<I>>
		 * 			to manage
		 * 				1. window() => Window <<I>>
		 * 								1. maximize()
		 * 								2. minimize()
		 * 								3. fullScreen()
		 * 								4. getSize()
		 * 								5. setSize()
		 * 								6. getPosition()
		 * 								7. setPosition()
		 * 				2. timeOuts()
		 * 				3. cookies => 6 methods
		 * 
		 * 8. navigate()
		 * 
		 * 9. getWindowHandle()
		 * 10. getWindowHandles()
		 * 11. switchTo()
		 * 
		*/
						
			driver.get("https://www.facebook.com/");
			
			driver.quit();
	}
}

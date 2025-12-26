package initial_days;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
// ctrl + shift + O

public class FirstLineOfCode {
	public static void main(String[] args) {
//		Creating object for diff browserDriver classes
//		ChromeDriver driver1 = new ChromeDriver();		
//		EdgeDriver driver2 = new EdgeDriver();
//		FirefoxDriver driver3 = new FirefoxDriver();

//		Upcasted till RemoteWebDriver
//		RemoteWebDriver driver1 = new ChromeDriver();		
//		RemoteWebDriver driver2 = new EdgeDriver();
//		RemoteWebDriver driver4 = new FirefoxDriver();

//		upcasted till webdriver level because of heavy load in RemoteWebDriver
//		WebDriver driver1 = new ChromeDriver();		
//		WebDriver driver2 = new EdgeDriver();
//		WebDriver driver3 = new FirefoxDriver();


//		polymorphism
//		  WebDriver driver = new ChromeDriver();
//					driver = new EdgeDriver();					
//					driver = new FirefoxDriver();

//		First Line of code
		WebDriver driver = new ChromeDriver();
		/*
		 * 
		 * webdriver is a type
		 * driver is a ref variable
		 * new is a keyword which will create random memory space in heap area
		 * CD() is cons call which will do three jobs
		 * 1> it will load , reg. and re-initialize the non static members into heap area
		 * 2> it will start the server 
		 * 3> it will launch the empty browser 
		*/
		
	}
}

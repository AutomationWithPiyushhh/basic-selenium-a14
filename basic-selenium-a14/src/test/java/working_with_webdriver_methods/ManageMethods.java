package working_with_webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
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

//		win.maximize();
//		Thread.sleep(1000);
//		win.minimize();
//		Thread.sleep(1000);
//		win.fullscreen();
//		Thread.sleep(2000);
//		driver.quit();

//		getSize() => Dimension <<C>>
//		Dimension dim = win.getSize();
//		int w = dim.getWidth();
//		int h = dim.getHeight();
//
//		System.out.println("width : " + w);
//		System.out.println("height : " + h);
//
//		System.out.println(dim);
		
//		setSize(Dimension ka object);
		Dimension dim2 = new Dimension(550, 550);
		win.setSize(dim2);
		
//		getPosition() => Point <<C>>
//		Point pt1 = win.getPosition();
//		int x = pt1.getX();
//		int y = pt1.getY();
//
//		System.out.println(x);
//		System.out.println(y);
//
//		System.out.println(pt1);
		
//		setPosition(Point ka object);
		Point pt2 = new Point(400, 200);
		driver.manage().window().setPosition(pt2);
		

		Thread.sleep(5000);
		driver.quit();

	}
}

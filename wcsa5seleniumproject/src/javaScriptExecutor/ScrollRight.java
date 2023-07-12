package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRight {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch the application
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		//To perform scrolling operations
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//Scroll Right
		jse.executeScript("window.scrollBy(5000,0)");
	}

}

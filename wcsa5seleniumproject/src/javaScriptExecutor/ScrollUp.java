package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch the aaplication
		driver.get("https://www.selenium.com/");
		//To perform scrolling operations
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		//Scroll Down
		jse.executeScript("window.scrollBy(0,1000)");
		//Scroll Up
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-1000)");
	}

}

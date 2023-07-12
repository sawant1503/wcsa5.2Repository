package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledWebElement {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch the Web application
		driver.get("C:\\Users\\ADMIN\\OneDrive\\Desktop\\wcsa5\\WebElement\\Disabled.html");
				
		//identify WebElement
		driver.findElement(By.id("i1")).sendKeys("admin");
        driver.findElement(By.id("i2")).sendKeys("manager");
       // Thread.sleep(2000);
	}

}

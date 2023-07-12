package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://not_for_you/login.do");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.name("username")).sendKeys("admin");//username textbox
		      Thread.sleep(2000);
	        
	        driver.findElement(By.name("pwd")).sendKeys("manager");//password textbox
		        Thread.sleep(2000); 

	        driver.findElement(By.id("loginButton")).click();
	        Thread.sleep(2000); 

	}

}

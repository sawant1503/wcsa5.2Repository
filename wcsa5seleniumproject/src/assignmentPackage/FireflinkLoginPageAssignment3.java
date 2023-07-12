package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FireflinkLoginPageAssignment3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://app.fireflink.com/");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.name("emailId")).sendKeys("pratikshasawant7105@gmail.com");//email textbox
		       // Thread.sleep(2000);
	        
	        driver.findElement(By.id("mui-2")).sendKeys("Password@123");//password textbox
		        Thread.sleep(2000); 

	        driver.findElement(By.className("primary-btn")).click();
	}
}

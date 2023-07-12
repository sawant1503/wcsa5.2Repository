package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubLoginPageAssignment4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://github.com/login");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.name("login")).sendKeys("pratikshasawant7105@gmail.com");//username or email textbox
		       // Thread.sleep(2000);
	        
	        driver.findElement(By.id("password")).sendKeys("pattu@123");//password textbox
		        Thread.sleep(2000); 

	        driver.findElement(By.className("btn btn-primary btn-block js-sign-in-button")).click();
	}

}
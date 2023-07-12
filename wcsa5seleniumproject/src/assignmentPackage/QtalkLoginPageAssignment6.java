package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QtalkLoginPageAssignment6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://chat.qspiders.com/");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.name("number")).sendKeys("9552846002");
		       // Thread.sleep(2000);
	        
	        driver.findElement(By.name("password")).sendKeys("prat6002");
		        Thread.sleep(2000); 

	        driver.findElement(By.className("rs-btn rs-btn-default rs-btn-disabled")).click();

	}

}



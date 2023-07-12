package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("C:\\Users\\ADMIN\\OneDrive\\Desktop\\wcsa5\\WebElement\\simpleLogin.html");
		 Thread.sleep(2000);
		 
		 //tagName
		// driver.findElement(By.tagName("input")).sendKeys("admin");//username textbox
	    //Thread.sleep(2000);
	        
	     //driver.findElement(By.tagName("input")).sendKeys("manager");//password textbox
	      //Thread.sleep(2000);
		        
		  // driver.findElement(By.id("i1")).sendKeys("admin");//username textbox
	      //Thread.sleep(2000);
			        
	      //driver.findElement(By.id("i2")).sendKeys("manager");
	      //Thread.sleep(2000);
		 
		 driver.findElement(By.name("username")).sendKeys("admin");//username textbox
	      Thread.sleep(2000);
			        
	      driver.findElement(By.name("password")).sendKeys("manager");
	      Thread.sleep(2000);
			        
	}

}

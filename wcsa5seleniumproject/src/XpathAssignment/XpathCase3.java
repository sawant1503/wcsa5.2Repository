package XpathAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
	        driver.manage().window().maximize();
	        driver.get("https://affiliate.flipkart.com/login");
	        Thread.sleep(2000);
	        
	        //multiple attribute using or
	        driver.findElement(By.xpath("//input[@type='email' or @id='inputEmail']")).sendKeys("pratikshasawant7105@gmail.com");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@type='password' and @id='inputPassword']")).sendKeys("pattu@1503");
	}

}

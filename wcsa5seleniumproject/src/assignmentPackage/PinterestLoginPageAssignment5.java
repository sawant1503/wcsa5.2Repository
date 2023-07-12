package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PinterestLoginPageAssignment5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://in.pinterest.com/login/");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.id("email")).sendKeys("pratikshasawant7105@gmail.com");//email textbox
		       // Thread.sleep(2000);
	        
	        driver.findElement(By.id("password")).sendKeys("sawant");//password textbox
		        Thread.sleep(2000); 

	        driver.findElement(By.className("zI7 iyn Hsu")).click();

	}

}

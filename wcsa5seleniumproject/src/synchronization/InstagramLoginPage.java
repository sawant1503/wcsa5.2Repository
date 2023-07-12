package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d']")).sendKeys("pratiksha_9715");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("p@ttu1503");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("p@ttu1503");
	}

}

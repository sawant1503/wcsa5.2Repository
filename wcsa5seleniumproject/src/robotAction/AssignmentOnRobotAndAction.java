package robotAction;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnRobotAndAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    //launch blue stone
	    driver.get("https://www.bluestone.com/");
	    		
	    		
	    //handle hidden division pop up
	    driver.findElement(By.id("denybtn")).click();
	    
	    //Move to watch jwellary
	    Actions act = new Actions(driver);
	    WebElement target = driver.findElement(By.xpath("//a[text()='Watch' Jewellary']"));
	    act.moveToElement(target).perform();
	    
	    driver.findElement(By.xpath("//a[text()='Band']")).click();
	    Thread.sleep(4000);
	    //click and hold filter by text
	    WebElement target2 = driver.findElement(By.xpath("//div[text()='Filter by']"));
	    
	    for (int i = 1; i<=2; i++) 
	    {
		 act.doubleClick(target2).perform();
		 act.clickAndHold(target2).perform();
		}
	    Thread.sleep(4000);
	    //copy the filter by Text
	    Robot robot = new Robot();
	    

}
}

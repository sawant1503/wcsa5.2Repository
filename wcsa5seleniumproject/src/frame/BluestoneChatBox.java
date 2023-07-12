package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BluestoneChatBox {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://www.bluestone.com/");
    
    //Handle hidden division pop up
    driver.findElement(By.id("denyBtn")).click();
    
    Thread.sleep(2000);
    //identify frame by using xpath
    WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
    
    //handle the frame by switch the controls to frame..
//    driver.switchTo().frame(5);//handle frame by using index
//    driver.switchTo().frame("fc_widget");//handle frame by using name or id
      driver.switchTo().frame(frameElement);
    
      WebElement chatBox = driver.findElement(By.id("chat-icon"));
      chatBox.click();
      
       
//    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'d-hotline h')]"))).click();
    
      //switch the control again back the main web page
      driver.switchTo().defaultContent();
      
      Thread.sleep(2000);
      driver.findElement(By.id("chat-fc-name")).sendKeys("Pratiksha");
      driver.findElement(By.id("chat-fc-email")).sendKeys("pratikshasawant7105@gmail.com");
      driver.findElement(By.id("chat-fc-phone")).sendKeys("9876567833");
	}

}

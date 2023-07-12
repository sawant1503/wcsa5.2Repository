package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("C:\\Users\\ADMIN\\OneDrive\\Desktop\\wcsa5\\WebElement\\confirmation.html");
		//To generate confirmation Pop up to click on submit button
       driver.findElement(By.tagName("input")).click();
       //handle confirmation pop up by using switchTo();
       Thread.sleep(2000);
       Alert al = driver.switchTo().alert();
       //al.accept();//accept the confirmation pop up
       //al.dismiss();
       System.out.println(al.getText());
       al.accept();
	}

}

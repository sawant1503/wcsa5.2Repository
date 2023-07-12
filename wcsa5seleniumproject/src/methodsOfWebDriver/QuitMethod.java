package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		Thread.sleep(4000);
		//close parent as well as child browser
		driver.quit();

	}

}

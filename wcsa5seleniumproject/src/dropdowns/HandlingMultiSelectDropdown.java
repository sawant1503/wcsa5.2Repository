package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("C:\\Users\\ADMIN\\OneDrive\\Desktop\\wcsa5\\WebElement\\MultipleSelectDropdown.html");
		
	    WebElement multiSelectDD=driver.findElement(By.id("menu"));
	    Select sel=new Select(multiSelectDD);
	    
	    //To select Using Index
	    sel.selectByIndex(1);
	    
	    //To select using visible Text
	    sel.selectByVisibleText("Panni Puri");
	    
	    //To select using  Value
	    sel.selectByValue("v5");
	    
	    //To deselect using Index
	    sel.deselectByIndex(3);
	    Thread.sleep(2000);
	    
	    //To deselect using visible text
	    sel.deselectByVisibleText("Misal Pav");
	    
	    //To deselect using value
	    sel.deselectByValue("v5");
	    Thread.sleep(2000);
	    
	    //To select multiple options using for loop
	    for (int i = 0; i < 5; i++)
	    {
	    	sel.selectByIndex(i);
	    	Thread.sleep(1000);
		}
	    Thread.sleep(3000);
	    
	    //To deselect multiple options using for loop
//     for (int i = 0; i < 5; i++)
//	    {
//	    	sel.deselectByIndex(i);
//	    	Thread.sleep(1000);
//		}
	    
	    //To deselect all option using deselectAll()
	    sel.deselectAll();
	}
}
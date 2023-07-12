package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskToSelectOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("C:\\Users\\ADMIN\\OneDrive\\Desktop\\wcsa5\\WebElement\\SingleSelectDropdown.html");
        
        //identify dropdown on Webpage
        WebElement dropDownElement = driver.findElement(By.id("menu"));
        
        //Handle the dropdown by creating obj of select...
        Select sel = new Select(dropDownElement);
        
        //read all the option of dropdown
        List<WebElement> allOps = sel.getOptions();
        
        //to read list use looping statement
        for(WebElement op:allOps)
        {
        	if(op.getText().equals("Pav Bhaji"))
        	{
        		Thread.sleep(2000);
        		op.click();
        		break;
        	}
        }

	}

}

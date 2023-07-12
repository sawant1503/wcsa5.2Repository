package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeSynchronization {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://not_for_you/login.do");
        
        String actualTitleOfLoginPage= driver.getTitle();
        if (actualTitleOfLoginPage.equals("actitIME - Login"))
        {
        	System.out.println("Title is matched,Test case Passed");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.name("loginButton")).click();
		}
        else {
			System.out.println("We will get Exception!!");
		}
        //Home page
        
        String actualTitleOfHomePage= driver.getTitle();
        
        WebDriverWait wait= new  WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.titleContains("actitIME - Enter Time-Track"));
       
        System.out.println("Title is matched,test case Passed!!");
        //driver.findElement(By.linkText("Logout")).click();
	}

}

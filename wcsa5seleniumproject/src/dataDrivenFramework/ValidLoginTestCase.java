package dataDrivenFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://not_for_you/login.do");
		
		//read the data from excel file and test the login page
		Flib flib = new Flib();
		
		  driver.findElement(By.name("username")).sendKeys("./data/ActiTimeTestData.xlsx","validcreds",1,0));
		  driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx", "validcreds", 1,1 ));
		  driver.findElement(By.id("loginButton")).click();
	}
}

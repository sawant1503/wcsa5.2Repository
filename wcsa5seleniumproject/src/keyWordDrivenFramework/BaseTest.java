package keyWordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IautoConstatnt{
	
	public void openbrowser() throws IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readpropertyData(PROP_PATH, "Browser");
		String url = flib.readpropertyData(PROP_PATH, "Url");
		
		if (browserValue.equalsIgnoreCase("chrome"))
		{
		 System.setProperty(CHROME_KEY, CHROME_PATH);
		 ChromeDriver driver = new ChromeDriver();//to launch browser
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get(url);//URL stored in property file
		}
		
		else if(browserValue.equalsIgnoreCase("Firefox"))
		{
		 System.setProperty(GECKO_KEY, GECKO_PATH);
		 
		}
	}

}

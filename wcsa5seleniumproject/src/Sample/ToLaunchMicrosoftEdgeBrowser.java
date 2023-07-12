package Sample;

import org.openqa.selenium.edge.EdgeDriver;

public class ToLaunchMicrosoftEdgeBrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.msedge.driver","./drivers.msedgedriver.exe");
     new EdgeDriver();
	}
}

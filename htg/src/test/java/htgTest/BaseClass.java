package htgTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	
	public static WebDriver OpenChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/browserFile/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
	}
	public static WebDriver OpenEdgeBrowser() {
		System.setProperty("webdriver.edge.driver", "src/test/resources/browserFile/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();

		return driver;
	}


}

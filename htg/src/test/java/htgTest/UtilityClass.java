package htgTest;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	
	public static void captureScreen1(WebDriver driver, String testID) throws IOException {
		// TODO Auto-generated method stub
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		DateTimeFormatter dt1=DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
		String fd=dt.format(dt1);
		System.out.println(fd);
		String filename=fd.toString().replace(":", " ")+".jpeg";
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("test-output\\failedTestScreenshot" +  filename);
		FileHandler.copy(src, dest);
	}
	

}

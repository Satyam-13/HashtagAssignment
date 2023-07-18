package htgTest;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import careerPage.CareerPage;

public class VerifyCareerPage {
	WebDriver driver;
	CareerPage cp;
	
	@BeforeTest
	public void Openbrowser(String BrowserName) {
		if (BrowserName.equals("Chrome"))
		{
			driver=BaseClass.OpenChromeBrowser();
			
		}
		if (BrowserName.equals("Edge"))
		{
			driver=BaseClass.OpenEdgeBrowser();
			
		}
		driver.manage().window().maximize();

		
	}
	@BeforeClass
	public void createPOMObject() {
		
	    cp=new CareerPage(driver);
		cp.SendName();
		cp.SendEmail();
		cp.SendPhone();
		cp.SendDescription();
		
	}
	@BeforeMethod
	public void gotoCareerPage() {
		driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
		cp.ClickApply();
	}
	@Test
	public void verifyURL() {
		String actURL=driver.getCurrentUrl();
		System.out.println(actURL);
		String expURL="https://www.hashtag-ca.com/careers/apply?jobCode=QAE001";
			Assert.assertEquals(actURL, expURL);
	}
	@Test
	public void titlePage() {
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	
	@Test
	public void brokenLink() {
		
		List<WebElement> link= cp.linkPresent();
		for(int i=0;i<link.size();i++) {
			WebElement l1=link.get(i);
			String a=l1.getTagName();
			String brokenLink=l1.getAttribute(a);
			String attributeValu="href";
			Assert.assertEquals(brokenLink, attributeValu);
			
		}
			
	}
	@AfterMethod
	public void clearData() {
		System.out.println("After Method");
	}
	@AfterClass
	public void clearObject() {
		cp=null;
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
		driver=null;
		System.gc();
	}

}

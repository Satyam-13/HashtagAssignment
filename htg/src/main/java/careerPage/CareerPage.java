package careerPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareerPage {
	WebDriver driver;
	@FindBy(xpath="//a")
	private List<WebElement>link;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement Name;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement Phone;
	
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement Description;
	
	@FindBy(xpath="//button[text()='APPLY NOW']")
	private WebElement ApplyNow;
	
	
	
	public CareerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	
	public void SendName() {
		Name.sendKeys("SATYAM");
		
    }
	
	public void SendEmail() {
		Email.sendKeys("abc@gmail.com");
		
    }
	public void SendPhone() {
		Phone.sendKeys("9999999999");
		
    }
	public void SendDescription() {
		Description.sendKeys("Having 3+ years of experience in Software Testing");
	}
	public void ClickApply() {
		ApplyNow.click();
	}

	public String textOnName1() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<WebElement> linkPresent() {
		driver.getWindowHandles();
		return null;
	}
}

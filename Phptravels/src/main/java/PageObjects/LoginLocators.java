package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Abstract.AbstarctClass;

public class LoginLocators extends AbstarctClass{
	
	WebDriver driver;
	public LoginLocators(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//*[text()='Login']")
	WebElement loginlink;
	
	@FindBy(xpath="//*[@id='inputEmail']")
	WebElement email;
	
	@FindBy(css="input[id='inputPassword']")
	WebElement password;
	
	
	@FindBy(css="button[id='login']")
	WebElement loginBtn;
	
	public void landPage()
	{
		driver.get("https://phptravels.com/demo/");
		loginlink.click();
	}
	public void login(String emailPara, String passwordpara) throws InterruptedException {
		
		windowSwitch();
		email.sendKeys(emailPara);
		password.sendKeys(passwordpara);
		Thread.sleep(4000);
		loginBtn.click();
	}

}

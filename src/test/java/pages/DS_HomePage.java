package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DS_HomePage {

	WebDriver driver;
	public DS_HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()=\"Get Started\"]")
	private WebElement getStarted;
	
	@FindBy(xpath="//*[text()=\" Register \"]")
	private WebElement register;

	@FindBy(xpath="//*[text()=\"Sign out\"]")
	private WebElement signOut;
	
	@FindBy(xpath="//*[text()=\"Sign in\"]")
	private WebElement signin;
	
	@FindBy(xpath="//a[contains(@href,\"data-structures-introduction\")]")
	private WebElement ds_intro;
	
	@FindBy(xpath="//*[text()=\"Data Structures\"]")
	private WebElement dataStructuredropdown;
	
	@FindBy(xpath="//*[text()=\"Arrays\"]")
	private WebElement Arraysoptions;
	
	
	
	

	
	public void clickOnRegisterLink()
	{
		register.click();
	}

	public boolean signOutLink()
	{
		return signOut.isDisplayed();
	}
	public void clickOngetStarted()
	{
		getStarted.click();
	}
	
	public String getHomePageTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public String getRegisterPageTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public void clickOnSignin()
	{
		signin.click();
	}

	public void clickOnDSintroLink()
	{
		ds_intro.click();
	}
	
	public void gotoArraysPage()
	{
		dataStructuredropdown.click();
		Arraysoptions.click();
	}


}
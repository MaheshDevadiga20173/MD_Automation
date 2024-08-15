package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class NewCustomerCreationAppPage1 extends BaseClass {

WebDriver driver;
	
	public NewCustomerCreationAppPage1(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
    }
	
	@FindBy(xpath="//a[text()='New Customer']")
	WebElement newCustomer;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement cust_Name;
	
	@FindBy(xpath="(//input[@name='rad1'])[1]")
	WebElement gender;
	
	@FindBy(xpath="//input[@name='dob']")
	WebElement dateOfBirth;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement addr;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement state;
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement pin;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement telno;
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement submit;
	
	public void clickNewCustlink()
	{
		newCustomer.click();
	}
	
	
	public void addCustName(String name)
	{
		cust_Name.sendKeys(name);
	}
	
	public void selectgender()
	{
		gender.click();
	}
	
	public void addDOB(String dateofBirth)
	{
		dateOfBirth.sendKeys(dateofBirth);
	}
	
	public void addAddress(String address)
	{
		addr.sendKeys(address);
	}
	
	public void addCity(String City)
	{
		city.sendKeys(City);
	}
	
	public void addState(String State)
	{
		state.sendKeys(State);
	}
	
	public void addPIN(String PIN)
	{
		pin.sendKeys(PIN);
	}
	
	public void addTeleNo(String TeleNo)
	{
		telno.sendKeys(TeleNo);
	}
	
	public void addEmail(String Email)
	{
		email.sendKeys(Email);
	}
	
	public void addPassword(String Password)
	{
		password.sendKeys(Password);
	}
	
	public void clickSubmit()
	{
		submit.click();
	}
}

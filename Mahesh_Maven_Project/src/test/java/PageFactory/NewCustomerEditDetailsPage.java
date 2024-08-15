package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class NewCustomerEditDetailsPage extends BaseClass {

	
WebDriver driver;
	
	public NewCustomerEditDetailsPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
    }
	
	@FindBy(xpath="//a[text()='Edit Customer']")
	WebElement editCustomer;
	
	@FindBy(xpath="//input[@name='cusid']")
	WebElement cust_EditID;
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	WebElement editSubmit;
	
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement newaddr;
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement newpin;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement newtelno;

	@FindBy(xpath="//input[@value='Submit']")
	WebElement newsubmit;
	
	public void clickEditCustlink()
	{
		editCustomer.click();
	}
	
	public void EditCustID(String CustID)
	
	{
		cust_EditID.sendKeys(CustID);
	}
	
	public void clickSubmit()
	{
		editSubmit.click();
	}
	
	public void addAddress(String addr)
	{
		newaddr.sendKeys(addr);
	}
	
	public void addPin(String PINNew)
	{
		newpin.sendKeys(PINNew);
	}
	
	public void addTeleNo(String TelNoNew)
	{
		newtelno.sendKeys(TelNoNew);
	}
	
	public void clickEditSubmit()
	{
		newsubmit.click();
	}
}

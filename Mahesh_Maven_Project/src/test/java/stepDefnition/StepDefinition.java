package stepDefnition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import PageFactory.NewCustomerCreationAppPage;
import PageFactory.NewCustomerCreationAppPage1;
import PageFactory.NewCustomerEditDetailsPage;
import PageFactory.NewLoginPage;
import Utilities.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	WebDriver driver =BaseClass.initializeDriver();
	NewLoginPage obj1=new NewLoginPage(driver);
	NewCustomerCreationAppPage obj2=new NewCustomerCreationAppPage(driver);
	NewCustomerCreationAppPage1 obj3=new NewCustomerCreationAppPage1(driver);
	NewCustomerEditDetailsPage obj4= new NewCustomerEditDetailsPage(driver);
	
	
	@Given("User open the URL of the application")
	public void user_open_the_url_of_the_application() {
		
		System.out.println("Application Launched");
	}
	
	@And("User will enter the username with {string}")
	public void user_will_enter_the_username_with(String username) {
		
		obj1.enterUsername(username);
	}
	
	@Given("User will enter the password with {string}")
	public void user_will_enter_the_password_with(String password) {
		
		obj1.enterPassword(password);
	}

	
	
	@When("User clicks onLogin button")
	public void user_clicks_on_login_button() {
	  
		obj1.clickOnSubmit();
	}

	@Then("User will be able to login to the application")
	public void user_will_be_able_to_login_to_the_application() throws IOException {
		
		getTitle();
		takescreenshot();	
	}

	
	@Then("User will click on the new Customer link in the app")
	public void user_will_click_on_the_new_customer_link_in_the_app() throws InterruptedException {
		obj2.clickNewCustlink();
		addHardCodedwait();
		
	}

	@Then("User will enter the customer name in app as {string}")
	public void user_will_enter_the_customer_name_as(String Customer_Name) {
		obj2.addCustName(Customer_Name);
		//scrollDown();
	}

	@Then("User will select the gender in app")
	public void user_will_select_the_gender_in_app() {
		obj2.selectgender();
	}

	@Then("User will enter dOB in app as {string}")
	public void user_will_enter_d_ob_in_app_as(String DOB) {
		 obj2.addDOB(DOB);
	}

	@Then("User will enter the addrress in app as {string}")
	public void user_will_enter_the_addrress_in_app_as(String Address) {
	   
		obj2.addAddress(Address);
	}

		

@Then("User will enter the city in app as {string}")
public void user_will_enter_the_city_in_app_as(String city) {
    obj3.addCity(city);
}

@Then("User will enter the state in app as {string}")
public void user_will_enter_the_state_in_app_as(String state) {
   obj3.addState(state);
}

@Then("User will enter the pincode in app as {string}")
public void user_will_enter_the_pincode_in_app_as(String pin) {
   obj3.addPIN(pin);
}

@Then("User will enter the mobile Number in app as {string}")
public void user_will_enter_the_mobile_number_in_app_as(String telno) {
 obj3.addTeleNo(telno);
}

@Then("User will enter the emaiul in app as {string}")
public void user_will_enter_the_emaiul_in_app_as(String email) {
  obj3.addEmail(email);
}

@Then("User will enter the password in app as {string}")
public void user_will_enter_the_password_in_app_as(String password) {
    obj3.addPassword(password);
}

@When("User clicks on Submit button")
public void user_clicks_on_submit_button() throws IOException {
    obj3.clickSubmit();
    takescreenshot();
}






@Then("User will click on the Edit Customer link in the app")
public void user_will_click_on_the_edit_customer_link_in_the_app() throws InterruptedException {
 	obj4.clickEditCustlink();
    Thread.sleep(5000);
}


@Then("User will enter the CustomerID as {string}")
public void user_will_enter_the_existing_customer_id_with(String CustID) {
 obj4.EditCustID(CustID);
 
}

@When("the User clicks on Submit")
public void the_user_clicks_on_submit() {
   obj4.clickEditSubmit();
}


@Then("User amend the address in App as {string}")
public void user_amend_the_address_in_app_as(String adr) {
   obj4.addAddress(adr);
}

@Then("User amend the pin as {string}")
public void user_amend_the_pin_as(String PINNew) {
 obj4.addPin(PINNew);
}

@Then("User amend the Mobile Number as {string}")
public void user_amend_the_mobile_number_as(String TelNoNew) {
 obj4.addTeleNo(TelNoNew);
	
}

@Then("user clicks on submit")
public void user_clicks_on_submit() {
 
	obj4.clickSubmit();
}




	
	
}

package com.bdd.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestRegister extends TestExecutor {
	
	@Given("User launches chrome browser and open a test URL {string}")
	public void user_launches_chrome_browser_and_open_a_test_URL(String url) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\bddframework\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html"); // to open url
		
	
	}

	@When("User click firstname textbox and enter a value {string}")
	public void user_click_firstname_textbox_and_enter_a_value(String firstname) {
		reg.enterFirstName(firstname);
	}

	@When("User click lastname textbox and enter a value {string}")
	public void user_click_lastname_textbox_and_enter_a_value(String lastname) {
		reg.enterLastName(lastname);
	}

	@When("User click address textbox and enter a value {string}")
	public void user_click_address_textbox_and_enter_a_value(String Address) {
		reg.enterAddress(Address);
	}

	@When("User click email textbox and enter a value {string}")
	public void user_click_email_textbox_and_enter_a_value(String email) {
		reg.enterEmail(email);
	}

	@When("User click phone number textbox and enter a value {string}")
	public void user_click_phone_number_textbox_and_enter_a_value(String phonenum) {
		reg.enterPhoneNumber(phonenum);
	}

	@When("User click {string} radio button")
	public void user_click_radio_button(String radiobutton) {
		reg.clickRadioButton(radiobutton);
	}
	@Then("user validate {string} radiobutton is selected")
	public void user_validate_radiobutton_is_selected(String radioButton) {
		reg.validateRadioButton(radioButton);

	}
	//@Then("User validate {String} radio button is selected")
	//public void user_validate_Male_radio_is_selected(String radioButton ) {
	//	WebElement RadioButton = driver.findElement(By.xpath("//input[@value='+radioButton+']"));

	//	if(RadioButton.isSelected())
	//	{
	//		System.out.println("Radio button is selected");
	//	}
	//	else 
		{
	//		System.out.println("Radio button is not selected");
		}

//	}

	@When("User click movie checkbox")
	public void user_click_movie_checkbox() {
		WebElement MovieCheckbox = driver.findElement(By.id("checkbox2"));

		MovieCheckbox.click();
	}

	@Then("User validate movie ckeckbox is checked")
		public void user_validate_movie_ckeckbox_is_checked() {
	WebElement MovieCheckbox = driver.findElement(By.id("checkbox2"));
		if(MovieCheckbox.isSelected())
	{
	System.out.println("Movie check box is checked");
	}
else
{
	System.out.println("Movie checkbox is unchecked");
}
	}
	}





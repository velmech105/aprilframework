package com.bdd.pages;

import org.openqa.selenium.By;
import com.bdd.stepdefinition.TestExecutor;

public class Register extends TestExecutor
	{
		
		
		public String FirstName = "//input[@placeholder='First Name']";
		public String LastName = "//input[@placeholder='Last Name']";
		public String addre ="textarea";
		public String emailID = "//input[@ng-model='EmailAdress']";
		public String phoneNumberr = "//input[@ng-model='Phone']";
		
		
		
		
		public void enterFirstName(String fname)
		{
			com.enterValue(By.xpath(FirstName), fname);
		}
		
		public void enterLastName(String lastname)
		{

			com.enterValue(By.xpath(LastName), lastname);
		}
		
		
		public void enterAddress(String addr)
		{
			com.enterValue(By.tagName(addre), addr);
		}
		
		
		public void enterEmail(String email)
		{
			
			com.enterValue(By.xpath(emailID), email);
		  
		}
		
		public void enterPhoneNumber(String phonenum)
		{

			com.enterValue(By.xpath(phoneNumberr), phonenum);
		}

		public void clickRadioButton(String radiobutton)
		{
			 com.ClickElement(By.xpath("//input[@value='"+radiobutton+"']"));
			
		}
		public void validateRadioButton(String radiobutton) {
			{
				 com.ClickElement(By.xpath("//input[@value='"+radiobutton+"']"));
				
			}
			
			
		}
		

	}


 
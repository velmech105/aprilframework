package com.bdd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.bdd.stepdefinition.TestExecutor;
public class Common extends TestExecutor{

public void ClickElement(By loc)
{
	
	driver.findElement(loc).click();

}

public void clickElementByxpath(String xpath)
{
	driver.findElement(By.xpath(xpath)).click();
}


public void enterValue(By loc,String value)
{
	WebElement ele =	driver.findElement(loc);
	ele.click();
	ele.clear();
	ele.sendKeys(value);
}

public void scrollDown()
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)", "");

}


public void isSelected(By loc)
{
	WebElement ele = driver.findElement(loc);
	if(ele.isSelected())
		
	{
		System.out.println("Radio button selected");
	}
	
	else
	{
		System.out.println("Radio button is not selected");
	}
	
}

}
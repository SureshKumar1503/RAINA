package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseOfwebdriver.WebDriverUtility;

public class pomPage extends WebDriverUtility {
	
	WebDriverUtility wd= new WebDriverUtility();
	WebDriver driver;
	public pomPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}

	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement org;
	
	public void orgs() {
	org.click();	
	}
    @FindBy(xpath="//a[text()='Leads']")
    private WebElement ld;
    
    public void led() {
    	ld.click();   
    	}
}

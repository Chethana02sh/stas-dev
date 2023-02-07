package com.crm.SalesConatcts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddContactPage {

	@FindBy(id = "Contacts_editView_fieldName_firstname")private WebElement firstNameEdtTxt;
	
	@FindBy(id = "Contacts_editView_fieldName_lastname")private WebElement lastNameEdtTxt;
	
	@FindBy(xpath = "//i[@id='Contacts_editView_fieldName_account_id_create']")private WebElement SelectOrgLookUpImg; 

	@FindBy(id = "Accounts_editView_fieldName_accountname")private WebElement OrgnameEditTxtFromSelectOrgWindow;

	@FindBy(xpath = "//button[@name='saveButton']")private WebElement savebtnFromSelOrgWindow;

	@FindBy(xpath = "//td[contains(.,'Primary Email')]/..//td//input[@id='Contacts_editView_fieldName_email']")private WebElement primayMailedtTxt;

	@FindBy(xpath = "//td[contains(.,'Title')]/..//td//input[@id='Contacts_editView_fieldName_title']")private WebElement titleEdtTxt;
	
	
	@FindBy(xpath = "//button[.='Save']")private WebElement saveBtnClk;

	
	public AddContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	
	public WebElement getSaveBtnClk() {
		return saveBtnClk;
	}





	public void FirstName(String firstName)
	{
		firstNameEdtTxt.sendKeys(firstName);
	}
	public void LastName(String lastName)
	{
		lastNameEdtTxt.clear();
		lastNameEdtTxt.sendKeys(lastName);
	}
	
	public void OrgLKPmyTitle(WebDriver driver,String orgName,String PrimaryMail,String title)
	{
		SelectOrgLookUpImg.click();
		OrgnameEditTxtFromSelectOrgWindow.sendKeys(orgName);
		savebtnFromSelOrgWindow.click();
		driver.findElement(By.xpath("//button[.='Yes']")).click();
		primayMailedtTxt.sendKeys(PrimaryMail);
		titleEdtTxt.sendKeys(title);
	}
}

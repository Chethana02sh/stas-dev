package com.crm.contactsObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddContactPage {

@FindBy(id = "Contacts_editView_fieldName_firstname") private WebElement firstNameEdtTxt;

@FindBy(id = "Contacts_editView_fieldName_lastname") private WebElement lastNameEdtTxt;

@FindBy(xpath = "//i[@id='Contacts_editView_fieldName_account_id_create']")private WebElement SelectOrgLookUpImg; 

@FindBy(id = "Accounts_editView_fieldName_accountname")private WebElement OrgnameEditTxtFromSelectOrgWindow;

@FindBy(xpath = "//button[@name='saveButton']")private WebElement savebtnFromSelOrgWindow;

@FindBy(xpath = "//td[contains(.,'Primary Email')]/..//td//input[@id='Contacts_editView_fieldName_email']")private WebElement primayMailedtTxt;

@FindBy(xpath = "//td[contains(.,'Title')]/..//td//input[@id='Contacts_editView_fieldName_title']")private WebElement titleEdtTxt;


@FindBy(xpath = "//td[contains(.,'Field of Operation')]/..//div[@id='s2id_autogen7']") private WebElement selecFieldOfOperationDropdown;
@FindBy(xpath = "//div[.='Administration']") private WebElement adminstrationOption;
	
@FindBy(xpath = "//button[.='Save']") private WebElement saveBtn;


public AddContactPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}


public WebElement getContactNameEdtTxt() {
	return firstNameEdtTxt;
}


public WebElement getLastNameEdtTxt() {
	return lastNameEdtTxt;
}


public WebElement getSelecFieldOfOperationDropdown() {
	return selecFieldOfOperationDropdown;
}


public WebElement getAdminstrationOption() {
	return adminstrationOption;
}


public WebElement getSaveBtn() {
	return saveBtn;
}


public void addFirstName(String firstName)
{
	firstNameEdtTxt.sendKeys(firstName);
}
public void addLastName(String lastName)
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
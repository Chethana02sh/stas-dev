package com.crm.campaignObjectRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//a[@title='Menu']")
	private WebElement menuButtonClick;

	@FindBy(xpath = "//a[@role='button']")
	private WebElement adminButtonClick;

	@FindBy(xpath = "//a[.='Sign Out']")
	private WebElement signoutBtnClick;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getMenuButtonClick() {
		return menuButtonClick;
	}

	public WebElement getAdminButtonClick() {
		return adminButtonClick;
	}

	public WebElement getSignoutBtnClick() {
		return signoutBtnClick;
	}

	public void clickOnMenuBtn(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",menuButtonClick);
	}

	public void signoutfromApp() {
		adminButtonClick.click();
		signoutBtnClick.click();
	}
}
package com.crm.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import org.testng.Assert;

public class HomePage extends TestBase {

	@FindBy(xpath = "(//button[@aria-label='More source languages']/span)[1]/ancestor::button")
	WebElement moreSourceLanguageArrow;

	@FindBy(xpath = "(//input[@aria-label='Search languages'])[1]")
	WebElement sourceLanguage;
	
	@FindBy(xpath = "(//button[@aria-label='More target languages']/span)[1]/ancestor::button")
	WebElement moreTargetLanguageArrow;
	

	@FindBy(xpath = "(//input[@aria-label='Search languages'])[2]")
	WebElement targetLanguage;

	@FindBy(xpath = "//textarea[@aria-label='Source text']")
	WebElement sourceTextField;

	@FindBy(xpath = "//span[text()='Democracia']")
	WebElement targetTextDemocracias;

    @FindBy(xpath = "//span[text()='Demokratien']")
    WebElement targetTextDemokratien;

	@FindBy(xpath = "//span[text()='Demokratie']")
	WebElement targetTextDemokratieNew;

	@FindBy(xpath = "(//button[contains(@aria-label,'Swap languages')])[1]")
	WebElement btnSwap;

	@FindBy(xpath = "(//button[contains(@aria-label,'Clear source text')])[1]")
	WebElement btnClear;

	@FindBy(xpath = "(//a[contains(@aria-label,'Show the Input Tools menu')])[1]")
	WebElement btnSelectInputTool;

	@FindBy(xpath = "//*[@id='yDmH0d']/ul/li[2]/span[3]")
	WebElement keyBoardUS;

	@FindBy(xpath = "(//span[text()='h'])")
	WebElement txtH;

	@FindBy(xpath = "(//span[text()='i'])")
	WebElement txtI;

    @FindBy(xpath = "(//button[@id='K16'])[1]")
    WebElement keyShift;

	@FindBy(xpath = "//button[@id='K49']")
	WebElement keyExclamationSign;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
	public boolean verifyCorrectUserName(){
		return targetTextDemocracias.isDisplayed();
	}
	
	public void selectSourceLanguage() throws InterruptedException {
		moreSourceLanguageArrow.click();
		sourceLanguage.click();
		Thread.sleep(2000);
		sourceLanguage.sendKeys("German");
		sourceLanguage.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
			}

	public void selectTargetLanguage() throws InterruptedException {
		moreTargetLanguageArrow.click();
		Thread.sleep(2000);
		targetLanguage.click();
		Thread.sleep(2000);
		targetLanguage.sendKeys("Spanish");
		targetLanguage.sendKeys(Keys.ENTER);
	}

	public void enteringGermanText() throws InterruptedException {
		sourceTextField.click();
		Thread.sleep(2000);
		sourceTextField.sendKeys("Demokratien");
		Thread.sleep(2000);
		//targetLanguage.sendKeys(Keys.ENTER);
	}
	public void gettingSpanishText() throws InterruptedException {
		Thread.sleep(2000);
		targetTextDemocracias.isDisplayed();
		Thread.sleep(2000);
		//Assert.assertEquals(targetTextDemocracias,"Democracia","Democracia text is presented on Target field side");
		Thread.sleep(3000);
	}
	public void swappingTheLanguage() throws InterruptedException {
		btnSwap.click();
		Thread.sleep(2000);
		targetTextDemokratieNew.isDisplayed();
		//Assert.assertEquals(targetTextDemokratieNew, "Demokratie","Demokratie text is presented on Target field side.");
		Thread.sleep(2000);
	}
	public void clearText() throws InterruptedException {
		btnClear.click();
		Thread.sleep(2000);
	}
	public void enterHI() throws InterruptedException {
		btnSelectInputTool.click();
		Thread.sleep(2000);
		keyBoardUS.click();
		Thread.sleep(2000);
		txtH.click();
		Thread.sleep(2000);
		txtI.click();
		Thread.sleep(2000);
		keyShift.click();
		Thread.sleep(2000);
		keyExclamationSign.click();
		Thread.sleep(2000);
	}
}
	
	
	
	
	
	
	


package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	HomePage homePage;
	TestUtil testUtil;


	public HomePageTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		homePage = new HomePage();
	}
	
	
	@Test(priority=1)
	public void verifyGoogleTranslation() throws InterruptedException {
		//String homePageTitle = homePage.verifyHomePageTitle();
		homePage.selectSourceLanguage();
		homePage.selectTargetLanguage();
		//Assert.assertEquals(homePageTitle, "CRMPRO","Home page title not matched");
		homePage.enteringGermanText();
		homePage.gettingSpanishText();
		//need to add assertion
	}

	@Test(priority=2)
	public void verifySwapBtn() throws InterruptedException {
		String homePageTitle = homePage.verifyHomePageTitle();
		homePage.selectSourceLanguage();
		homePage.selectTargetLanguage();
		//Assert.assertEquals(homePageTitle, "CRMPRO","Home page title not matched");
		homePage.enteringGermanText();
		homePage.gettingSpanishText();
		homePage.swappingTheLanguage();
		//failing
	}
	@Test(priority=3)
	public void verifyClearInputFieldAndEnterHI() throws InterruptedException {
		String homePageTitle = homePage.verifyHomePageTitle();
		homePage.selectSourceLanguage();
		homePage.selectTargetLanguage();
		//Assert.assertEquals(homePageTitle, "CRMPRO","Home page title not matched");
		homePage.enteringGermanText();
		homePage.gettingSpanishText();
		homePage.swappingTheLanguage();
		homePage.clearText();
		homePage.enterHI();

	}
	
	@Test(priority=2)
	public void verifyUserNameTest(){
		testUtil.switchToFrame();
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	

	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}

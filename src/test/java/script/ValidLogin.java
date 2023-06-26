package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import generic.Retry;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class ValidLogin extends BaseTest
{
	@Test(priority = 1,retryAnalyzer = Retry.class)
	public void testValidLogin() throws InterruptedException
	{
		String un=Excel.getCellData(XL_PATH, "ValidLogin", 1, 0);
		String pw=Excel.getCellData(XL_PATH, "ValidLogin", 1, 1);
		
		
		LoginPage loginPage=new LoginPage(driver);
//		1. enter valid un
		loginPage.setUserName(un);
//		2. enter valid pw
//		loginPage.setPassword(pw);
//		Thread.sleep(2000);
////		3. click login button
//		loginPage.clickLoginButton();
////		4. home page should be displayed
//		EnterTimeTrackPage homePage=new EnterTimeTrackPage(driver);
//		boolean result = homePage.verifyHomePageIsDisplayed(wait);
//		Assert.assertTrue(result);
	}
}

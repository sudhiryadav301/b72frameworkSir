package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.LoginPage;

public class InvalidLogin extends BaseTest
{
	@Test(priority = 2,enabled = false)
	public void testInvalidLogin()
	{
		int rc=Excel.getRowCount(XL_PATH, "InvalidLogin");
		for(int i=1;i<=rc;i++)
		{
			String un=Excel.getCellData(XL_PATH,"InvalidLogin", i, 0);
			String pw=Excel.getCellData(XL_PATH,"InvalidLogin", i, 1);
	//		1. enter invalid un
			LoginPage loginPage=new LoginPage(driver);
			loginPage.setUserName(un);
	//		2. enter invalid pw
			loginPage.setPassword(pw);
	//		3. click login button
			loginPage.clickLoginButton();
	//		4. err msg should be displayed
			boolean result = loginPage.verifyErrMsgIsDisplayed(wait);
			Assert.assertTrue(result);
		}
	}
}

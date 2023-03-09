package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilitiez.BaseClass;
import Utilitiez.CommonMethods;
import pages.AdminPage;
import pages.LoginPage;
import pages.NavigationMenuPage;

public class LoginTestCases extends CommonMethods {
	
	@BeforeMethod
	public void beforeTest() {
		BaseClass.getDriver();
		
	}
	
	@Test
	public void testAdminSystemUserSearch() {
//		lp.userTextBox.sendKeys(BaseClass.getProperty("username"));
//		lp.passwordTextBox.sendKeys(BaseClass.getProperty("password"));
//		lp.LoginButton.click();
		
		lp.loginMethod();
		nmp.chooseLeftMenuBarOption(BaseClass.getProperty("admin"));
		ap.systemUsersUsernameTextBox.sendKeys(BaseClass.getProperty("SystemUserUsername"));
		
		ap.userRoleDropDownToExpand.click();
		ap.chooseUserRoleOption(BaseClass.getProperty("SystemRole"));
		
		
		
		ap.statusDropDownToExpand.click();
		ap.chooseUserRoleOption(BaseClass.getProperty("enabled"));
		ap.SearchButton.click();
			
	
//			if(ap.recordsTable.size() == 1) {
//				Assert.assertTrue(true);
//			}else {
//				Assert.assertFalse(true);
//
//			}
//			
		Assert.assertTrue(ap.recordsTable.size()==1);
	
		System.out.println("hello world");
	}


}

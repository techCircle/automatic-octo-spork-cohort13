package testCases;

import Utilitiez.BaseClass;
import Utilitiez.CommonMethods;
import pages.LoginPage;

public class testingCommonMethods {

	
	static LoginPage lp;
	
	
	public static void main(String[] args) {
		lp = new LoginPage();
		
		CommonMethods.sendText(lp.userTextBox, BaseClass.getProperty("username"));
		
		
		
//		CommonMethods.waitForClickability(lp.LoginButton);
//		lp.LoginButton.click();
		
		
		CommonMethods.click(lp.LoginButton);
	
	}

}

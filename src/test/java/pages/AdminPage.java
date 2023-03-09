package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilitiez.BaseClass;

public class AdminPage {

	public AdminPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	
	@FindBy(xpath="//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[1]//input")
	public WebElement systemUsersUsernameTextBox;
	
	
	@FindBy(xpath="//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div/div[2]/div/div")
	public WebElement userRoleDropDownToExpand;
	
	@FindBy(xpath="//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[4]/div/div[2]/div/div")
	public WebElement statusDropDownToExpand;
	
	
	@FindBy(xpath="//div[@class='oxd-select-dropdown --positon-bottom']/div")
	public List<WebElement> userRoleAndStatusDropDownOptions;
	
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement SearchButton;
	
	
	@FindBy(xpath="//div[@class='oxd-table-card']/div")
	public List<WebElement> recordsTable;
	
	
	public void chooseUserRoleOption(String menuValue) {
		for (WebElement userRoleOption : userRoleAndStatusDropDownOptions) {
			
			if (userRoleOption.getText().equalsIgnoreCase(menuValue)) {
				userRoleOption.click();
				break;
			}
	
		}
	}
	
}

	
	

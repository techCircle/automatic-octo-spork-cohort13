package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilitiez.BaseClass;

public class NavigationMenuPage {
	
	
	
	public NavigationMenuPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//ul[@class='oxd-main-menu']/li")
	public List<WebElement> leftMenuBar;
	
	
	
	public void chooseLeftMenuBarOption(String menuValue) {
		for (WebElement eachMenuOption : leftMenuBar) {
			
			if (eachMenuOption.getText().equalsIgnoreCase(menuValue)) {
				eachMenuOption.click();
				break;
			}
			
		}
	}
	
	
	
}

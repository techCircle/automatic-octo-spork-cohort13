package package1Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage_51TestCase  {
	WebDriver driver;
	@BeforeMethod
	public void openUpBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	@Test
	public void homePageQ4() throws InterruptedException {
		WebElement shopButon = driver.findElement(By.xpath("//*[@id='menu-item-40']/a"));
		shopButon.click();
		driver.navigate().refresh();
		shopButon = driver.findElement(By.xpath("//*[@id='menu-item-40']/a"));
		shopButon.click();
		
		WebElement homeButton = driver.findElement(By.xpath("//*[@id='content']/nav/a"));
		homeButton.click();

		List<WebElement> ariavalList = driver.findElements(By.xpath("//*[@class='woocommerce']/ul/li"));

		int actualResult = ariavalList.size();
		int expectedResult = 3;

		Assert.assertEquals(expectedResult, actualResult);

		System.out.println("Number of New arriaval : " + actualResult);

		for (int i = 0; i <ariavalList.size(); i++) {
            System.out.println(i);
            
              WebElement item = ariavalList.get(i);
              System.out.println(item);
              
              if (item.getText().contains("ADD TO BASKET")) {
                  
                 // String homeUrl = BaseClass51.getDriver().getCurrentUrl();
            	  String homeUrl = driver.getCurrentUrl();
                  item.click();
                  
                 // System.out.println(BaseClass51.getDriver().getTitle());  
                  System.out.println(driver.getTitle()); 
             
                 // String newUrl = BaseClass51.getDriver().getCurrentUrl();
                  String newUrl = driver.getCurrentUrl();
              //    Assert.assertFalse("did not navigate to a new page", homeUrl.equals(newUrl));
                  
               // WebElement addToBasket = BaseClass51.getDriver().findElement(By.xpath("//button[@class='single_add_to_cart_button button alt']"));
                  WebElement addToBasket = driver.findElement(By.xpath("//button[@class='single_add_to_cart_button button alt']"));
                  
                  Assert.assertTrue(addToBasket.isDisplayed());
                  
                  addToBasket.click();
                  //Assert if the item is added or not 
                  // Check if description button is clickable or not
                  // Check if there is a description for that product or not
                  
                  break;
                  }        
              
             // arrivalItems = BaseClass51.getDriver().findElements(By.xpath("//ul[contains(@class, 'products')]/li"));
              ariavalList = driver.findElements(By.xpath("//ul[contains(@class, 'products')]/li"));
              
      } 
		
		
		
		
	
		
		
		

		Thread.sleep(3000);

	}
	
	

}

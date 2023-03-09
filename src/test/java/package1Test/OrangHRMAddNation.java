package package1Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangHRMAddNation {
	WebDriver driver;
	@BeforeMethod
	public void openUpBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	@Test
	public void login() {
		WebElement username = driver.findElement(By.xpath("//*[@name='username']"));
		WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='app']/div[1]//div[2]/form/div[3]/button")).click();	
	}
}

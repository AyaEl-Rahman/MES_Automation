package MES_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginToGepard {

	WebDriver ChromeBroswerObject;
	private By SearchBox;
	@BeforeTest
	public void openingbrowser() {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\akamal6\\Downloads\\Chrome Driver\\chromedriver_win32New\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver","C:\\Users\\akamal6\\Downloads\\Chrome Driver\\chromedriver_win32New\\IEDriverServer.exe");
		//ChromeBroswerObject = new ChromeDriver();
		ChromeBroswerObject = new InternetExplorerDriver();
		ChromeBroswerObject.navigate().to("http://mbvtstdt01.mbv.svc.fortknox.local/en");
		ChromeBroswerObject.manage().window().maximize();
	}
	/*@Test (dependsOnMethods={"Login"})
	public void Search() {
		//WebDriverWait wait = new WebDriverWait(ChromeBroswerObject, 70);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(SearchBox));
		WebElement SearchBox = ChromeBroswerObject.findElement(By.xpath("//div//input[@id ='headerSearch']"));
		SearchBox.sendKeys("Page Takt");
		SearchBox.sendKeys(Keys.ENTER);
	}*/
	@Test (priority = 1)
	public void Login () {

		WebElement username = ChromeBroswerObject.findElement(By.xpath("//div/input[@id='username']"));
		WebElement  password= ChromeBroswerObject.findElement(By.name("password"));
		WebElement loginButton = ChromeBroswerObject.findElement(By.id("kc-login"));
		
		  // username.sendKeys ("dev");
		   password.sendKeys ("dev");
		   loginButton.click();
			
		    //WebElement SearchBox = ChromeBroswerObject.findElement(By.id("headerSearch"));
		    //ChromeBroswerObject.findElement(By.id("headerSearch")).sendKeys("Page Takt");
		    ChromeBroswerObject.navigate().to("http://mbvtstdt01.mbv.svc.fortknox.local/en/pmas/icons-configuration");
			//SearchBox.sendKeys(Keys.ENTER);
		
	}
	@AfterTest
	public void CloseBrowser() {
	//	ChromeBroswerObject.close();
		
	}
}

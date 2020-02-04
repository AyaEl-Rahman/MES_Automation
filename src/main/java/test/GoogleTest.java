package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver ChromeBroswerObject;
	
	@BeforeTest
	public void openingbrowser() {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\akamal6\\Downloads\\Chrome Driver\\chromedriver_win32New\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver","C:\\Users\\akamal6\\Downloads\\Chrome Driver\\chromedriver_win32New\\IEDriverServer.exe");
		//ChromeBroswerObject = new ChromeDriver();
		ChromeBroswerObject = new InternetExplorerDriver();
		ChromeBroswerObject.navigate().to("http://www.google.com");
		ChromeBroswerObject.manage().window().maximize();
	}
	@Test (dependsOnMethods={"AssertPageTitle"})
	public void GoogleSearch() {
		WebElement SearchBox = ChromeBroswerObject.findElement(By.name("q"));
		SearchBox.sendKeys("Selenium");
		SearchBox.sendKeys(Keys.ENTER);
	}
	@Test (priority = 1)
	public void AssertPageTitle () {
		String actualPageTitle = ChromeBroswerObject.getTitle();
		String ExpectedPageTitle ="Google" ;
		Assert.assertEquals(actualPageTitle, ExpectedPageTitle);
	}
	@AfterTest
	public void CloseBrowser() {
		ChromeBroswerObject.close();
		
	}

}
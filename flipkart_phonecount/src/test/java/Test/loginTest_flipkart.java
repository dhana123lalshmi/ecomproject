package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import pom.PageLogin_flipkart;




public class loginTest_flipkart  {
	
	
WebDriver driver;
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}

	
	@Test
	public void loginpage()
	{
		driver=new ChromeDriver();
		System.out.println(driver);
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		PageLogin_flipkart login=new PageLogin_flipkart(driver);
		System.out.println(login);
		
		
		login.sendUser();
		login.sendPassword();
		login.clickLogin();
		
	}

}

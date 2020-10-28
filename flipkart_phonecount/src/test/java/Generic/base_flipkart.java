package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class base_flipkart {
	
	public	WebDriver driver;
	//public	homePage home;
			static
			{
				System.setProperty(constant.key,constant.value);
			}
			
			@BeforeClass
			public void LaunchBrowser()
			{
				driver = new ChromeDriver();
				System.out.println(driver);
				driver.manage().window().maximize();
				
			}

}

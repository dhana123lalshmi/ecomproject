package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pom.PageLogin_flipkart;
import pom.PageSearch;

public class searchTest {
	
	WebDriver driver;
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	
	@Test
	public void loginpage() throws InterruptedException
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
	
	 PageSearch srch=new  PageSearch(driver);
	System.out.println(srch);
	
	srch.sendtext();
	
	System.out.println("srch phones");
	//WebElement el=driver.findElement(By.xpath("//input[@name='q']"));
	
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='q']")));
	//el.sendKeys("phones"+Keys.ENTER);
	Thread.sleep(5000);
	
	
    
	List<WebElement> phones = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
	int pcount=phones.size();
	System.out.println("no of phones displayed"+pcount);
	System.out.println("Phone names");
	for(WebElement ph:phones)
	{
		String pname=ph.getText();
		System.out.println(pname);
	}
	
	
	
	
	
	}
}

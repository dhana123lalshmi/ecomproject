package pom;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageSearch {
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement srchtextbox;
	
	
	@FindBy(xpath="//button[@class='vh79eN']")
	private WebElement srcbutton;
	
	 public  PageSearch(WebDriver driver)
		{
			
			PageFactory.initElements(driver, this);
			System.out.println("constructor stmt");
		}
	    
	    public void sendtext() {
			srchtextbox.sendKeys("phones"+Keys.ENTER);
			
		}
		/*
		 * public void clicksearch() { srcbutton.click(); }
		 */
}

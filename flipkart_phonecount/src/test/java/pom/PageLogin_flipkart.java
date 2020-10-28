package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLogin_flipkart {
	
	
	
	 @FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
		private WebElement phone;
	    
	    @FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
		private WebElement pass;
	    
	    @FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
		private WebElement login;
	    
	    public  PageLogin_flipkart(WebDriver driver)
		{
			
			PageFactory.initElements(driver, this);
			System.out.println("constructor stmt");
		}
	    
	    public void sendUser() {
			phone.sendKeys("9952399605");
		}
		public void sendPassword() {
			pass.sendKeys("dhanshika83");
		}
		public void clickLogin() {
			login.click();
		}
		/*
		 * public WebElement getPhone() { return phone; } public void
		 * setUsername(WebElement phone) { this.phone = phone; }
		 * 
		 * public WebElement getPassword() { return pass; }
		 * 
		 * public void setPassword(WebElement password) { this.pass = password; }
		 * 
		 * public WebElement getLogin() { return login; }
		 * 
		 * public void setLogin(WebElement login) { this.login = login; }
		 */

		
		
		

}

package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
		@FindBy(xpath="(//div[.='Account Settings'])[5]")
		private WebElement downarrow;
		
		@FindBy(xpath="//li[.='Log Out']")
		private WebElement logout;
		
		public Logout(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public void clickDownarrow()
		{
			downarrow.click();
		}
		public void clickLogout()
		{
			logout.click();
		}
		
		

}

package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(id="u_0_b")
	private WebElement login;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setUsername(String un)
	{
		username.sendKeys(un);
	}
	public void setPwd(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickLogin()
	{
		login.click();
	}
}

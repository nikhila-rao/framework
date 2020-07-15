package test_Scripts_Facebook;

import org.testng.annotations.Test;

import generic.Generic;
import pom.Login;
import pom.Logout;

public class Facebook extends Generic {
	
	@Test
	public void testLogin()
	{
		Login lp=new Login(driver);
		
		lp.setUsername("7829818768");
		lp.setPwd("NikiMphasis@8");
		lp.clickLogin();
		
		Logout log=new Logout(driver);
		log.clickDownarrow();
		log.clickLogout();
		
	}
	
	

}

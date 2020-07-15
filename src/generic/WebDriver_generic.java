package generic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriver_generic 
{
	public void clickClose(WebDriver d)
	{
		d.close();
	}
	public void fetchElement(WebDriver d,By str)
	{
		WebElement fe = d.findElement(str);
		System.out.println(fe);
	}
	public void fetchElements(WebDriver d,By str)
	{
		List<WebElement> fes = d.findElements(str);
		System.out.println(fes);
	}
	public void fetch(WebDriver d,String str)
	{
		d.get(str);
	}
	

}

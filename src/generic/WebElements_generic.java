package generic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;

public class WebElements_generic {
	public void fetchText(WebElement ele)
	{
		String text = ele.getText();
		System.out.println(text);
	}
	public void fetchTooltip(WebElement ele,String str)
	{
		String tooltip = ele.getAttribute(str);
		System.out.println(tooltip);
	}
	public void fetchLocation(WebElement ele)
	{
		Point location = ele.getLocation();
		System.out.println(location);
	}
	public void fetchCssValue(WebElement ele,String str)
	{
		String font_size = ele.getCssValue(str);
		System.out.println(font_size);
	}
	public void performClick(WebElement ele)
	{
		ele.click();
	}
	public void performClear(WebElement ele)
	{
		ele.clear();
	}
	public void getRectangle(WebElement ele)
	{
		Rectangle rect = ele.getRect();
		System.out.println(rect);	
	}
	public void fetchSize(WebElement ele)
	{
		Dimension dimen = ele.getSize();
		System.out.println(dimen);	
	}
	public void fetchTagName(WebElement ele)
	{
		String tag = ele.getTagName();
		System.out.println(tag);
	}
	public void checkIsDisplayed(WebElement ele)
	{
		boolean disp = ele.isDisplayed();
		System.out.println(disp);
	}
	public void checkIsEnabled(WebElement ele)
	{
		boolean enable = ele.isEnabled();
		System.out.println(enable);
	}
	public void checkIsSelected(WebElement ele)
	{
		boolean sele = ele.isSelected();
		System.out.println(sele);
	}
	public void clickSubmitbtn(WebElement ele)
	{
		ele.submit();
	}
	public void enterData(WebElement ele, String data)
	{
		ele.sendKeys(data);
	}

}

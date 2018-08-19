package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.Basepage;

public class Cartpage extends Basepage {
	@FindBy(xpath="//span[.='Add to cart']")
	private WebElement cart;
	

	public Cartpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void addTocart()
	{
		cart.click();
	}


}

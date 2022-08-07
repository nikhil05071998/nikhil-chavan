package pompclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class homepage 
{
	private WebDriver driver;
	private Select s;
	private Actions act;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement bagbutton;
	
	public void bagadd()
	{
		bagbutton.click();
	}
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	private WebElement cartbutton;
	
	public void addtocart()
	{
		cartbutton.click();
	}
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement checkout;
	
	public void checkoutbutton()
	{
		act.click(checkout).perform();
	}
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement dropdown;
	
	public void dropdownbutton()
	{
		dropdown.click();
		s.selectByVisibleText("Price (low to high)");
	}
	
	public homepage (WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		s=new Select(dropdown);
		act=new Actions(driver);
	}

}

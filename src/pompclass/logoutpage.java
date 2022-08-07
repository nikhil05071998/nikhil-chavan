package pompclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutpage 
{
    WebDriver driver;

     @FindBy(xpath="//button[@id='react-burger-menu-btn']")
     private WebElement lobutton;
     
     public void logoutbutton()
     {
    	 lobutton.click();
     }
     
     @FindBy(xpath="//a[text()='Logout']")
     private WebElement  logoutswitch;
     
     public void logout()
     {
    	 logoutswitch.click(); 
     }
     
     public  logoutpage (WebDriver driver)
     {
    	 this.driver=driver;
    	 PageFactory.initElements(driver,this);
     }
     

}

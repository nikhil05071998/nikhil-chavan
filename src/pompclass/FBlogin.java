package pompclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBlogin
{
   WebDriver driver;
    
  @FindBy(xpath="//input[@id='email']")
  private WebElement username;
  
  public void loginid()
  {
	  username.sendKeys("7057646420");
  }
  
  @FindBy(xpath="//input[@id='pass']")
  private WebElement password;
  
  public void pass()
  {
	  password.sendKeys("nikhil@123");
  }
  
  
  @FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")
  private WebElement login;
  
  public void log()
  {
    login.click();
  }
  
  public FBlogin(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  
  
}

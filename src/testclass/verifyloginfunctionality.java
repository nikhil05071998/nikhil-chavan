package testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pompclass.loginpage;

public class verifyloginfunctionality 
{

@Test
public void login()
{

	   System.setProperty("webdriver.chrome.driver",
			   "C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\\\chromedriver.exe");

	   WebDriver driver = new  ChromeDriver();
	   
	   driver.get("https://www.saucedemo.com");
	   
	   
	   loginpage lp=new loginpage(driver);
	   lp.user();
	   lp.pass();
	   lp.log();
	   
	   String result= driver.getCurrentUrl();
	   System.out.println(result);
	   
	   String actualresult= " Labs";
	   String expectedresult=driver.getTitle();
	   
	   if(expectedresult.equals(actualresult))
	   {
		   System.out.println("tc is pass");
	   }
	   else
	   {
		   System.out.println("tc is fail"); 
	   }
	   
	   System.out.println("verify login functionality pass");
	   driver.quit();
 }

}

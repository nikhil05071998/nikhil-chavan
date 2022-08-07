package testclass;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pompclass.loginpage;
import pompclass.logoutpage;

public class veifylogoutfunctionality 
{
	//public static void main(String[] args) 
	@Test
		public void logoutpage()	
				throws InterruptedException
	{

		   System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\\\chromedriver.exe");

		   WebDriver driver = new  ChromeDriver();
		   
		   driver.get("https://www.saucedemo.com");
	
		   
		   driver.manage().window().maximize();
		   
		   Thread.sleep(30);
		   
		   loginpage lp=new loginpage(driver);
		   lp.user();
		   lp.pass();
		   lp.log();
		   
		   
		   
		   logoutpage lo =new logoutpage(driver);
		   lo.logoutbutton();
		   lo.logout();
		   
		   System.out.println("verify logout fun. pass");
		   driver.quit();
//		   String actual="Swag Labs";
//		   String expected=driver.getTitle();
//		   
//        if(expected.equals(actual))
//        {
//        	System.out.println("tc pass"); 
//        }
//        else
//        {
//        	System.out.println("tc fail");	
//        }

		   
}
}
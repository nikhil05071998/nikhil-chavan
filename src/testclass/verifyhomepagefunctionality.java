package testclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pompclass.homepage;
import pompclass.loginpage;

public class verifyhomepagefunctionality 
{
	@Test
	public void home() throws InterruptedException
	{

		   System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\\\chromedriver.exe");

		   WebDriver driver = new  ChromeDriver();
		   
		   driver.get("https://www.saucedemo.com");
	
		   
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   Thread.sleep(30);
		   
		   loginpage lp=new loginpage(driver);
		   lp.user();
		   lp.pass();
		   lp.log();
		   
		   Thread.sleep(30);
		   
		   homepage hp =new homepage(driver);
		   hp.bagadd();
		   hp.addtocart();
		   hp.checkoutbutton();
		   hp.dropdownbutton();
		   System.out.println("verify home page complete");
		   
		   Thread.sleep(30);
		   driver.quit();
}
}

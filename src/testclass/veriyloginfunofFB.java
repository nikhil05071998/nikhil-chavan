package testclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pompclass.FBlogin;

public class veriyloginfunofFB
{
   @Test(priority=1)
     public void FACEBOOK() throws InterruptedException 
	   {
		   System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\\\chromedriver.exe");

	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  FBlogin fb=new FBlogin(driver);
	  
	  fb.pass();
	  fb.loginid();
	  fb.log();
	  
	  System.out.println("fb home page");
}
}
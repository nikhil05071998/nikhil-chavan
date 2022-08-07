package nikhilselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart
{
public static void main(String[] args) throws InterruptedException
   {
	System.setProperty("webdriver.chrome.driver",
			   "C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\\\chromedriver.exe");

	   WebDriver driver = new  ChromeDriver();
	   
	   //validate url is opened 
	   
	   driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders&fromMyOrdersPage=true");
	   
	   //validate browser is maximize
	   driver.manage().window().maximize();
	  
	   Thread.sleep(3000);
	   
	   // validate login  functionality by passing valide username 
	   WebElement username = driver .findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/form/div[1]/input"));
	   username.sendKeys("9322649488");
	   
	// validate login  functionality by passing valide password 
	   WebElement password = driver .findElement(By.xpath("//input[@type='password']"));
	   password.sendKeys("nikhil@123");
	   
	// validate login button functionality
	   WebElement login = driver .findElement(By.xpath("//html//body//div//div[4]//button"));
	   login.click();
	   
	 String x = driver.getTitle();
	  System.out.println(x);
   }
}

package nikhilselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rechargeforum
{
   public static void main(String[] args) throws InterruptedException 
   {
	   System.setProperty("webdriver.chrome.driver",
			   "C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\\\chromedriver.exe");

	   WebDriver driver  = new ChromeDriver();
	   
	   driver.get("https://rechargeforum.in/Recharge/LoginForm.aspx");
	   
	   driver.manage().window().maximize();
	  
	   Thread.sleep(3000);
	   
	   WebElement username = driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtusername']"));
  
	   username.sendKeys("9527308589");
	   Thread.sleep(3000);
	   WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	   
	   password.sendKeys("2772");
	   Thread.sleep(3000);
	   WebElement login = driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_Button1']"));
   
	   login.click();
   } 
}
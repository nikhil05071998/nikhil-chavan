package nikhilselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   System.setProperty("webdriver.chrome.driver",
			   "C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\\\chromedriver.exe");

   WebDriver driver = new ChromeDriver();
   
   driver.get("https://www.facebook.com");
  driver.manage().window().maximize();
  
  Thread.sleep(3000);
  
  WebElement username  = driver .findElement(By.id("email"));
  username.sendKeys("7057646420");
  
  Thread.sleep(3000);
  
  WebElement password = driver .findElement(By.xpath("//input[@id='pass']"));
  password.sendKeys("nikhil@123");
  
  Thread.sleep(3000);
  
  WebElement login  = driver .findElement(By.name("login"));
  login.click();
  
  Thread.sleep(3000);
  
String result  =login.getText();
  System.out.println(result);
   }
}

package nikhilselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   System.setProperty("webdriver.chrome.driver",
			   "C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\\\chromedriver.exe");

	   WebDriver driver = new  ChromeDriver();
	   
	   driver.get("https://www.saucedemo.com");
	   
	   Thread.sleep(3000);
	  String n=  driver.getTitle();
	  System.out.println(n);
	  
	  String m=  driver.getCurrentUrl();
	  System.out.println(m);
	  
	//   driver.manage().window().maximize();
	   Dimension d= new Dimension(300,300);
	   driver.manage().window().setSize(d);
	   
	   Point p= new Point(700,300);
	   driver.manage().window().setPosition(p);
			   
	   // x-path by contains by attribute 
	   WebElement username = driver.findElement(By.xpath("//input[contains(@type,'text')]"));
	   username.sendKeys("standard_user");
	   
	  boolean result  =username.isDisplayed();
	  System.out.println(result);
		   
	   Thread.sleep(3000);
	   
	   //relative x-path
	   WebElement password = driver.findElement(By.xpath("//html//body//form//div[2]//input"));
	   password.sendKeys("secret_sauce");
	   
	   Thread.sleep(3000);
	   //absolute x-path
	   WebElement login  = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input"));
	   login.click();
	   
	   WebElement logout  = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/button"));
	   logout.click();
	   
	   Thread.sleep(6000);
	   
	   WebElement log1  = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
	   log1.click();
	   
	   Thread.sleep(6000);
	   driver.close();
	   Thread.sleep(6000);
	   driver.quit();
	   
   }   
}

package nikhilselenium;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chidbrowserpopup
{
  private static int String;

public static void main(String[] args) throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver",
			   "C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\\\chromedriver.exe");

       WebDriver driver = new ChromeDriver();
  
       driver.get("https://www.flipkart.com/");
         driver.manage().window().maximize();
	
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         
         WebElement username  =driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
         username.sendKeys("9322649488");
         
         Thread.sleep(5000);
         
         WebElement password   =driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
         password.sendKeys("nikhil@123");
         
         Thread.sleep(5000);
         
         WebElement login    =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
         login.click();
         
         Thread.sleep(5000);
         
         WebElement search    =driver.findElement(By.xpath("//input[@class='_3704LK']"));
         search.sendKeys("mobiles");
         
         
         
       
         
  }
}

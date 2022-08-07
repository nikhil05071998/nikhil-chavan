package nikhilselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbdropdown 
{
   public static void main(String[] args) 
   {
	   System.setProperty("webdriver.chrome.driver",
			   "C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\\\chromedriver.exe");

       WebDriver driver = new ChromeDriver();
   
       driver.get("https://www.facebook.com");
       driver.manage().window().maximize();
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       
       WebElement create  =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
       create.click();
       
       WebElement dropdown = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]"));
       dropdown.click();
       
       Select s= new Select (dropdown);
       s.selectByValue("5");
   }


} 


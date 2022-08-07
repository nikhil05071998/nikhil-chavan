package nikhilselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouseactions
{
public static void main(String[] args) 
{
	  System.setProperty("webdriver.chrome.driver",
			   "C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\\\chromedriver.exe");

     WebDriver driver = new ChromeDriver();

     driver.get("https://demoqa.com/buttons");
     driver.manage().window().maximize();
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     
    WebElement clik= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));
   Actions act = new Actions(driver);
   act.click(clik).perform();
   
   WebElement result= driver.findElement(By.id("dynamicClickMessage"));
  String te =result.getText();
  System.out.println(te);
  
 WebElement dc =driver .findElement(By.xpath("//button[@id='doubleClickBtn']"));
  Actions dou=new Actions (driver);
  dou.doubleClick(dc).perform();
  
  WebElement result2= driver.findElement(By.id("doubleClickMessage"));
   String ck = result2.getText();
   System.out.println(ck);
   
   WebElement rightclick =driver.findElement(By.xpath("//button[contains(@id,'rightClickBtn')]"));
   Actions right=new Actions (driver);
  right.contextClick(rightclick).perform();
  
  WebElement result3 =driver.findElement(By.id("rightClickMessage"));
  String rc=result3.getText();
  System.out.println(rc);
  
  driver.quit();
}


}


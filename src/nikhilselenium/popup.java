package nikhilselenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class popup 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	System.setProperty("webdriver.chrome.driver",
 			   "C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\\\chromedriver.exe");

 	   WebDriver driver = new  ChromeDriver();
 	   
 	   // progra for alert pop-up 
 	   
// 	   driver.get("https://demoqa.com/alerts");
// 	   
// 	   driver.manage().window().maximize();
// 	   
// 	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
// 	   
// 	   WebElement clicks =driver.findElement(By.xpath("//button[@id='alertButton']"));
// 	 // clicks.click();
// 	  Actions act=new Actions(driver);
// 	  act.click(clicks).perform();
// 	  
// 	  Alert alt=driver.switchTo().alert();
// 	  
// 	 String aler =alt.getText();
// 	 System.out.println(aler);
// 	 Thread.sleep(3000);
// 	  alt.accept();
// 	  
 	  
 	  // program for authentication pop-up 
 	   
 	  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	   
	   driver.manage().window().maximize();
	   String result  = driver.getTitle();
	   	   System.out.println(result);
   }
}

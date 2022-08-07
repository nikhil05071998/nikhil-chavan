package nikhilselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frame 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   System.setProperty("webdriver.chrome.driver",
			   "C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\\\chromedriver.exe");

       WebDriver driver = new ChromeDriver();
  
       driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
         driver.manage().window().maximize();
	
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         
         WebElement frame2=driver.findElement(By.xpath("//iframe[@id='frame2']"));
         driver.switchTo().frame(frame2);
         
         WebElement dropdown=driver.findElement(By.xpath("//select[@id='animals']"));
         Thread.sleep(2000);
         Select s=new Select(dropdown);
         s.selectByVisibleText("Big Baby Cat");
         
         Thread.sleep(2000);
         
//         /WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
         driver .switchTo().parentFrame();
         
         Thread.sleep(2000);
         
         WebElement check =driver.findElement(By. xpath("/html/body/b"));
         check.click();
   }
}

package nikhilselenium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollupanddown
{
  public static void main(String[] args) throws InterruptedException 
   {
	  System.setProperty("webdriver.chrome.driver",
			   "C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\\\chromedriver.exe");

  WebDriver driver = new ChromeDriver();
  
  driver.get("https://vctcpune.com/selenium/practice.html");
 driver.manage().window().maximize();
 
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 
 Thread.sleep(3000);
 
 JavascriptExecutor scroll=(JavascriptExecutor )driver ;
 Thread.sleep(3000);
    scroll.executeScript("window.scrollBy(0,1500)");
 }
}

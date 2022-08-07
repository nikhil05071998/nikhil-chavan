package nikhilselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class draganddrop
{
   public static void main(String[] args) 
   {

		  System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver();

	     driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	     
	   WebElement drag = driver.findElement(By.id("box3"));
	   WebElement drop  = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[7]"));
	   Actions act=new Actions(driver);
	   act.dragAndDrop(drag, drop).perform();
   }
}
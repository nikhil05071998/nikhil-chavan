package nikhilselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable 
{

	public static void main(String[] args)
    {
	  System.setProperty("webdriver.chrome.driver",
			   "C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\\\chromedriver.exe");

      WebDriver driver = new ChromeDriver();

      driver.get("https://vctcpune.com/selenium/practice.html");
      
      driver.manage().window().maximize();
    
      List<WebElement> columnname=driver .findElements(By.xpath("//table//tbody//tr//th"));
     
      System.out.println(columnname.size());
     for (int i=0; i<columnname.size(); i++)
     {
 	 String result =columnname.get(i).getText();
    	 System.out.println(result);
     }
     
     List<WebElement> tabledata=driver .findElements(By.xpath("//table//tbody//tr//td"));
     System.out.println(tabledata.size());
     
     for (int i=1; i<tabledata.size(); i++)
     {
 	 String results =tabledata.get(i).getText();
    	 System.out.println(results);
     }
     
}
	}
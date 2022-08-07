package nikhilselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown
{
  public static void main(String[] args)
    {
	  System.setProperty("webdriver.chrome.driver",
			   "C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\\\chromedriver.exe");

      WebDriver driver = new ChromeDriver();

      driver.get("https://vctcpune.com/selenium/practice.html");
      System.out.println("wesite opened ");
      driver.manage().window().maximize();
      System.out.println("window  maximize");
      
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

      WebElement dropdown=driver.findElement(By.xpath("/html/body/section[1]/div/div/div[4]/legend"));
      dropdown.click();
      
      Select s =new Select(dropdown);
      s.selectByValue("option 2");
      
    }
}

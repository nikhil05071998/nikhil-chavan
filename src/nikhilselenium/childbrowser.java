package nikhilselenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class childbrowser 
{
	public static void main(String[] args) throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\\\chromedriver.exe");

	       WebDriver driver = new ChromeDriver();
	  
	       driver.get("https://vctcpune.com/");
	         driver.manage().window().maximize();
		
	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	         
	         WebElement prac=driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
	         prac.click();
	         
	         List<String> allpage = new ArrayList<String>(driver.getWindowHandles());
	         System.out.println(allpage);
	         
	         driver.switchTo().window(allpage.get(1));
	         
      
	         WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	        
	         Thread.sleep(3000);
	         Select s=new Select(dropdown);
	         Thread.sleep(3000);
	         s.selectByIndex(2);
	         
}
}
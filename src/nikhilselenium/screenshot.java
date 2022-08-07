package nikhilselenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot 
{
	static WebDriver driver;
	public static void screenshotmethod() throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File sourcefile =ts.getScreenshotAs(OutputType.FILE);
		File destiFile = new File ("C:\\Users\\OM\\Desktop\\screenshots\\nik.jpg");
		FileHandler.copy(sourcefile,destiFile);
		System.out.println("login page");
	}
	public static void main(String[] args) throws IOException, InterruptedException 
	   {
		   System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\OM\\Downloads\\chromedriver_win32 (1)\\\\chromedriver.exe");
     
		   WebDriver driver = new  ChromeDriver();
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://www.saucedemo.com");
		   Thread.sleep(3000);
		   
		   screenshotmethod();
		   
}
}
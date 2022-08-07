package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations 
{
   @BeforeSuite
   public void metod1()
   {
	   System.out.println("beforesuite");
   }
   
   @BeforeTest
   public void metod2()
   {
	   System.out.println("beforetest");
   }
   
   @BeforeClass
   public void metod3()
   {
	   System.out.println("beforeclass");
   }
   
   @BeforeMethod
   public void metod4()
   {
	   System.out.println("beforemethod");
   }
   
   @Test
   public void metod5()
   {
	   System.out.println("test");
   }
   
   @Test
   public void method10()
   {
	   System.out.println("test10");
   }
   
   @AfterMethod
   public void metod6()
   {
	   System.out.println("aftermethod");
   }
   
   @AfterClass
   public void metod7()
   {
	   System.out.println("afterclass");
   }
   
   @AfterTest
   public void metod8()
   {
	   System.out.println("aftertest");
   }
   
   @AfterSuite
   public void metod9()
   {
	   System.out.println("aftersuite");
   }
   
   
}

package TestNGPractise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RunningFlow {

	@Test
	public void Test1()
	{
		System.out.println("Test1");
	}
	
	@Test(groups= "gaurav")
	public void Test2()
	{
		System.out.println("Test2");
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
	}
	
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass");
	}
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite");
	}
	
	
	@BeforeGroups
	public void BeforeGroups()
	{
		System.out.println("BeforeGroups");
	}
	
	@AfterGroups
	public void AfterGroups()
	{
		System.out.println("AfterGroups");
	}
	
}

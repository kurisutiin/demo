package FirstTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo_1 {
	
	@BeforeMethod//refers to Before in JUnit(appears 2 times)
	public void beforemethodtest() {
		System.out.println("I'm the before method TestNG");
	}
	
	
	@BeforeTest//But does not count(appear 1 time(first))->refers to BeforeClass in JUnit
	public void beforetest() {
		System.out.println("I'm the before TestNG and I appear first");
	}
	
	@Test(groups = {"group 1"})
	public void firsttest() {
		System.out.println("I'm the first TestNG");
	}

	@Test(groups = {"group 2"})
	public void secondtest() {
		System.out.println("I'm the second TestNG");
	}
	
	@Test(groups = {"group 3"})
	public void thirdtest() {
		System.out.println("I'm the third TestNG");
	}
	
	
	@AfterMethod//refers to After in JUnit(appears 2 times)
	public void aftermethodtest() {
		System.out.println("I'm the after method TestNG");
	}
	
	@AfterTest//But does not count(appear 1 time(last))->refers to AfterClass in JUnit
	public void aftertest() {
		System.out.println("I'm the after TestNG and I appear last");
	}
}

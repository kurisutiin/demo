package FirstTestNG;

//import static org.testng.Assert.fail;

//import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
//import org.testng.internal.junit.*;

public class TestNGDemo_2 {
	
	@Test//(dependsOnMethods= {"ni"}, alwaysRun = true)
	public void ichi() {
		System.out.println("Ichiban");
	}
	
	@Test(groups = {"group 2"})
	public void ni() throws InterruptedException {
		System.out.println("Niban");
//		fail("Baka"); fails the test automatically
//		TimeUnit.SECONDS.sleep(1);
	}

	
	@Test(groups = {"group 3"})//(enabled=false)
	public void san() {
		System.out.println("Sanban");
	}


}

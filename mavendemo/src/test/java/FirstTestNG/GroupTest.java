package FirstTestNG;

import org.testng.annotations.Test;

public class GroupTest {

	@Test(groups = {"group 1"})
	public void firstgroup() {
		System.out.println("in the first group");
	}
	
	@Test(groups = {"group 2"})
	public void secondgroup() {
		System.out.println("in the second group");
	}
}

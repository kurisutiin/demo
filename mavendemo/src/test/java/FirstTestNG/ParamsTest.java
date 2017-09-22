package FirstTestNG;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamsTest {
	@Test(dataProvider="getData")
	public void UserId(String userName, String subject) {
		System.out.println("\rUsername: " + userName + " \nSubject: " + subject + "\r");
	}

	@DataProvider
	public Object[] getData(){
		Object obj[][] = { 
				{"Crystal", "Arts"},
				{"John", "QA"},
				{"Christine", "Music"}
				
				         };
				
	return obj;
	}
}

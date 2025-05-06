package Tutorial_ninja;

import java.io.IOException;

public class Test extends Baseclass{
	
	
	
	@org.testng.annotations.Test
	public void TutorialninjaTest() throws InterruptedException, IOException {
		Pages page=new Pages(driver);
		page.HTCMobilepurchaseTest();
	}
	
	
	

}

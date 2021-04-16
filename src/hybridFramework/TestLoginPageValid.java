package hybridFramework;

import java.io.IOException;

public class TestLoginPageValid extends BaseTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BaseTest bt=new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		String user = flib.readPropertyFile(PROP_PATH, "username");
		String password = flib.readPropertyFile(PROP_PATH, "password");
		
		LoginPage lp = new LoginPage(driver);
		lp.loginProcess(PROP_PATH, password);
	}

}

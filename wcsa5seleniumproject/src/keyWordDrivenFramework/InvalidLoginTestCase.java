package keyWordDrivenFramework;

public class InvalidLoginTestCase extends BaseTest{
	
	public static void main(String[] args) {
		BaseTest bt = new BaseTest();
		bt.openbrowser();
		
		Flib flib = new Flib();
		
		int rc = flib.getLastRowCount(EXCEL_PATH, "invalidcreds");
		
		for (int i = 1; i <=rc; i++) {
			
		}
	}

}

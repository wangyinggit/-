package base;

import org.openqa.selenium.WebDriver;

public class UploadworksLogic {
	  WebDriver driver;
	  Uploadworks_ky_Page uploadworks_ky_Page;

	  public UploadworksLogic(WebDriver driver) {
	        this.driver = driver;
	        uploadworks_ky_Page = new Uploadworks_ky_Page(driver);
	        //loginPage = new LoginPage(driver);
	    }
	
	  /**
	     *上传图片操作
	     *
	     * @param userName
	     * @param pwd
	     * @param expected
	     */
	    public void upLoadPicture(String worksName, String worksMiaoShu, String yanZhengMa,String filePath) {
	       
	        //输入作品名称
	       uploadworks_ky_Page.sendKeysworksName(worksName);
	       uploadworks_ky_Page.sendKeysworksDescription(worksMiaoShu);
	       uploadworks_ky_Page.sendKeyYanZhengMa(yanZhengMa);
	       uploadworks_ky_Page.sendKeyWorks(filePath);
	       uploadworks_ky_Page.tijiaO();
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

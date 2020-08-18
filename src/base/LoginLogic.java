package base;

import org.openqa.selenium.WebDriver;

public class LoginLogic {
	  WebDriver driver;
	  LoginPage loginPage;

	  public LoginLogic(WebDriver driver) {
	        this.driver = driver;
	        loginPage = new LoginPage(driver);
	        //loginPage = new LoginPage(driver);
	    }
	
	  /*
	  public void loginPageButton(){
		  //�����¼��ť�����뵽��¼ҳ��
		  loginPage.clickLoginPageButton();
	  }
      */
	    /**
	     * ��¼����
	     *
	     * @param userName
	     * @param pwd
	     * @param expected
	     */
	    public void login(String userName, String pwd, String pactcha) {
	       // LoginPage loginPage = new LoginPage(driver);
	        //�����û���
	        loginPage.sendKeysUserName(userName);
	        //��������
	        loginPage.sendKeysPassWord(pwd);
	        //�����֤��
	        loginPage.sendKeysCaptcha(pactcha);
	        //�����¼��ť
	        loginPage.clickloginbutton();
	    }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}

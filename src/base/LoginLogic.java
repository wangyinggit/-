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
		  //点击登录按钮，进入到登录页面
		  loginPage.clickLoginPageButton();
	  }
      */
	    /**
	     * 登录操作
	     *
	     * @param userName
	     * @param pwd
	     * @param expected
	     */
	    public void login(String userName, String pwd, String pactcha) {
	       // LoginPage loginPage = new LoginPage(driver);
	        //输入用户名
	        loginPage.sendKeysUserName(userName);
	        //输入密码
	        loginPage.sendKeysPassWord(pwd);
	        //点击验证码
	        loginPage.sendKeysCaptcha(pactcha);
	        //点击登录按钮
	        loginPage.clickloginbutton();
	    }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}

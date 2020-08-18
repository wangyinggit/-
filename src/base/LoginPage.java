package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    /*
     * 登录页面内编写需要操作的元素定位方式和控件操作
     * */
	WebDriver driver;
	//定位登录页面,进入到登录页面
//	public static By loginpage = By.id("logina");
	//定位 用户名输入框
    public static By userNameInput = By.name("eduId");
    //定位 密码输入框
    public static By passWordInput = By.name("edu_p");
    //定位验证码
    public static By captchaInput = By.id("randomCode");
    //定位 登录按钮
    public static By loginBtn = By.className("btn-submit1");
	
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    /**
     * 进入到登录页面操作
     * public void clickLoginPageButton(){
	   driver.findElement(loginpage).click();
	   }
     */
   

    /**
     * 用户名输入操作
     */
    public void sendKeysUserName(String userName) {
        driver.findElement(userNameInput).clear();
        driver.findElement(userNameInput).sendKeys(userName);
    }
	

    /**
     * 密码输入操作
     */
    public void sendKeysPassWord(String passWord) {
        driver.findElement(passWordInput).clear();
        driver.findElement(passWordInput).sendKeys(passWord);
    }
    /**
     * 验证码操作
	   }
     */
      public void sendKeysCaptcha(String captcha){
 	   driver.findElement(captchaInput).clear();
 	  driver.findElement(captchaInput).sendKeys(captcha);
      }
    /**
     * 点击登录按钮
     */
    public void clickloginbutton() {
        driver.findElement(loginBtn).click();
    }
    /**
     *判断页面跳转成功
     */
    //public void geturl() {
       // driver.findElement(loginBtn).click();;
    
    
    
    
    
}

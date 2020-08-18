package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    /*
     * ��¼ҳ���ڱ�д��Ҫ������Ԫ�ض�λ��ʽ�Ϳؼ�����
     * */
	WebDriver driver;
	//��λ��¼ҳ��,���뵽��¼ҳ��
//	public static By loginpage = By.id("logina");
	//��λ �û��������
    public static By userNameInput = By.name("eduId");
    //��λ ���������
    public static By passWordInput = By.name("edu_p");
    //��λ��֤��
    public static By captchaInput = By.id("randomCode");
    //��λ ��¼��ť
    public static By loginBtn = By.className("btn-submit1");
	
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    /**
     * ���뵽��¼ҳ�����
     * public void clickLoginPageButton(){
	   driver.findElement(loginpage).click();
	   }
     */
   

    /**
     * �û����������
     */
    public void sendKeysUserName(String userName) {
        driver.findElement(userNameInput).clear();
        driver.findElement(userNameInput).sendKeys(userName);
    }
	

    /**
     * �����������
     */
    public void sendKeysPassWord(String passWord) {
        driver.findElement(passWordInput).clear();
        driver.findElement(passWordInput).sendKeys(passWord);
    }
    /**
     * ��֤�����
	   }
     */
      public void sendKeysCaptcha(String captcha){
 	   driver.findElement(captchaInput).clear();
 	  driver.findElement(captchaInput).sendKeys(captcha);
      }
    /**
     * �����¼��ť
     */
    public void clickloginbutton() {
        driver.findElement(loginBtn).click();
    }
    /**
     *�ж�ҳ����ת�ɹ�
     */
    //public void geturl() {
       // driver.findElement(loginBtn).click();;
    
    
    
    
    
}

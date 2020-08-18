package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Uploadworks_ky_Page {
	WebDriver driver;
	//获取输入作品名称框
	public static By worksInput = By.id("productionTitle");
	//获取输入作品描述框
	public static By worksDescription = By.id("productionContent");
	//获取输入验证码框
	public static By pathchaInput = By.id("verificationCode");
	//获取提交按钮
	public static By submitButton = By.className("btn-submit3");
	//获取作品图片上传框
	public static By worksPicture = By.id("input-file-now");
	
	public Uploadworks_ky_Page(WebDriver driver){
		this.driver = driver;
	}
	/**
     * 输入作品名称
     */
    public void sendKeysworksName(String worksName) {
        driver.findElement(worksInput).clear();
        driver.findElement(worksInput).sendKeys(worksName);
    }
	
    /**
     * 输入作品描述
     */
    public void sendKeysworksDescription(String worksMiaoShu) {
        driver.findElement(worksDescription).clear();
        driver.findElement(worksDescription).sendKeys(worksMiaoShu);
    }
    /**
     * 输入验证码
     */
    public void sendKeyYanZhengMa(String yanZhengMa) {
        driver.findElement(pathchaInput).clear();
        driver.findElement(pathchaInput).sendKeys(yanZhengMa);
    }
    /**
     * 滚动页面
     */
    public void scrollPage(String script,WebElement element) {
    	//script = "return arguments[0].scrollIntoView();";
    	//定位的地址是要滚动元素的地址
		//element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/div[1]/div[2]/div/p/a/img"));
		((JavascriptExecutor) driver).executeScript(script,element);
    }
    /**
     * 作品上传
     */
    public void sendKeyWorks(String filePath) {
    	
    	//filePath = "C:/Users/wang.ying/Pictures/Saved Pictures/小狗.jpg";
        driver.findElement(worksPicture).sendKeys(filePath);
    }
	public void tijiaO(){
		driver.findElement(submitButton).click();
	}
    
    
    
    
    
}

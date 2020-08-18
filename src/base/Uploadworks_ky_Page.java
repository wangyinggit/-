package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Uploadworks_ky_Page {
	WebDriver driver;
	//��ȡ������Ʒ���ƿ�
	public static By worksInput = By.id("productionTitle");
	//��ȡ������Ʒ������
	public static By worksDescription = By.id("productionContent");
	//��ȡ������֤���
	public static By pathchaInput = By.id("verificationCode");
	//��ȡ�ύ��ť
	public static By submitButton = By.className("btn-submit3");
	//��ȡ��ƷͼƬ�ϴ���
	public static By worksPicture = By.id("input-file-now");
	
	public Uploadworks_ky_Page(WebDriver driver){
		this.driver = driver;
	}
	/**
     * ������Ʒ����
     */
    public void sendKeysworksName(String worksName) {
        driver.findElement(worksInput).clear();
        driver.findElement(worksInput).sendKeys(worksName);
    }
	
    /**
     * ������Ʒ����
     */
    public void sendKeysworksDescription(String worksMiaoShu) {
        driver.findElement(worksDescription).clear();
        driver.findElement(worksDescription).sendKeys(worksMiaoShu);
    }
    /**
     * ������֤��
     */
    public void sendKeyYanZhengMa(String yanZhengMa) {
        driver.findElement(pathchaInput).clear();
        driver.findElement(pathchaInput).sendKeys(yanZhengMa);
    }
    /**
     * ����ҳ��
     */
    public void scrollPage(String script,WebElement element) {
    	//script = "return arguments[0].scrollIntoView();";
    	//��λ�ĵ�ַ��Ҫ����Ԫ�صĵ�ַ
		//element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/div[1]/div[2]/div/p/a/img"));
		((JavascriptExecutor) driver).executeScript(script,element);
    }
    /**
     * ��Ʒ�ϴ�
     */
    public void sendKeyWorks(String filePath) {
    	
    	//filePath = "C:/Users/wang.ying/Pictures/Saved Pictures/С��.jpg";
        driver.findElement(worksPicture).sendKeys(filePath);
    }
	public void tijiaO(){
		driver.findElement(submitButton).click();
	}
    
    
    
    
    
}

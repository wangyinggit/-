package base;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase {
	public static final String URL = "https://jjy-xly-student.qa.ichzh.com/xly2020/";
	WebDriver driver = null;
	@BeforeTest
	public void before(){
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
        }
	@Test
	public void testLogin() throws InterruptedException{
		 //实例化操作对象
		LoginLogic logic =new LoginLogic(driver);
		driver.findElement(By.id("logina")).click();
		//logic.loginPageButton();
		Thread.sleep(1000);
		logic.login("14195746", "20071130","1111");
		
	}
	@Test
	public void testUploadworks() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/div[1]/div[2]/div/p/a/img")).click();
		Thread.sleep(1000);
        UploadworksLogic uploadworksLogic = new UploadworksLogic(driver);
        // driver.findElement(By.className("btn-submit1")).click();
        String script ="return arguments[0].scrollIntoView();";
        WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/div[1]/div[2]/div/p/a/img"));
        String filePath = "C:/Users/wang.ying/Pictures/Saved Pictures/小狗.jpg";
        Thread.sleep(1000);
        uploadworksLogic.upLoadPicture("测试作品名称","测试作品的描述内容如下：这是一张图片","1111",filePath);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[12]/div[4]/button[2]")).click();
	}
	@Test
	public void test1(){
		Assert.assertEquals("one", "one1", "是否一样");
	}
	@AfterTest
	public void end(){
		driver.quit();
		System.out.print("end");
	}
}
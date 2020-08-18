package common;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

public class function {
	public static File captchapic(WebDriver driver, WebElement captchapho ) throws IOException{
		  //截取整个页面
	      File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   
	      //大图文件写进image
	      BufferedImage image =ImageIO.read(file);
	      //获取验证码图片的高和长
	      int width = captchapho.getSize().getWidth();
	      int height = captchapho.getSize().getHeight();
	      //获取验证码图片的位置
	      Point point = captchapho.getLocation();
	      BufferedImage elephoto = image.getSubimage(point.getX(), point.getY(), width, height);
	      ImageIO.write(elephoto, "png", file);
	      return file;
	}
}

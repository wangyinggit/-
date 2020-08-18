package base;

import java.util.StringTokenizer;

import javax.sound.midi.VoiceStatus;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class IianxiTestNG {
		public Object[][] user(){
			return new Object[][]{
			{"14104668","20080725"},
			{"14002195","20071029"},
			{"14191088","20070928"}
			};
		}
		public Object[][] user1(){
			return new Object[][]{
			{"one","one"},
			{"one","two"},
			{"one","one1"}
			};
		}
		@BeforeTest
		public void beforet(){
			System.out.println("测试之前");
		}
    
        @Test(dataProvider="user1")
        public void test1(String name,String password){
        	Assert.assertEquals(name, password, "比较name的值");
        }
        @AfterTest
        public void overtest(){
        	System.out.println("测试结束");
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

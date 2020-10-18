package crashreport;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
 
public class TestChrome {
 
public static void main(String[] args) {
 try
 {
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.facebook.com");
 }
 catch(Exception e)
 {
	 System.out.println("exception occured"+ e.getMessage());
 }

 

 
}
 
}
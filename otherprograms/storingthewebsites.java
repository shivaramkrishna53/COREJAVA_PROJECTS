package selinium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class storingthewebsites {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String strxpath;
		ArrayList<WebElement> searchresults=new ArrayList<WebElement>();
	    ArrayList<Object>alllinktext=new ArrayList<>();
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selinium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
				
		for(int i=1;i<=5;i++)
		{
			if(i>1)
			{
			strxpath="//a[@class='fl' and text()='"+i+"']";
			driver.findElement(By.xpath(strxpath)).click();
			Thread.sleep(2000);
			}
			
			searchresults=(ArrayList<WebElement>) driver.findElements(By.xpath("//div[@class='r']/a/h3"));
			for(WebElement link:searchresults)
			{
				alllinktext.add(link.getText());
			}
		}	
		for (Object eachLink : alllinktext) {
			System.out.println(eachLink);
		}
		
		
	}

}

package selinium;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.org.apache.bcel.internal.generic.GOTO;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class sampletesting {


    public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
    	
    	ArrayList<WebElement> searchresults=new ArrayList<WebElement>();
	    ArrayList<Object>alllinktext=new ArrayList<>();
    	
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        String baseUrl = "https://avocado/reports/304730";
        //String expectedTitle = "Welcome: Mercury Tours";
        //String actualTitle = "";
        
        
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        
       WebElement userid = driver.findElement(By.cssSelector("#i0116"));
       String a="v-shdurg@microsoft.com";
        		userid.sendKeys(a);
        		//Thread.sleep(5000);
        		WebElement button = driver.findElement(By.cssSelector("#idSIButton9"));
        		button.click();
        		//Thread.sleep(5000);
        		if(driver.findElement(By.id("WindowsAzureMultiFactorAuthentication"))!=null)
        				{
        			System.out.println("phone authent");
        			WebElement abcd = driver.findElement(By.id("WindowsAzureMultiFactorAuthentication"));
            		abcd.click();
            		//Thread.sleep(40000);
            		String asdf=".//button[@type='button']";
            		WebElement pqr=driver.findElement(By.xpath(asdf));
            		pqr.click();
            		//Thread.sleep(3000);
            		String asdfg=".//input[@type='checkbox']";
            		WebElement pqrs=driver.findElement(By.xpath(asdfg));
            		pqrs.click();
            		//Thread.sleep(3000);
            		String asdfgh=".//input[@type='checkbox']";
            		WebElement pqrst=driver.findElement(By.xpath(asdfgh));
            		pqrst.click();
            		//Thread.sleep(3000);
            		String msoaug=".//input[@value='Frames;Mso::AugLoop']";
            		WebElement msoauge=driver.findElement(By.xpath(msoaug));
            		msoauge.click();
            		//Thread.sleep(3000);
            		String msoreact=".//input[@value='Frames;Mso::React']";
            		WebElement msor=driver.findElement(By.xpath(msoreact));
            		msor.click();
            		//Thread.sleep(3000);
            		String msofb=".//input[@value='Frames;facebook::react']";
            		WebElement msof=driver.findElement(By.xpath(msofb));
            		msof.click();
            		//Thread.sleep(2000);
            		String appname="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > label > div > button";
            		WebElement appn = driver.findElement(By.cssSelector(appname));
            		appn.click();
            		//Thread.sleep(2000);
            		String selappname="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > label > div > ul > li.multiselect-item.multiselect-all.active > a > label";
            		WebElement selall=driver.findElement(By.cssSelector(selappname));
            		selall.click();
            		//Thread.sleep(2000);
            		String appnamepower="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > label > div > ul > li:nth-child(6) > a > label";
            		WebElement appow=driver.findElement(By.cssSelector(appnamepower));
            		appow.click();
            		//Thread.sleep(2000);
            		String modules="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(1) > td:nth-child(3) > table > label > div > button";
            		WebElement mod=driver.findElement(By.cssSelector(modules));
            		mod.click();
            		//Thread.sleep(2000);
            		String selallmod="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(1) > td:nth-child(3) > table > label > div > ul > li.multiselect-item.multiselect-all.active > a > label";
            		WebElement sea=driver.findElement(By.cssSelector(selallmod));
            		sea.click();
            		//Thread.sleep(2000);
            		String reactnat="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(1) > td:nth-child(3) > table > label > div > ul > li:nth-child(5) > a > label";
            		WebElement renat=driver.findElement(By.cssSelector(reactnat));
            		renat.click();
            		//Thread.sleep(2000);
            		String chkra=".//input[@value='Modules;chakracore']";
            		WebElement chkr=driver.findElement(By.xpath(chkra));
            		chkr.click();
            		//Thread.sleep(2000);
         int i=1;
            		while(i<100)
            		{
            			WebElement searchTextBox=(WebElement) driver.findElements(By.xpath("//*[@id=\"groupTable\"]/div/div[2]/div/div[1]/table/tbody/tr[1]/td[4]"));
            			String test=(searchTextBox.getText());
            			int w=Integer.parseInt(test);
            			if(w>5)
            			{
            				searchresults=(ArrayList<WebElement>) driver.findElements(By.xpath("//*[@id=\"groupTable\"]/div/div[2]/div/div[1]/table/tbody/tr[1]"));
                    		
                    		for(WebElement link:searchresults)
                			{
                				alllinktext.add(link.getText());
                			}
            			}
            			
            			i++;
            		}
            		
            		for (Object eachLink : alllinktext) {
            			System.out.println(eachLink);
            		}
            		
            		
            		System.out.println("phone authent");
            		
        				}
        		else {
        			
        				WebElement abc = driver.findElement(By.xpath("//*[@id=\"loginMessage\"]/a/p"));
        				abc.click();
        				
                		Thread.sleep(5000);
        				String re="#passwordInput"; //*[@id="loginMessage"]/a/p
                		WebElement password = driver.findElement(By.cssSelector(re));
                	       String x="Suguna@2003";
                	        	password.sendKeys(x);
                	        	Thread.sleep(3000);
                	        	WebElement button1 = driver.findElement(By.cssSelector("#submitButton"));
                        		button1.click();
                        		
                        		Thread.sleep(5000);
                        		
                        		WebElement abcd = driver.findElement(By.id("WindowsAzureMultiFactorAuthentication"));
                        		abcd.click();
                        		Thread.sleep(3000);
                        		WebElement button2= driver.findElement(By.cssSelector("#idSIButton9"));
                		button2.click();
        			
                		}
        		/*WebElement abc = driver.findElement(By.className("normalText"));
        		abc.click();
        		Thread.sleep(5000);
        		*/
        		/*String b="#passwordInput"; //*[@id="loginMessage"]/a/p
        		WebElement password = driver.findElement(By.cssSelector(b));
        	       String x="Suguna@2003";
        	        	password.sendKeys(x);
        	        	Thread.sleep(3000);
        	        	WebElement button1 = driver.findElement(By.cssSelector("#submitButton"));
                		button1.click();
                		
                		Thread.sleep(5000);
                		
                		WebElement abcd = driver.findElement(By.id("WindowsAzureMultiFactorAuthentication"));
                		abcd.click();
                		Thread.sleep(3000);
                		WebElement button2= driver.findElement(By.cssSelector("#idSIButton9"));
        		button2.click();
        		*/
        		Thread.sleep(30000);
        		//#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(1) > td:nth-child(1) > table > label > div > button
        		//String className="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(1) > td:nth-child(1) > table > label > div > button";
        		//WebElement button5 = driver.findElement(By.cssSelector("button[class='multiselect']"));
        		//Select sel=new Select(button5);
        		//sel.selectByIndex(0);
        		//Thread.sleep(5000);
        		//#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(1) > td:nth-child(1) > table > label > div > button
        		
        		//WebElement frames=driver.findElement(By.xpath(className));
        		//Select sel=new Select(frames);
        		//sel.deselectByVisibleText("  Select all");
        		
        			/*String asdf=".//button[@type='button']";
        		WebElement pqr=driver.findElement(By.xpath(asdf));
        		pqr.click();
        		Thread.sleep(3000);
        		String asdfg=".//input[@type='checkbox']";
        		WebElement pqrs=driver.findElement(By.xpath(asdfg));
        		pqrs.click();
        		Thread.sleep(3000);
        		String asdfgh=".//input[@type='checkbox']";
        		WebElement pqrst=driver.findElement(By.xpath(asdfgh));
        		pqrst.click();
        		Thread.sleep(3000);
        		String msoaug=".//input[@value='Frames;Mso::AugLoop']";
        		WebElement msoauge=driver.findElement(By.xpath(msoaug));
        		msoauge.click();
        		Thread.sleep(3000);
        		String msoreact=".//input[@value='Frames;Mso::React']";
        		WebElement msor=driver.findElement(By.xpath(msoreact));
        		msor.click();
        		Thread.sleep(3000);
        		String msofb=".//input[@value='Frames;facebook::react']";
        		WebElement msof=driver.findElement(By.xpath(msofb));
        		msof.click();
        		Thread.sleep(2000);
        		String appname="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > label > div > button";
        		WebElement appn = driver.findElement(By.cssSelector(appname));
        		appn.click();
        		Thread.sleep(2000);
        		String selappname="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > label > div > ul > li.multiselect-item.multiselect-all.active > a > label";
        		WebElement selall=driver.findElement(By.cssSelector(selappname));
        		selall.click();
        		Thread.sleep(2000);
        		String appnamepower="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > label > div > ul > li:nth-child(6) > a > label";
        		WebElement appow=driver.findElement(By.cssSelector(appnamepower));
        		appow.click();
        		Thread.sleep(2000);
        		String modules="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(1) > td:nth-child(3) > table > label > div > button";
        		WebElement mod=driver.findElement(By.cssSelector(modules));
        		mod.click();
        		Thread.sleep(2000);
        		String selallmod="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(1) > td:nth-child(3) > table > label > div > ul > li.multiselect-item.multiselect-all.active > a > label";
        		WebElement sea=driver.findElement(By.cssSelector(selallmod));
        		sea.click();
        		Thread.sleep(2000);
        		String reactnat="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(1) > td:nth-child(3) > table > label > div > ul > li:nth-child(5) > a > label";
        		WebElement renat=driver.findElement(By.cssSelector(reactnat));
        		renat.click();
        		Thread.sleep(2000);
        		String chkra=".//input[@value='Modules;chakracore']";
        		WebElement chkr=driver.findElement(By.xpath(chkra));
        		chkr.click();
        		Thread.sleep(2000);
     int i=1;
        		while(i<100)
        		{
        			WebElement searchTextBox=(WebElement) driver.findElements(By.xpath("//*[@id=\"groupTable\"]/div/div[2]/div/div[1]/table/tbody/tr[1]/td[4]"));
        			String test=(searchTextBox.getText());
        			int w=Integer.parseInt(test);
        			if(w>5)
        			{
        				searchresults=(ArrayList<WebElement>) driver.findElements(By.xpath("//*[@id=\"groupTable\"]/div/div[2]/div/div[1]/table/tbody/tr[1]"));
                		
                		for(WebElement link:searchresults)
            			{
            				alllinktext.add(link.getText());
            			}
        			}
        			
        			i++;
        		}
        		
        		for (Object eachLink : alllinktext) {
        			System.out.println(eachLink);
        		}
    }
}
*/
    }}
////*[@id="groupTable"]/div/div[2]/div/div[1]/table/tbody/tr[1]

////*[@id="groupTable"]/div/div[2]/div/div[1]/table/tbody/tr[1]/td[4]

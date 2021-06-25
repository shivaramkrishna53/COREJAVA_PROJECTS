package selinium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) throws Exception {
		ArrayList<WebElement> searchresults=new ArrayList<WebElement>();
	    ArrayList<Object>alllinktext=new ArrayList<>();
    	
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        String baseUrl = "https://avocado/reports/304730";
        //String expectedTitle = "Welcome: Mercury Tours";
        //String actualTitle = "";
        
        
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        
       WebElement userid = driver.findElement(By.cssSelector("#i0116"));
       String a="v-shdurg@microsoft.com";
        		userid.sendKeys(a);
        		Thread.sleep(5000);
        		WebElement button = driver.findElement(By.cssSelector("#idSIButton9"));
        		button.click();
        		Thread.sleep(5000);
        		
        		WebElement abc = driver.findElement(By.className("normalText"));
        		abc.click();
        		Thread.sleep(5000);
        		String b="#passwordInput"; //*[@id="loginMessage"]/a/p
        		WebElement password = driver.findElement(By.cssSelector(b));
        	       String x="Suguna@2003";
        	        	password.sendKeys(x);
        	        	Thread.sleep(3000);
        	        	WebElement button1 = driver.findElement(By.cssSelector("#submitButton"));
                		button1.click();
                		Thread.sleep(5000);
                		WebElement abcd = driver.findElement(By.id("WindowsAzureMultiFactorAuthentication"));
                		abcd.click();
                		Thread.sleep(5000);
                		WebElement button2= driver.findElement(By.cssSelector("#idSIButton9"));
        		button2.click();
        		Thread.sleep(30000);
        		String asdf=".//button[@type='button']";
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
        		String reactnat=".//input[@value='Modules;react_native_win32']";
        		WebElement renat=driver.findElement(By.xpath(reactnat));
        		renat.click();
        		Thread.sleep(2000);
        		String chkra=".//input[@value='Modules;chakracore']";
        		WebElement chkr=driver.findElement(By.xpath(chkra));
        		chkr.click();
        		Thread.sleep(2000);
        		
        		
        		int i=1;
        		while(i<50)
        		{
        			System.out.println("entering while loop");
        			WebElement searchTextBox=(WebElement) driver.findElements(By.xpath("//*[@id=\"groupTable\"]/div/div[2]/div/div[1]/table/tbody/tr[1]/td[4]")).get(i);
        			String test=( (WebElement) driver.findElements(By.xpath("/html/body/div[4]/div/div/div/div[4]/div/div[2]/div/div[1]/table/tbody/tr[2]/td[4]"))).getText();
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
	

}}

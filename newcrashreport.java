package selinium;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class newcrashreport {


    public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
    	
    	ArrayList<WebElement> searchresults=new ArrayList<WebElement>();
	    ArrayList<Object>alllinktext=new ArrayList<>();
    	
		System.setProperty("webdriver.chrome.driver","D:\\javafullstack\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
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
                		Thread.sleep(10000);
                		WebElement button2= driver.findElement(By.cssSelector("#idSIButton9"));
        		button2.click();
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
        		String reactnat="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(1) > td:nth-child(3) > table > label > div > ul > li:nth-child(5) > a > label";
        		WebElement renat=driver.findElement(By.cssSelector(reactnat));
        		renat.click();
        		Thread.sleep(2000);
        		String chkra=".//input[@value='Modules;chakracore']";
        		WebElement chkr=driver.findElement(By.xpath(chkra));
        		chkr.click();
        		Thread.sleep(2000);
        		
        		
        		
searchresults=(ArrayList<WebElement>) driver.findElements(By.xpath("//tr[@class='google-visualization-table-tr-even']/td[@class='class=\"google-visualization-table-td\"']"));
        		
        		for(WebElement link:searchresults)
    			{
    				alllinktext.add(link.getText());
    			}
        		for (Object eachLink : alllinktext) {
        			System.out.println(eachLink);
        		}
        		
        		/*
        		String csv="#groupTable > div > div.meta-container > div > div.col-md-4 > span.download-csv > span > a";
        		WebElement cs=driver.findElement(By.cssSelector(csv));
        		cs.click();
        		Thread.sleep(40000);
        		JavascriptExecutor jse = (JavascriptExecutor)driver;
        		jse.executeScript("scroll(0,0);");
        		
        		//2nd download
        		
        		String as=".//button[@type='button']";
        		WebElement pq=driver.findElement(By.xpath(as));
        		pq.click();
        		Thread.sleep(3000);
        		String at=".//input[@type='checkbox']";
        		WebElement pw=driver.findElement(By.xpath(at));
        		pw.click();
        		Thread.sleep(3000);
        		String asdfgh2=".//input[@type='checkbox']";
        		WebElement pqrst2=driver.findElement(By.xpath(asdfgh2));
        		pqrst2.click();
        		Thread.sleep(3000);
        		String msoaug2=".//input[@value='Frames;Mso::AugLoop']";
        		WebElement msoauge2=driver.findElement(By.xpath(msoaug2));
        		msoauge2.click();
        		Thread.sleep(3000);		
        		String appname2="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > label > div > button";
        		WebElement appn2 = driver.findElement(By.cssSelector(appname2));
        		appn2.click();
        		Thread.sleep(2000);
        		String selappname2="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > label > div > ul > li.multiselect-item.multiselect-all > a > label";
        		WebElement selall2=driver.findElement(By.cssSelector(selappname2));
        		selall2.click();
        		Thread.sleep(2000);
        		selall2.click();
        		Thread.sleep(2000);
        		String appnamepower2="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > label > div > ul > li:nth-child(6) > a > label";
        		WebElement appow2=driver.findElement(By.cssSelector(appnamepower2));
        		appow2.click();
        		Thread.sleep(3000);
        		String modules2="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(1) > td:nth-child(3) > table > label > div > button";
        		WebElement mod2=driver.findElement(By.cssSelector(modules2));
        		mod2.click();
        		Thread.sleep(2000);
        		String selallmod2="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(1) > td:nth-child(3) > table > label > div > ul > li.multiselect-item.multiselect-all > a > label";
        		WebElement sea2=driver.findElement(By.cssSelector(selallmod2));
        		sea2.click();
        		Thread.sleep(3000);
        		sea2.click();
        		String csv2="#groupTable > div > div.meta-container > div > div.col-md-4 > span.download-csv > span > a";
        		WebElement cs2=driver.findElement(By.cssSelector(csv2));
        		cs2.click();
        		Thread.sleep(40000);
        		JavascriptExecutor jser = (JavascriptExecutor)driver;
        		jser.executeScript("scroll(0,0);");
        		//3rd download
        		
        		Thread.sleep(3000);
        		String asdgh=".//button[@type='button']";
        		WebElement pqs=driver.findElement(By.xpath(asdgh));
        		pqs.click();
        		Thread.sleep(3000);
        		String asdfg3=".//input[@type='checkbox']";
        		WebElement pqrs3=driver.findElement(By.xpath(asdfg3));
        		pqrs.click();
        		Thread.sleep(3000);
        		String asdfgh4=".//input[@type='checkbox']";
        		WebElement pqrst4=driver.findElement(By.xpath(asdfgh4));
        		pqrst4.click();
        		Thread.sleep(3000);
        		String msoaug4=".//input[@value='Frames;Mso::AugLoop']";
        		WebElement msoauge4=driver.findElement(By.xpath(msoaug4));
        		msoauge.click();
        		Thread.sleep(3000);
        		String msoreact3=".//input[@value='Frames;Mso::React']";
        		WebElement msor3=driver.findElement(By.xpath(msoreact3));
        		msor3.click();
        		Thread.sleep(3000);
        		String msofb3=".//input[@value='Frames;facebook::react']";
        		WebElement msof3=driver.findElement(By.xpath(msofb3));
        		msof3.click();
        		Thread.sleep(2000);
        		String appname3="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > label > div > button";
        		WebElement appn3 = driver.findElement(By.cssSelector(appname3));
        		appn3.click();
        		Thread.sleep(2000);
        		String selappname3="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > label > div > ul > li.multiselect-item.multiselect-all > a > label";
        		WebElement selall3=driver.findElement(By.cssSelector(selappname3));
        		selall3.click();
        		Thread.sleep(2000);
        		selall3.click();
        		Thread.sleep(2000);
        		String appnamewinword="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > label > div > ul > li:nth-child(7) > a > label";
        		WebElement appwin=driver.findElement(By.cssSelector(appnamewinword));
        		appwin.click();
        		Thread.sleep(2000);
        		String modules5="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(1) > td:nth-child(3) > table > label > div > button";
        		WebElement mod5=driver.findElement(By.cssSelector(modules5));
        		mod5.click();
        		Thread.sleep(2000);
        		String selallmod5="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(1) > td:nth-child(3) > table > label > div > ul > li.multiselect-item.multiselect-all > a > label";
        		WebElement sea5=driver.findElement(By.cssSelector(selallmod5));
        		sea5.click();
        		Thread.sleep(2000);
        		sea5.click();
        		Thread.sleep(2000);
        		String reactnat5="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(1) > td:nth-child(3) > table > label > div > ul > li:nth-child(5) > a > label";
        		WebElement renat5=driver.findElement(By.cssSelector(reactnat5));
        		renat5.click();
        		Thread.sleep(2000);
        		String chkra2=".//input[@value='Modules;chakracore']";
        		WebElement chkr2=driver.findElement(By.xpath(chkra2));
        		chkr2.click();
        		Thread.sleep(2000);
        		String csv5="#groupTable > div > div.meta-container > div > div.col-md-4 > span.download-csv > span > a";
        		WebElement cs5=driver.findElement(By.cssSelector(csv5));
        		cs5.click();
        		Thread.sleep(40000);
        		JavascriptExecutor jsers = (JavascriptExecutor)driver;
        		jsers.executeScript("scroll(0,0);");
        		
        		//4th download
        		
        		
        		String asdf6=".//button[@type='button']";
        		WebElement pqr6=driver.findElement(By.xpath(asdf6));
        		pqr6.click();
        		Thread.sleep(3000);
        		String asdfg6=".//input[@type='checkbox']";
        		WebElement pqrs6=driver.findElement(By.xpath(asdfg6));
        		pqrs.click();
        		Thread.sleep(3000);
        		String asdfgh6=".//input[@type='checkbox']";
        		WebElement pqrst6=driver.findElement(By.xpath(asdfgh6));
        		pqrst6.click();
        		Thread.sleep(3000);
        		String msoaug6=".//input[@value='Frames;Mso::AugLoop']";
        		WebElement msoauge6=driver.findElement(By.xpath(msoaug6));
        		msoauge6.click();
        		Thread.sleep(3000);
        		
        		String appname35="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > label > div > button";
        		WebElement appn35 = driver.findElement(By.cssSelector(appname35));
        		appn35.click();
        		Thread.sleep(2000);
        		String selappname35="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > label > div > ul > li.multiselect-item.multiselect-all > a > label";
        		WebElement selall35=driver.findElement(By.cssSelector(selappname35));
        		selall35.click();
        		Thread.sleep(2000);
        		selall35.click();
        		Thread.sleep(2000);
        		String appnamewinword5="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > label > div > ul > li:nth-child(7) > a > label";
        		WebElement appwin5=driver.findElement(By.cssSelector(appnamewinword5));
        		appwin5.click();
        		Thread.sleep(2000);
        		String modules21="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(1) > td:nth-child(3) > table > label > div > button";
        		WebElement mod21=driver.findElement(By.cssSelector(modules21));
        		mod21.click();
        		Thread.sleep(2000);
        		String selallmod21="#content-container > div > div > div > div.filter > table > tbody > tr:nth-child(1) > td:nth-child(3) > table > label > div > ul > li.multiselect-item.multiselect-all > a > label";
        		WebElement sea21=driver.findElement(By.cssSelector(selallmod21));
        		sea21.click();
        		Thread.sleep(3000);
        		sea21.click();
        		String csv21="#groupTable > div > div.meta-container > div > div.col-md-4 > span.download-csv > span > a";
        		WebElement cs21=driver.findElement(By.cssSelector(csv21));
        		cs21.click();
        		Thread.sleep(40000);
        		JavascriptExecutor jsert = (JavascriptExecutor)driver;
        		jsert.executeScript("scroll(0,0);");
        		*/
        		//driver.close();
        		
        		
        		
        		
        		
        		
       
    }


}

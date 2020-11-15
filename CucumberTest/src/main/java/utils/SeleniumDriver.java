package utils;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import locators.CalculatorLocators;

public class SeleniumDriver  {

	private static WebDriver driver;
	private static WebDriverWait waitDriver;
    public final static int TIMEOUT = 30;
    public final static int PAGE_LOAD_TIMEOUT = 50;

	
	private  SeleniumDriver() {

	       
    	driver = new ChromeDriver();
        driver.manage().window().maximize();

        waitDriver = new WebDriverWait(driver, TIMEOUT);
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        
    }
	
	
	
	
	public static void openPage(String url)
	{
		
		
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver");
		
		 
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
	}
		
	public static WebDriver getDriver()
	{
		return driver;
	}

	
	public static void tearDown()
	{
		if(driver!= null)
		{
			
			driver.close();
			driver.quit();
			
		}
		
		driver = null;
	}
	
	 static char[] reverse(char a[], int n) 
	    { 
	        char[] b = new char[n]; 
	        int j = n; 
	        for (int i = 0; i < n; i++) { 
	            b[j - 1] = a[i]; 
	            j = j - 1; 
	        }
			return b; 
	    }
	
	public static void enterNumber(int number) throws Throwable
	{
		
	Thread.sleep(2000);
	
	String str1 = String.valueOf(number);
	StringBuffer str2 = new  StringBuffer(str1);
	StringBuffer rev =   str2.reverse();
	String rev1 = rev.toString() ;
	int numToEnter =  Integer.parseInt(rev1);
	CalculatorLocators locators = new CalculatorLocators();
		
		
		while(numToEnter > 0)
		{
			int numberToClick = numToEnter % 10;
			
			
			if(numberToClick == 0)
			{
				locators.zero.click();
			 
			}
			else if(numberToClick == 1)
			{
			

				locators.one.click();
			}
			else if(numberToClick == 2)
			{
			  locators.two.click();

			}
			else if(numberToClick == 3)
			{
			
				locators.three.click();
			}
			else if(numberToClick == 4)
			{
				locators.four.click();
			}
			else if(numberToClick == 5)
			{
				locators.five.click();
			}
			else if(numberToClick == 6)
			{
				locators.six.click();
			}
			else if(numberToClick == 7)
			{
				locators.seven.click();
			}
			else if(numberToClick == 8)
			{
				locators.eight.click();
			}
			else if(numberToClick == 9)
			{
				locators.nine.click();
			}
			
			numToEnter = numToEnter/10;
			
			
		}
				
	}
	
	public static void enterOperation(String operation) throws Throwable
	{
		
		CalculatorLocators locators = new CalculatorLocators();
		Thread.sleep(2000);
		if(operation!= null)
		{
		if(operation.equalsIgnoreCase("Multiplication"))
		{
			
			 //r.keyPress(KeyEvent.VK_SHIFT);
			locators.multClick();
		}
		else if(operation.equalsIgnoreCase("Division"))
		{
			locators.divClick();
		}
		else if(operation.equalsIgnoreCase("Addition"))
		{
			locators.addClick();
			
		}
		else if(operation.equalsIgnoreCase("Subtraction"))
		{
			locators.subClick();
		}
		
		}
		
	}

	
	
	
}

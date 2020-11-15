package locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumDriver;

public class CalculatorLocators {

	CalculatorLocators locator;
	
	// @FindBy(id="sciInPut")
	public   String input= "//*[@id='sciInPut']";
	
	
	
    
	@FindBy(id="sciOutPut")
	public   WebElement output;
	
	public String getOutput()
	{
		return output.getText();
	
	}
    
  @FindBy(xpath="//span[text()='+']")
  public   WebElement add;
  
  public void addClick()
  {
	  add.click();
  }
  
    
  @FindBy(xpath= "//span[contains(@onclick,'*')]")
  public   WebElement mult;
  
  public void multClick()
  {
	  mult.click();
  }
  
    
  @FindBy(xpath="//span[text()='/']")
  public      WebElement div;
  
  public void divClick()
  {
	  div.click();
  }
  
  
    
  @FindBy(xpath="//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[4]")
  public      WebElement sub;
  
  public void subClick()
  {
	  sub.click();
  }
  
    
  @FindBy(xpath="//span[text()='=']")
  public      WebElement equals;
  
  public void equalsClick()
  {
	  equals.click();
  }
  
    
    @FindBy(xpath="//span[text()='AC']")
    public    WebElement  clear;
    
    public void clearClick()
    {
    	clear.click();
    }
    
    @FindBy(xpath="//span[text()='1']")
    public WebElement one;
    
    public void oneClick()
    {
    	one.click();
    }
    
    
    @FindBy(xpath="//span[text()='2']")
    public WebElement two;
    
    public void twoClick()
    {
    	two.click();
    }
    
    
    @FindBy(xpath="//span[text()='3']")
    public WebElement three;
    
    public void threeClick()
    {
    	three.click();
    }
    
    @FindBy(xpath="//span[text()='4']")
    public WebElement four;
    
    public void fourClick()
    {
    	four.click();
    }
    
    
    @FindBy(xpath="//span[text()='5']")
    public WebElement five;
    
    public void fiveClick()
    {
    	five.click();
    }
    
    @FindBy(xpath="//span[text()='6']")
    public WebElement six;
    
    public void sixClick()
    {
    	six.click();
    }
    
    @FindBy(xpath="//span[text()='7']")
    public WebElement seven;
    
    public void sevenClick()
    {
    	seven.click();
    }
    
    
    @FindBy(xpath="//span[text()='8']")
    public WebElement eight;
    
    public void eightClick()
    {
    	eight.click();
    }
    
    @FindBy(xpath="//span[text()='9']")
    public WebElement nine;
    
    public void nineClick()
    {
    	nine.click();
    	
    }
    
    @FindBy(xpath="//span[text()='0']")
    public WebElement zero;
    
    public void zeroClick()
    {
    	zero.click();
    }
    
    
    public String dyXpath = "//span[text()='+num+']";
    
    public CalculatorLocators()
    {
    	// this.locator  = new CalculatorLocators();
        PageFactory.initElements(SeleniumDriver.getDriver() ,this);
    }

	
	
}

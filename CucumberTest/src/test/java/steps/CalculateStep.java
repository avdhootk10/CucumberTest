package steps;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import locators.CalculatorLocators;
import utils.SeleniumDriver;

public class CalculateStep {

	WebDriver driver = SeleniumDriver.getDriver() ;



@Given("^Navigate to <\"([^\"]*)\">$")
public void navigate_to(String url) throws Throwable {
	SeleniumDriver.openPage(url);
	
}


@When("^perform calculation between (\\d+) and (\\d+) with Multiplication$")
public void perform_calculation_between_and_with_Multiplication(int n1, int n2) throws Throwable {
	
    CalculatorLocators locators = new CalculatorLocators();
    locators.clearClick();
	SeleniumDriver.enterNumber(n1);
	SeleniumDriver.enterOperation("Multiplication");
	SeleniumDriver.enterNumber(n2);
	locators.equalsClick();
	
}

@Then("^Validate output with (\\d+)$")
public void validate_output_with(int expected) throws Throwable {
   
	
CalculatorLocators locators = new CalculatorLocators();
	

	 WebElement actualElement =  locators.output;
	String actualString = actualElement.getText().trim();
	int actual = Integer.parseInt(actualString);
	
	
	System.out.println("*************** Actual :"+actual);
	System.out.println("*************** Expected :"+expected);
	assertEquals(actual, expected);
	SeleniumDriver.tearDown();

}

@When("^perform calculation between (\\d+) and (\\d+) with Division$")
public void perform_calculation_between_and_with_Division(int n1, int n2) throws Throwable {

	CalculatorLocators locators = new CalculatorLocators();
    locators.clearClick();
	SeleniumDriver.enterNumber(n1);
	SeleniumDriver.enterOperation("Division");
	SeleniumDriver.enterNumber(n2);
	locators.equalsClick();
	
}

@When("^perform calculation between -(\\d+) and (\\d+) with Addition$")
public void perform_calculation_between_and_with_Addition(int n1, int n2) throws Throwable {
	CalculatorLocators locators = new CalculatorLocators();
    locators.clearClick();
    locators.sub.click();
	SeleniumDriver.enterNumber(n1);
	SeleniumDriver.enterOperation("Addition");
	SeleniumDriver.enterNumber(n2);
	locators.equalsClick();
	
	
	
}

@When("^perform calculation between (\\d+) and -(\\d+) with Subtraction$")
public void perform_calculation_between_and_with_Subtraction(int n1, int n2) throws Throwable {
	
	CalculatorLocators locators = new CalculatorLocators();
    locators.clearClick();
	SeleniumDriver.enterNumber(n1);
	SeleniumDriver.enterOperation("Subtraction");
	locators.sub.click();
	SeleniumDriver.enterNumber(n2);
	locators.equalsClick();
	
	
   
}



	
	
}

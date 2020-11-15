@calculation
Feature: This is to perform mathematical calculation
        I want to perform mathematical calculation and validate output

 
  @calculate
  Scenario Outline: Test case1
    Given Navigate to <"https://www.calculator.net/">
    When  perform calculation between <N1> and <N2> with <Operation>
    Then  Validate output with <Result>
    Examples:
			| N1        | N2        | Operation     	 | Result  | 
  	  | 423		    | 525       | Multiplication   | 222075	 | 
      | 4000      | 20        | Division  	     | 20      | 
      | -234234   | 345345    | Addition        | 111111  | 
      | 234823    | -23094823 | Subtraction      | 23329646|
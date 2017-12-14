package stedef;

import cucumber.api.java.en.Given;

public class onestepdef {

	
	
	@Given("^first line$")
	public void first_line() throws Throwable {
	   System.out.println("first line"); 
	}

	@Given("^Second Line$")
	public void Second_Line() throws Throwable {
	   System.out.println("second line");
	}
}

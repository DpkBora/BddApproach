package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Test {

	@Given("i am a manual tester")
	public void iamamanualtester() {
		System.out.println("the user is on the login page");
		
		
	}
	@When("i apply for new job")
	public void iapplyfornewjob() {
		
		System.out.println("the user enters a valid username and password");
		
		
	}
	@Then("i am not satisfied with that salary")
	public void iamnoysatisfiedwiththatsalary()
	{
		System.out.println("the user should be redirected to the dashboard");
		
	}
	@And("i get less pay")
	//Hello
	public void igetlesspay()
	{
		System.out.println("the user clicks the login button");
		
	}
	
	@But("my parents are satisfied")
	public void myparentsaresatisfied()
	{
	System.out.println("my parents are satisfied");
	//Test
	
	}
	

}

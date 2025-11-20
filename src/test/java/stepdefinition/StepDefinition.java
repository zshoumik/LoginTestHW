package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

		WebDriver driver; //Global
	
	@Given("Open chrome browser")
	public void open_chrome_browser() {
		driver= new ChromeDriver();
	}

	@Given("Go to login page using URL")
	public void go_to_login_page_using_url() {
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("Input valid username")
	public void input_valid_username() {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("student");
	}

	@When("Input valid password")
	public void input_valid_password() {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Password123");
	}

	@When("Click Login button")
	public void click_login_button() {
		driver.findElement(By.xpath("//*[@id='submit']")).click();
	}

	@Then("Login should be successful and the Logout button should be visible")
	public void login_should_be_successful_and_the_logout_button_should_be_visible() {
		Boolean status = driver.findElement(By.xpath("//*[text()='Logged In Successfully']")).isDisplayed();
		System.out.println("Log out button present = " + status);
		driver.quit();
	}

	@When("Input invalid username")
	public void input_invalid_username() {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("wrong");
	}

	@When("Input invalid password")
	public void input_invalid_password() {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("wrong");
	}

	@Then("Login should not be successful and the Logout button should not be visible")
	public void login_should_not_be_successful_and_the_logout_button_should_not_be_visible() {
		try {
			Boolean status = driver.findElement(By.xpath("//*[text()='Logged In Successfully']")).isDisplayed();
			System.out.println("Log out button present = " + status);}
		catch (Exception e) {}
		driver.quit();
	}

	@When("Input blank username")
	public void input_blank_username() {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("");
	}

	@When("Input blank password")
	public void input_blank_password() {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("");
	}
	
}

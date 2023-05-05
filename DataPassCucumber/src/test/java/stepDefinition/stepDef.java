package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClass.StepDefPageClass;
import pageClass.commonFunction;

public class stepDef {
	// StepDefPageClass StepDefPageClass;
	extentReport1 extentReport1Obj = new extentReport1();
	commonFunction commonFunctionObj = new commonFunction();
	StepDefPageClass StepDefPageClassObj = new StepDefPageClass();

	public static WebDriver driver;
	/*
	 * public stepDef(StepDefPageClass StepDefPageClass) {
	 * this.StepDefPageClassObj=StepDefPageClass; }
	 */

	@Given("^hit the url$")
	public void hit_the_url() throws Throwable {

		extentReport1.extentReporter.flush();

		System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		String url = "https://www.browserstack.com/users/sign_in";
		//String url = "https://www.google.com/";
		driver.get(url);
		pageClass.StepDefPageClass.extentTest.log(Status.PASS, "Hitting the url");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Given("^google url$")
	public void google_the_url() throws Throwable {

		extentReport1.extentReporter.flush();

		System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		//String url = "https://www.browserstack.com/users/sign_in";
		String url = "https://www.google.com/";
		driver.get(url);
		pageClass.StepDefPageClass.extentTest.log(Status.PASS, "Hitting the google url");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	@SuppressWarnings("static-access")
	@When("^enter username$")
	public void enter_username() throws Throwable {

		// WebElement user =
		// StepDefPageClass.driver.findElement(By.xpath("//input[@id='user_email_login']"));
		// user.sendKeys("Pragya");
		StepDefPageClass.giveInput("Pragya");
		StepDefPageClass.extentTest.log(Status.PASS, "Username is entered");

	}

	@Then("^error should come$")
	public void error_should_come() throws Throwable {
		try {

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			WebElement emailError = driver.findElement(By.xpath("//span[text()='Invalid Email']"));
			String email = emailError.getText();
			System.out.println(email);

			// extentTest.pass("Invalid email message: Passed");
			StepDefPageClass.extentTest.log(Status.PASS, "Email message is showing");
		} catch (Exception e) {
			e.printStackTrace();
			// extentTest.fail("Invalid email message: Failed");
			StepDefPageClass.extentTest.log(Status.FAIL, "Invalid email message: Failed");
		}
	}

	@Given("^maximize it$")
	public void maximize_it() throws Throwable {

		driver.manage().window().maximize();
		StepDefPageClass.extentTest.log(Status.PASS, "Window is maximized");
		driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();

	}
	
	@Given("^maximize google browser$")
	public void maximize_google() throws Throwable {

		driver.manage().window().maximize();
		System.out.println("Maximize the google");
		StepDefPageClass.extentTest.log(Status.PASS, "Window is maximized");
		//driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();

	}

	@When("^and enter password$")
	public void and_enter_password() throws Throwable {
		WebElement password = driver.findElement(By.xpath("//input[@id='user_password']"));
		password.sendKeys("Pragya");
		StepDefPageClass.extentTest.log(Status.PASS, "Password is entered");
	}
	
	@Then("Abstract {string} from web page")
	public void abstract_from_web_page(String string) throws Exception {
		 commonFunctionObj.abstractValues(string);
		//commonFunctionObj.abstractValues2();		
	}

	@Then("^close the browser$")
	public void check_more_outcomes() throws Throwable {
		System.out.println("Check more outcomes");
		driver.quit();
		StepDefPageClass.extentTest.log(Status.PASS, "Browser closed");
		extentReport1.extentReporter.flush();

	}
	
	@Then("^close google browser$")
	public void check_more_outcomes_for_google() throws Throwable {
		System.out.println("Check more outcomes");
		driver.quit();
		System.out.println("Google browser is closed");
		StepDefPageClass.extentTest.log(Status.PASS, "Google Browser closed");
		extentReport1.extentReporter.flush();

	}

	@Then("^display sign in content$")
	public void display_sign_in_content() throws Throwable {
		Thread.sleep(2000);
		WebElement SignIn = driver.findElement(By.xpath("(//h1[@class='heading'])[1]"));
		String sign = SignIn.getText();
		System.out.println("Content is: " + sign);
	}

	@Given("^To check if error message is showing and for that,$")
	public void to_check_if_error_message_is_showing_and_for_that() throws Throwable {
		extentReport1.generateReport();

		StepDefPageClass.extentTest = extentReport1.extentReporter.createTest("Test Case ID: " + extentReport1.ID
				+ "<br>" + "<FONT COLOR='GREY'>" + "<i>To check if error message is showing</i></FONT>");
		extentReport1.ID++;
	}

	@Given("^To check launching of browser and for that,$")
	public void to_check_launching_of_browser_and_for_that() throws Throwable {
		extentReport1.generateReport();

		StepDefPageClass.extentTest = extentReport1.extentReporter.createTest("Test Case ID: " + extentReport1.ID
				+ "<br>" + "<FONT COLOR='GREY'>" + "To check launching of browser and for that,</i></FONT>");
		extentReport1.ID++;
	}

	@Given("To abstract multiple values from single screen and for that,")
	public void to_abstract_multiple_values_from_single_screen() throws Throwable {
		extentReport1.generateReport();

		StepDefPageClass.extentTest = extentReport1.extentReporter.createTest("Test Case ID: " + extentReport1.ID
				+ "<br>" + "<FONT COLOR='GREY'>" + "To abstract multiple values from single screen</i></FONT>");
		extentReport1.ID++;
	}

}

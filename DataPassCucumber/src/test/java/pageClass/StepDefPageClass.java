package pageClass;

import org.openqa.selenium.By;
import com.aventstack.extentreports.ExtentTest;
import stepDefinition.stepDef;

public class StepDefPageClass {
	
	private static By user = By.xpath("//input[@id='user_email_login']");
	private static By signIn = By.xpath("(//h1[@class='heading'])[1]");
	                                     //*[@id="signin_signup_form"]/div[1]/div/div[1]/fieldset/h1
	private static By signInWithGoogle = By.xpath("(//a[@class='btn btn-secondary-gray col-center oauth-btn google-logo-btn'])[1]");
	private static By signMeInButton = By.xpath("//input[@id='user_submit']");
		
	public static ExtentTest extentTest;
	
	public By getSignInContent()
	{
		return signIn;
	}
	
	public By getSignInWithGoogle()
	{
		return signInWithGoogle;
	}
	
	public By getSignMeInButton()
	{
		return signMeInButton;
	}
	
	public static void giveInput(String name)
	{
		stepDef.driver.findElement(user).sendKeys(name);
	}
	
	}


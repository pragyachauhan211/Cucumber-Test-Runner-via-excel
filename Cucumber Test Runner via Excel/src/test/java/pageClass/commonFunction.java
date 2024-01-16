package pageClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import stepDefinition.stepDef;

public class commonFunction {

	public commonFunction() {
		// TODO Auto-generated constructor stub
	}

	public static By byElement;
	public static String string;
	StepDefPageClass StepDefPageClassObj = new StepDefPageClass();

	public String getWebELement(By element) {
		return stepDef.driver.findElement(element).getText();
	}

	public void switchMethod2() {

		switch (sample1.switchMethod1()) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		}
	}

	public String switchMethod3(String string) {
		
		String str = "";
		//if(str.equals(getWebELement(StepDefPageClassObj.getSignInContent())))
		switch (string) {
		case "Sign in":
			System.out.println("Content is: Sign in");
			return "Content is: Sign in";
		case "Sign in with Google":
			System.out.println("The content is: Sign in with Google");
			return "The content is: Sign in with Google";
		case "Sign me in":
			System.out.println("The content is: Sign me in");
			return "The content is: Sign me in";
		}
		return str;

	}
	
	public void abstractValues(String string) throws Exception
	{
		Thread.sleep(2000);
		commonFunction.byElement = StepDefPageClassObj.getSignInContent();
		String string1 = getWebELement(commonFunction.byElement);
		
		Thread.sleep(2000);
		commonFunction.byElement = StepDefPageClassObj.getSignInWithGoogle();
		String string2 = getWebELement(commonFunction.byElement);
		
		Thread.sleep(2000);
		commonFunction.byElement = StepDefPageClassObj.getSignMeInButton();
		String string3 = getWebELement(commonFunction.byElement);
		
		Thread.sleep(2000);
		
		if(string.equals(string1))
		{
			System.out.println("The content is: "+string);
		}
		else if(string.equals(string2))
		{
			System.out.println("The content is: "+string);
		}
		else if(string.equals(string3))
		{
			System.out.println("The content is: "+string);
		}
	}
	
	public void abstractValues2() throws Exception
	{
		Thread.sleep(2000);
		commonFunction.byElement = StepDefPageClassObj.getSignInContent();
		String string1 = getWebELement(commonFunction.byElement);
		
		Thread.sleep(2000);
		commonFunction.byElement = StepDefPageClassObj.getSignInWithGoogle();
		String string2 = getWebELement(commonFunction.byElement);
		
		Thread.sleep(2000);
		commonFunction.byElement = StepDefPageClassObj.getSignMeInButton();
		String string3 = getWebELement(commonFunction.byElement);
		
		Thread.sleep(2000);		
	
		List<String> al = new ArrayList<String>();
		al.add(string1);
		al.add(string2);
		al.add(string3);
		
		for(String s: al){
		//if(str.equals(getWebELement(StepDefPageClassObj.getSignInContent())))
		switch (s) {
		case "Sign in":
			System.out.println("Content is: Sign in");
			
		case "Sign in with Google":
			System.out.println("The content is: Sign in with Google");
			
		case "Sign me in":
			System.out.println("The content is: Sign me in");
			
		}
		}
	
		
	}
	
}

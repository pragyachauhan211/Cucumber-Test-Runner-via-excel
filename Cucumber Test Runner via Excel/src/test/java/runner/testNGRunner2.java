package runner;

import java.io.File;
import java.util.Arrays;

import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.cli.Main;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.RunnerExcelFile;

@SuppressWarnings("deprecation")

@CucumberOptions(
		plugin = { "pretty" }, monochrome = true)

public class testNGRunner2 extends AbstractTestNGCucumberTests {
	static RunnerExcelFile RE = new RunnerExcelFile();
	static String tags;
	static String features;
	static File featureFilePath;
	static String tagsToExecute;
	static String featuresToExecute;
	static String getTagsList;
	static String execStatus;
	static String ToolName;
	static String BrowserName;
	static String AppType;
	static String[] params = null;
	static String featuresToExecuteString ;
		
	public static String tagsToRun() throws Exception {

		tags = RE.getTags();
		System.out.println(tags);
		return tags.substring(0, tags.length() - 4);
	
	}
	
	public static String featuresToRun() throws Exception {

		features = RE.getFeatureFromExcel();
		return features;
	
	}
	
	public static void toolName()
	{
		switch(ToolName) {
		case "Selenium": System.out.println("Selenium");
		break;
		case "Appium": System.out.println("Appium");
		break;
		case "Services": System.out.println("Services");
		break;
		}
		
		switch(execStatus) {
		case "Yes": System.out.println("Yes");
		break;
		case "No": System.out.println("No");
		break;
		}
		
		switch(BrowserName) {
		case "Chrome": System.out.println("Chrome");
		break;
		case "Firefox": System.out.println("Firefox");
		break;
		case "IE": System.out.println("IE");
		break;
		case "Edge": System.out.println("Edge");
		break;
		}
		
		switch(AppType) {
		case "Web": System.out.println("Web");
		break;
		case "Native": System.out.println("Native");
		break;
		case "Hybrid": System.out.println("Hybrid");
		break;
		}
	}
	
	static {

		try {
			RunnerExcelFile.execution_Parameter= RunnerExcelFile.getExecutionParameters();
			execStatus =  RunnerExcelFile.execution_Parameter.get("Execution");
			System.out.println(execStatus);
			ToolName =  RunnerExcelFile.execution_Parameter.get("ToolName");
			System.out.println(ToolName);
			BrowserName =  RunnerExcelFile.execution_Parameter.get("Browser");
			System.out.println(BrowserName);
			AppType =  RunnerExcelFile.execution_Parameter.get("AppType");
			System.out.println(AppType);
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
        
		toolName();
		
		try {
			tagsToExecute = tagsToRun();
			featuresToExecute = featuresToRun();
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		
		String featureList[] = featuresToExecute.split("or");
		int fea = featureList.length;
		
		params = new String[] {"-t", tagsToExecute.toString()  };
		int para = params.length;
		
		String[] paramsNew = new String[fea + para];
		
		System.arraycopy(featureList, 0, paramsNew, 0, fea);  
		System.arraycopy(params, 0, paramsNew, fea, para); 
		
		Arrays.toString(paramsNew);
		
		Main.main(paramsNew);		
		
	}

	public void main(String[] args) throws Exception 
	{
		
	}

}

package runner;

import java.io.File;
import java.util.Arrays;
import cucumber.api.cli.Main;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.RunnerExcelFile;

@SuppressWarnings("deprecation")

@CucumberOptions(
		plugin = { "pretty" }, monochrome = true)

public class testNGRunner extends AbstractTestNGCucumberTests {
	static RunnerExcelFile RE = new RunnerExcelFile();
	static String tags;
	static String features;
	static File featureFilePath;
	static String tagsToExecute;
	static String featuresToExecute;
	static String getTagsList;
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

	static {

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

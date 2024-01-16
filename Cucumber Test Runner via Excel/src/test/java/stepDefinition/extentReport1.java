package stepDefinition;


import java.io.File;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pageClass.sample1;

public class extentReport1 {
	//public static int reportAlreadyInit=1;
	public static int ID=1;
	public static ExtentReports extentReporter;
	public static File file = new File("D:\\New folder\\New folder\\ExtentReport.html");
	
	
	public static int generateReport() throws Exception
	{
		 
		  if(ID==1)
		  {
		  extentReport1.initReport();
		  }
		
		return ID;
		
	}
	
	
	
	public static void initReport() throws Exception
	{
		extentReporter = new ExtentReports(); 
		ExtentSparkReporter spark = new ExtentSparkReporter(file);
		//spark.loadJSONConfig(new File("C:\\Users\\arvin\\eclipse-workspace\\ExtentReport2\\src\\test\\resources\\extentInJSON.json")); 
		extentReporter.attachReporter(spark);
		//extentReporter.flush();
		//Desktop.getDesktop().browse(file.toURI()); 
	}
	
	public static void main(String[] args) throws Throwable
	{
		
		
		
	}
}

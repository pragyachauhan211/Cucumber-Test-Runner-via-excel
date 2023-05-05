package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RunnerExcelFile {
	
	static String features;
	static String featuresToExecute;

	public RunnerExcelFile() {
		// TODO Auto-generated constructor stub
	}
	
	public String getTags() throws Exception
	{
		String listOfTags = new String();
		try
		{
		FileInputStream fis = new FileInputStream("C:\\Users\\arvin\\eclipse-workspace\\DataPassCucumber\\TestRunnerBDD.xlsx");
		//HSSFWorkbook wb = new HSSFWorkbook(fis);
		 XSSFWorkbook wb = new XSSFWorkbook(fis);
		//HSSFSheet sheet = wb.getSheet("Tags");
		 XSSFSheet sheet = wb.getSheet("Tags");
		for(int count =1; count <= sheet.getLastRowNum(); count++)
		{
			//HSSFRow row = sheet.getRow(count);
			XSSFRow row = sheet.getRow(count);
			
			if(row.getCell(1).toString().equalsIgnoreCase("yes"))
			{
				String temp = row.getCell(0).toString();
				listOfTags=listOfTags+temp+" or ";
				//System.out.println(temp);
			}
		}
		
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		return listOfTags;
	}
    
	public String getFeatureFromExcel() throws Exception
	{
		String listOfFeature = new String();
		try
		{
		FileInputStream fis = new FileInputStream("C:\\Users\\arvin\\eclipse-workspace\\DataPassCucumber\\TestRunnerBDD.xlsx");
		//HSSFWorkbook wb = new HSSFWorkbook(fis);
		 XSSFWorkbook wb = new XSSFWorkbook(fis);
		//HSSFSheet sheet = wb.getSheet("Tags");
		 XSSFSheet sheet = wb.getSheet("Features");
		for(int count =1; count <= sheet.getLastRowNum(); count++)
		{
			//HSSFRow row = sheet.getRow(count);
			String filePath = "src/test/java/feature";
			XSSFRow row = sheet.getRow(count);
			
			if(row.getCell(1).toString().equalsIgnoreCase("yes"))
			{
				String temp = row.getCell(0).toString();
				temp = filePath+"/"+temp;
				//System.out.println(temp);
				listOfFeature=listOfFeature+temp+" or ";
				//System.out.println(listOfFeature);
				//listOfFeature=filePath+"/"+listOfFeature+temp+" or ";				
				System.out.println(temp);
			}

		}
		
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		//String filePath = "src/test/java/feature";
		listOfFeature = listOfFeature.substring(0, listOfFeature.length() - 4);
		return listOfFeature.toString();
		//return listOfFeature;
		//return listOfFeature = filePath+"/"+listOfFeature.toString();
	}
	
	public void getFeature() throws Exception
	{
		features = getFeatureFromExcel();
		featuresToExecute = features.substring(0, features.length() - 4);
		featuresToExecute.toString();
		String filePath = "src/test/java/feature";
		
	}
	
}

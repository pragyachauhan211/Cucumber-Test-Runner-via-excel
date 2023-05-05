package runner;

import java.util.Arrays;

public class sample {

	public sample() {
		// TODO Auto-generated constructor stub
	}	
	
	public void pqr()
	{
		String[] arr1 = {"a", "b"};
		String[] arr2 = {"c", "d"};

		String[] arr3 = arr1.clone();
	}
	
	public void abc()	
	{
		String path = "src/test/java/feature/basicLaunch.feature or src/test/java/feature/login.feature";
		String s13 ="";
		String s[] = path.split("or");
		//System.out.println(Arrays.toString(s));
		String month1="";
		
		for (String month : s) {
			//month1 = month+",";
			//System.out.println("Hello "+month1);
			//month1.substring(0, month1.length() - 1);
			//System.out.print(",");
			//System.out.println(month);
			month1 = month+",";
			System.out.println(month1);
			
		}
		
		/*
		 * String[] str = null; for(int i=0; i<s.length;i++) { System.out.println(s[i]);
		 * }
		 * 
		 * System.out.println(str);
		 */
	}
	
	
	public static void main(String[] args) {
		sample sam = new sample();
		sam.abc();

	}

}

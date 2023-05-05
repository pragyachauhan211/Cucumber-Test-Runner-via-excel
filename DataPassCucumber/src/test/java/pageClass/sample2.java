package pageClass;

public class sample2 {
	
	
	public sample2() {
		// TODO Auto-generated constructor stub
	}
	
	public void switchMethod()
	{
		
	switch (sample1.switchMethod1()) {
	  case 1:
	    System.out.println("Monday");
	    break;
	  case 2:
	    System.out.println("Tuesday");
	    break;
	  
	}
	}
	
	public static void main(String[] args)
	{
		sample2 obj = new sample2();
		obj.switchMethod();
	}
}


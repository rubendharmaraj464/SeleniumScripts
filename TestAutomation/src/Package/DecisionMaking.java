package Package;

public class DecisionMaking {
	
	public String Fullname = "JHON DAVID" ;
	public int age = 30;
	
	private String designation = "CEO";
	
	private static void login()
	{
		System.out.println("login method is called");
	}

	public static void main(String[] args)
	{
		
		// if statement 
		
		login();
		
		
		  int a = 120  ;
		  
		  if(a > 100) { System.out.println("IF statement executed The Value of a is " +
		  a + "   DECISION MAKING");
		  
		  } else { System.out.println("else statement executed"); }
		  
		  
		  
		  int Studentmarks = 120;
		  
		  //< 40 fail //> 40--pass // >70 --first class
		  
		  if(Studentmarks < 40)
		  {
		  System.out.println("Student is fail and his marks are " +Studentmarks);
		  }
		  else if
		  ( (Studentmarks > 40) && (Studentmarks < 60) ) {
		  System.out.println("Student is pass in third and his marks are "
		  +Studentmarks); } else if( (Studentmarks > 60) && (Studentmarks < 70) ) {
		  System.out.println("Student is pass in second and his marks are "
		  +Studentmarks); } else if(Studentmarks > 70 && (Studentmarks < 100)) {
		  System.out.println("Student is pass in first class and his marks are "
		  +Studentmarks); } else { System.out.println("else statement executed"); }
		 
		
		
		
		/*
		 * int iday = 6; String sday = "monday";
		 * 
		 * switch(iday) { case 1 : System.out.println("TODAY IS MONDAY"); break; case 2
		 * : System.out.println("TODAY IS tuesday"); break;
		 * 
		 * case 3 : System.out.println("TODAY IS wednesday"); break; case 4 :
		 * System.out.println("TODAY IS thursday"); break; case 5 :
		 * System.out.println("TODAY IS friday"); break;
		 * 
		 * case 6 : System.out.println("TODAY IS saturday"); break; case 7 :
		 * System.out.println("TODAY IS sunday"); break;
		 * 
		 * 
		 * 
		 * }
		 */
		
		
		
		
		String sday = "sunday";
		//int day = 100;
		
		switch(sday)
		{
		  case "monday" :
			System.out.println("TODAY IS MONDAY");
			break;
		  case "tuesday" :
				System.out.println("TODAY IS tuesday");
				break;
				
		  case "wednesday" :
				System.out.println("TODAY IS wednesday");
				break;
		  case "thursday" :
				System.out.println("TODAY IS thursday");
				break;
		  case "friday" :
				System.out.println("TODAY IS friday");
				break;
				
		  case "saturday" :
				System.out.println("TODAY IS saturday");
				break;
		  case "sunday" :
				System.out.println("TODAY IS sunday");
				break;
	

			
		}
		
		
		
	}
	


}

package Package;

import module.modifiers;

public class ParentClass extends modifiers {
	
	public static String StudentName = "Jhon" ;
	int  EnglishMarks = 90;
	int  socialMarks = 70;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////same package
		ProtectedClass obj = new ProtectedClass();
		String cityname = obj.city;
		
		
		//different packaGE
		modifiers OBJ02 = new modifiers(); 
		String ctry = OBJ02.country;  //public accessmodifier
		//String lang = OBJ02.Language;  //Private accessmodifier
		//String cityname02 = OBJ02.city;  //protected  without inheritance
		
		String cityname02 =ParentClass.city;  //protected with inheritance
		
		
		
		

	}
	
	public static void Calculation(int a , int b )
	{
		//ADDITION
		int c = a + b;
		System.out.println(c);
		
	}
	
	public static void printclassname(String classname)
	{
		System.out.println("This is Parent Class");
	}
	
	public static void studentData()
	{
		
	}
	
	public static void MarksList()
	{
		
	}

}

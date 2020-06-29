package Package;

public class StaticKeywords {
	
	static int count = 4000;
	String var;

	public static void main(String[] args) 
	{
		TestMethod();
		
		StaticKeywords OBJ1 = new StaticKeywords();
		OBJ1.NonStaticMethod();
		
		StaticKeywords OBJ2 = new StaticKeywords();
		OBJ1.count = 5000;   // STATIC
		OBJ1.var = "JHON";   //NON STATIC
		
		OBJ2.count = 6000;   // STATIC
		OBJ2.var = "DAVID";   //NON STATIC
		
		System.out.println(OBJ1.count);
		System.out.println(OBJ1.var);
		System.out.println(OBJ2.count);
		System.out.println(OBJ2.var);
		
		

	}
	
	public static void TestMethod()
	{
		System.out.println("This is Static method");
	}
	
	public void NonStaticMethod()
	{
		System.out.println("This is Non Static method");
	}
	
	

}

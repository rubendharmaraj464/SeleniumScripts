package Package;

public class ChildClass extends ParentClass {
	


	public static void main(String[] args) 
	{
	
		ChildClass.studentData();
		
		ChildClass.MarksList();
		
		String Name = ChildClass.StudentName;
		
		
		
		
         
	}
	
	public static void printclassname(String classname)
	{
		System.out.println("This is child Class");
	}
	
	
	public static void studentData()
	{
		System.out.println("Child  Class");
	}
	
	
	public static void Calculation(int a , int b )
	{
		//sUBSTRACTION
		int c = a - b;
		System.out.println(c);
		
	}
	

}

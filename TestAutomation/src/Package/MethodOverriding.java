package Package;

public class MethodOverriding {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ParentClass obj1 = new ParentClass();
		obj1.printclassname("ParentClass");
		
		
		ChildClass obj2 = new ChildClass();
		obj2.printclassname("This is child Class");
		
		obj1.Calculation(20, 10);
		obj2.Calculation(20, 10);
		
		

	}

}

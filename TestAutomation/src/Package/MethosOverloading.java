package Package;

public class MethosOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethosOverloading obj = new MethosOverloading();
		obj.addition(30 , 40);
		obj.addition(10.4 , 7.6);
		obj.addition("JHON", "DAVID");

	}
	
	public void addition(int a , int b)
	{
		int add = a + b;
		System.out.println(add);
	}
	
	
	
	public void addition(double a , double b)
	{
		double add = a + b;
		System.out.println(add);
	}
	
	public void addition(String a , String b)
	{
		String add = a + b;
		System.out.println(add);
	}

}

package Package;

import java.util.ArrayList;
import java.util.HashMap;

public class DataStructure {

	public static void main(String[] args) 
	{
		
		
		
		
		//Array 
		
		//int[] imarks = {67,76,87,90,100};
		
		
		
		/*
		 * // TODO Auto-generated method stub ArrayList<String> arrayobj = new
		 * ArrayList<String>(); arrayobj.add("Jhon"); //0 arrayobj.add(0 , "Jhon");
		 * arrayobj.add("david"); //1 arrayobj.add("Raj"); //2 arrayobj.add("Joe"); //3
		 * arrayobj.add("Kim"); //4 arrayobj.add("Kumar"); arrayobj.add("Jhon");//5
		 * 
		 * 
		 * 
		 * 
		 * String Name = arrayobj.get(3);
		 * 
		 * // System.out.print(Name);
		 * 
		 * 
		 * 
		 * ArrayList<Integer> arrayintobj = new ArrayList<Integer>();
		 * arrayintobj.add(1000); // 0 arrayintobj.add(2000); //1 arrayintobj.add(3000);
		 * arrayintobj.add(4000); arrayintobj.add(5000); arrayintobj.add(6000);
		 * arrayintobj.add(7000);
		 * 
		 * int j = arrayintobj.get(3);
		 * 
		 * System.out.print(j);
		 */
	//RollNO  Names
	//201  Jhon
    //202  david
	//	203  Rahul
	//	204  Tom
		
		
		int i = 100;
		
		
		arrays obj = new arrays();
		obj.PrintMsg();
		
		
		
		HashMap<Integer , String> Map = new HashMap();
		Map.put(201, "Jhon");
		Map.put(202, "david");
		Map.put(203, "Rahul");
		Map.put(204, "Tom");
		Map.put(205, "Sam");
		System.out.println(Map);
		
		System.out.println(Map.keySet());
		System.out.println(Map.values());
		
		System.out.println(Map.get(205));
		
		Map.remove(203);
		
		
		System.out.println(Map);
			
		
		boolean Result = Map.remove(202, "david");
		
		System.out.println(Result);
		
		System.out.println(Map);
		
		Map.replace(204, "Jerry");
		
		System.out.println(Map);
		boolean status = Map.replace(204, "Jerry", "Syed");
		
		System.out.println(status);
		
		System.out.println(Map);
		
	
		  
		 
		
		

	}

}

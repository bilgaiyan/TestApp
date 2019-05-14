package Test;

public class Student {
	int RollNo;
	String Name;
	static String CollName = "MSIC";
	Student (int r, String n)
	{
	RollNo= r;
	Name = n;
	}
	
	void display()
	{
		System.out.println("Student Details:" +RollNo+" "+Name+ ""+CollName);
	}
	public static void stkClass()
	{
		System.out.println("My name is Vishal Bilgaiyan");
	
	}
	

}

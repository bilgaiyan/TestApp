package Test;

public class ConstructorParameterized {
	int id;
	String name1, name2;
	//Default Constructor
	ConstructorParameterized()
	{
		
	}
	//Parameterized Constructor
	ConstructorParameterized(int no, String fn)
	{
		id=no;
		name1=fn;
		
	}
	//Parameterized Constructor
	ConstructorParameterized(String fName, String LName)
	{
		name1= fName;
		name2=LName;
	}
	void display()
	{
		System.out.println(id+" "+name1+" "+name2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorParameterized c1 = new ConstructorParameterized(1212, "FirstCons");
		c1.display();
		ConstructorParameterized c2 = new ConstructorParameterized("btbs", "FirstCons");
		c2.display();
		ConstructorParameterized c3 = new ConstructorParameterized();
		c3.display();

	}

}


// Default constructor gets called automatically when new onject gets created.
//Default value of the type variable is based on the type of the variable. like for int=0; String=null
//Static method can be called directly in the main whithout creating its object.



public class ConstructorDefault {
	int id;
	String name;
	void display()
	{
		System.out.println(id+ "" +name);
	}
	//Defining Static method in the class
	public static void name(int ID)
	{
		int eid=ID;
		System.out.println("First Static Method"+eid);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Default Constructor
		ConstructorDefault c1 = new ConstructorDefault();
		c1.display();
		//Calling Static method directly
		ConstructorDefault.name(10);
	}

}

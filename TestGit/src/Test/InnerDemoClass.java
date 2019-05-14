//Class inside the class
package Test;

class outer
{
	int a;
	public void outerM()
	{
		System.out.println("MyOuterClass");
	}
	//Inner Class
	class inner
	{
		String st1;
		public void innerM(String st1)
		{
			System.out.println("inner class: "+st1);
		}
	}
}

public class InnerDemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer out = new outer();
		out.outerM();
		
		outer.inner inn = out.new inner();
		inn.innerM("Rohit");
		

	}

}

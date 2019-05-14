package Test;

public class ThisKeyword {
	ThisKeyword()
	{
		//this("ThisKeyword");
		this(12);
		System.out.println("the Constructor without the parameter");
		
	}
	
	ThisKeyword(String str)
	{
		System.out.println("With String Paramater"+str);
	}

	ThisKeyword(int intVar)
	{
		this("Hello");
		System.out.println("With Integer parameter"+intVar);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword tk = new ThisKeyword();
				

	}

}

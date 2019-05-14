package Test;

public class UseTHISkeyword {
	int empNo=563258;
	String empName="Sreeni";
void EmpData(int empNo, String empName)
{
	empNo=78968;
	empName="Naresh";
	System.out.println(empNo+" "+empName);
	System.out.println(this.empNo+" "+this.empName);
} 
void EmpData(int empNo)

{
	empNo=45806;
	System.out.println(empNo+ " "+empName);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseTHISkeyword UTK =new UseTHISkeyword();
		UTK.EmpData(9999,"vishal");
		
	}

}

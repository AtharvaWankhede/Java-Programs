class Calc
{
	int num1;
	int num2;			//VARIABLES
	int result;
	
	public void perform(){
		result=num1+num2;			//METHODS
		
	}
}
public class ClassNobject {
	public static void main(String [] args)
	{
		Calc obj =new Calc();		//OBJECT
		obj.num1=3;
		obj.num2=5;
		obj.perform();
		System.out.println(obj.result);
		
	}
}

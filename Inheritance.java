//SINGLE INHERITANCE
class ABCD{
	public int add(int a,int b) {
		return a+b;
	}
}
class ABCD_Adv extends ABCD
{
	public int sub(int a,int b) {
		return a-b;
	}
}
class ABCD_ultra extends ABCD_Adv{
	public int mul(int a,int b) {
		return a*b;
	}
}
class ABCD_pro extends ABCD_ultra{
	public int div(int a,int b) {
		return a/b;
	}
}
public abstract class Inheritance {
	public static void main(String[]args) {
	
	ABCD_pro obj1=new ABCD_pro();
	int result1=obj1.add(5,9);
	int result2=obj1.sub(10,5);
	int result3=obj1.mul(result1, result2);
	int result4=obj1.div(result3, result2);
	System.out.print(result1+": Addn\nSubn :");
	System.out.print(result2+"\nmul: "); 
	System.out.print(result3+"\ndiv: ");
	System.out.print(result4);
	
	
}
}

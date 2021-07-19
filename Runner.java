public class Runner{
	public static void main(String [] args) {
		Stack nums=new Stack();
		nums.push(12);
		nums.push(22);
		nums.push(21);
		nums.show();
		System.out.print("\n"+nums.peek()+"");
		System.out.print("\n"+nums.pop()+"\n");
		nums.show();
	}
}
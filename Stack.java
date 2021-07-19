public class Stack{
	int stack[]=new int[5];
	int top=0;
	
	public void push(int data) 
	{
		if (top==5) {
			System.out.print("Stack is full you can't insert "+(top+1)+"th element\n");
		}
		else {
			stack[top]=data;
			top++;
		}
		
	}
	
	public int pop()
	{
		int data=0;
		if(isempty()) 
		{
			System.out.print("Stack is empty and you can't pop elements\n");
			}
		else {
		top--;
		data=stack[top];
		stack[top]=0;
		
		
		
	}
		return data;
	}
	
	public int size()
	{
		return top;
	}
	
	public boolean isempty()
	
	{
		return top<=0;
		
	}
	
	public int peek()
	
	{
		int data;
		data=stack[top-1];
		return data;
	}
	
	public void show()
	
	{
		for(int i=0;i<stack.length;i++)
		{
			System.out.print(stack[i]+" ");
		}
		
	}
}
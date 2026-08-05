
public class StackTest {

	public static void main(String[] args) {

		StackArrayBased stack = new StackArrayBased();
		
		stack.push(10); // 10 -> stacks[0]
		stack.push(11); // 11 -> stacks[1]
		stack.push(12); // 12 -> stacks[2]
		
		System.out.println(stack.peek());  //output --> 12
		System.out.println(stack.pop());
		System.out.println(stack.peek()); 
		
	}
	
	

}

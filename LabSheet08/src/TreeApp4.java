import java.util.Scanner;

public class TreeApp4 {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.createTree6();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = scanner.nextInt();
		
		Node foundNode = tree.find(N);
		
		if (foundNode == null) {
			System.out.println("Cannot found Node(data=[N])");
			return;
		}
		
		if (foundNode.left != null) {
			System.out.println("Left Child: " + foundNode.left.data);
		} else {
			System.out.println("No Left Child");
		}
		
		if (foundNode.right != null) {
			System.out.println("Right Child: " + foundNode.right.data);
		} else {
			System.out.println("No Right Child");
		}
		
		if (foundNode.left == null && foundNode.right == null) {
			System.out.println(N + " is Leaf Node");
		} else {
			System.out.println(N + " is not Leaf Node");
		}
		
	}

}

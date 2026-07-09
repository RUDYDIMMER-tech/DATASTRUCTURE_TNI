
public class NumberArrayController {

	private int[] nums;
	
	public void setNums(int[] nums) {
		nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	public void display(String message) {
		System.out.println(message);
		boolean first_element = true;
		for (int num : nums) {
			System.out.print((!first_element   ? ", " : "")+num); // condition ? true_resule : false_result
			first_element = false;
		}
		
		
		
	}
	
}


public class TestApp {

	public static void main(String[] args) {
		
		int[] nums = {11, 9, 23, 87, 38, 22, 92, 10};
		
		Sorting sort1 = new Sorting(nums.clone());
        sort1.bubbleSort();
        System.out.println("");
        sort1.printSortedData();

        System.out.println("");
        Sorting sort2 = new Sorting(nums.clone());
        sort2.selectionSort();
        sort2.printSortedData();


        Sorting sort3 = new Sorting(nums.clone());
        sort3.insertionSort();
        System.out.println("");
        sort3.printSortedData();
        


        Sorting sort4 = new Sorting(nums.clone());
        sort4.quickSort();
        System.out.println("");
        sort4.printSortedData();
        
    }
}
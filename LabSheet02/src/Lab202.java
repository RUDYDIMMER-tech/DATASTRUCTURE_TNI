import java.util.ArrayList;

public class Lab202 {

	public static void main(String[] args) {

ArrayList<Integer> numbers = new ArrayList<>();
        
        int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        
        for (int num : initial_numbers) {
            numbers.add(num);
        }
        
        numbers.add(99); 
        
        int lastDigitOfStudentID = 5; 
        numbers.add(lastDigitOfStudentID, 88);

        numbers.remove(lastDigitOfStudentID);
        
        int secondToLastDigit = 0;  
        int currentDay = 11;        
        numbers.set(secondToLastDigit, currentDay);
        
        System.out.println("All numbers in ArrayList = " + numbers);
	}

}

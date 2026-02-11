package salmaweek2day3;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers={2, 5, 7, 7, 5, 9, 2, 3};
		 Arrays.sort(numbers);
		 System.out.println(numbers[1]);
		 
       //iterate values using for to find duplicates
		
		 for (int i =0; i < numbers.length-1; i++) {
			 
			 if (numbers[i]==numbers[i+1]) {
				 
				 System.out.println(numbers[i] + " is a duplicate");
				
			} ;
			 
			
		}
		 
		
	}

}

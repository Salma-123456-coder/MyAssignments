package salmaweek2day3;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
      int[]numbers= {1,4,3,2,8,6,7};
      Arrays.sort(numbers);
      for (int i = 0; i < numbers.length-1; i++) {
    	  if (numbers[i+1]!=numbers[i]+1) {
			
    		  System.out.println("Missing number is:"+(numbers[i]+1));
    		  
		}
		
	}
      }

}

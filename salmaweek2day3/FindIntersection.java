package salmaweek2day3;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaring arrays
		int[] array1= {3,2,11,4,6,7};
		int[] array2= {1,2,8,4,9,7};
	
		//Nested for loop for array1 and array2
		for (int i = 0; i < array1.length; i++) {
			
			for (int j = 0; j < array2.length; j++) {
				
				//compare elements in the array
				
				if (array1[i]==array2[j])
				{
					System.out.println("Matching number is:"+ (array1[i]));
				}
			}
			
		};

	}

}

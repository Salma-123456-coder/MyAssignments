package salmaweek2.day1;

public class FibonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To print the fibonacci series for a given range
		
		int range=8;
		
		//Initialising variables
		
		int a=0,b=1;
		
		for (int i = 0; i < range; i++) {
			
			System.out.println(a + " fibonacci number");
			int c=a+b;
			a=b;
			b=c;
			
			
			
		}

	}

}

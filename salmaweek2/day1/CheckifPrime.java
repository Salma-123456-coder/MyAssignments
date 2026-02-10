package salmaweek2.day1;

public class CheckifPrime {

	public static void main(String[] args) {

        int n = 23;       // Number to check
        int count = 0;    // Counts how many times n is divisible

        for (int i = 1; i <= n; i++) {
        	
          // Check if n is divisible by i
            if (n % i == 0) {
                count++; // Increase count when a divisor is found
            }
        }

     // A prime number has exactly 2 divisors: 1 and itself
        if (count == 2) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }
    }
}



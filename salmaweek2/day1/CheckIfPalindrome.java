package salmaweek2.day1;

public class CheckIfPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To check if given number is palindrome or not
	

		        int input = 626;      // Given number
		        int output = 0;       // Reversed number
		        int remainder;              // To store remainder

		        // Reverse the number using for loop
		        for (int i = input; i > 0; i = i / 10) {
		            remainder = i % 10;                 // remainder using % operator
		            output = (output * 10) + remainder;
		            
		        }

		        // Compare input and output using if statement
		        if (input == output) {
		            System.out.println("It is a Palindrome");
		        } else {
		            System.out.println("It is not a Palindrome");
		        }
		    }
		}

	

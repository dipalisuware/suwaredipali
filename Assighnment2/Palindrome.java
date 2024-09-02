package second;

public class Palindrome {
	
	    public static void main(String[] args) {
	        int number = 12325; 
	        int Number = number;
	        int reverse = 0;

	        while (number != 0)
	        {
	            int remainder = number % 10;
	            reverse = reverse * 10 + remainder;
	            number /= 10;
	        }

	        if (Number == reverse) 
	        {
	            System.out.println(Number + " is a palindrome number.");
	        } 
	        else
	        {
	            System.out.println(Number + " is not a palindrome number.");
	        }
	    }
	}


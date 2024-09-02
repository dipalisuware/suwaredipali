package second;
import java.util.Scanner;

public class Program {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter first number (a): ");
	        int a = scanner.nextInt();
	        
	        System.out.print("Enter second number (b): ");
	        int b = scanner.nextInt();
	        
	        int result = 1;
	        for (int i = 0; i < b; i++) {
	            result *= a;
	        }
	        
	        System.out.println(a + " * " + b + " = " + result);
	    }
	}



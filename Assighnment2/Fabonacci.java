package second;

public class Fabonacci {
	
	    public static void main(String[] args) {
	        int n = 10; 
	        int val1= 0;
	        int val2 = 1;
	        
	        System.out.println("Fibonacci series up to " + n + " terms:");
	        System.out.print(val1 + " " + val2 + " ");
	        
	        for (int i = 3; i <= n; i++) 
	        {
	            int nextval = val1 + val2;
	            System.out.print(nextval + " ");
	            val1 = val2;
	            val2 = nextval;
	        }
	    }
	}



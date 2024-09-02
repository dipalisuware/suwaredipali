package first;
import java.util.Scanner;
public class Rectangle {
	

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        {
	        System.out.print("Enter the length of the rectangle: ");

	        float length = (float) sc.nextFloat();

	        System.out.print("Enter the width of the rectangle: ");

	        float width = (float) sc.nextFloat();
	        {
	        float area = (float)length * width;
	        System.out.println("The area of the rectangle is: " + area);}
	        {
	        float perimeter = (float)2 * (length + width);
	        System.out.println("The perimeter of the rectangle is: " + perimeter);}
             }

	    }

}

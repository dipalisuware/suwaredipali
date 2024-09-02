package first;

public class Factor {
	public static void main(String[] args) {
		int a=6;
		int b=-18;
		int c=-3;
		
			float d=2*a;
			float q1=(float)((-b)+Math.sqrt ((b*b)-(4*a*c)));
			float q2=(float)((-b)-Math.sqrt ((b*b)-(4*a*c)));
			
			float f1=q1/d;
			float f2=q2/d;
			
			System.out.println("Factor1:"+f1);
			System.out.println("factor2:"+f2);
			
		}
	}
	



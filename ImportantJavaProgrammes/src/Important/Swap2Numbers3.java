package Important;

public class Swap2Numbers3 {
	
	public static void main(String[] args) {
		
		//Using temparory variable
		
		int a=10,b=20,c;
		
		System.out.println("Before Swap.....");
		System.out.println(a);
		System.out.println(b);
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("After swap.....");
		System.out.println(a);
		System.out.println(b);
	}

}

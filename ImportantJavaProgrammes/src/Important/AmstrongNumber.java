package Important;

public class AmstrongNumber {
	
	public static void main(String[] args) {
		
		int c=0,rem,temp;
		
		int n=153;
		temp=n;
		
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			c=c+(rem*rem*rem);
		}
		
		if(temp==c)
			System.out.println("Amstrong");
		else
			System.out.println("Not a Amstrong");
	}

}

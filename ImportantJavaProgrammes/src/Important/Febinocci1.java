package Important;

public class Febinocci1 {
	
	public static void main(String[] args) {
		
		int a=0,b=1,c,count=10;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=2;i<count;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}

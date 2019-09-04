package Important;

public class Prime2 {
	
	public static void main(String[] args) {
		
		int num=29;
		boolean flag=false;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		
		if(!flag)
			System.out.println("its a prime number...");
		else
			System.out.println("It's not a prime number...");
	}

}

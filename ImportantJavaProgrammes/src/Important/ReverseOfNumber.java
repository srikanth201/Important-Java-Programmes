package Important;

public class ReverseOfNumber {
	
	public static void main(String[] args) {
		
		int num=123,reverse=0,rem,Original;
		Original=num;
		
		while(num!=0)
		{
			rem=num%10;
			reverse=reverse*10+rem;
			num/=10;
		}
		
		System.out.println(reverse);
	}

}

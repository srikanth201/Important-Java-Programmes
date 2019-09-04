package Important;

import java.util.Scanner;

public class SumOfDigitsOfNumber {
	
	public static void main(String[] args) {
		
		int a,b, sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr any number...");
		a=s.nextInt();
		
		while(a>0)
		{
			b=a%10;
			sum=sum+b;
			a/=10;
		}
		System.out.println(sum);
	}

}

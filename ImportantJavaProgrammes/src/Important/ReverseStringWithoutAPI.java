package Important;

import java.util.Scanner;

public class ReverseStringWithoutAPI {
	
	public static void main(String[] args) {
		
		String Original,reverse="";
		
		Scanner s=new Scanner(System.in);
		Original=s.nextLine();
		int length = Original.length();
		
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+Original.charAt(i);
			
		}
		System.out.println(reverse);
	}

}

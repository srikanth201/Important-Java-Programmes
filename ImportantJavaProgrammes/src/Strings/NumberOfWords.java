package Strings;

public class NumberOfWords {
	
	public static void main(String[] args) {
		
		String s="Hie Srikanth h";
		int count =1;
		
		for(int i=0;i<s.length()-1;i++)
		{
			if((s.charAt(i)==' '&&s.charAt(i+1)!=' '))
				{
					count++;	
				}
		
		}
		System.out.println(count);
	}

}

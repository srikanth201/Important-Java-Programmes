package Strings;

public class DuplicateCharacters {
	
	public static void main(String[] args) {
		
		String str="w3schools";
		int count =0;
		char[] inp=str.toCharArray();
		System.out.println("Duolicate characters are...");
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(inp[i]==inp[j])
				{
					System.out.println(inp[j]);
					count++;
					break;
				}
			}
		}
		
	}
	
	

}





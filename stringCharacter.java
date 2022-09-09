//program to count the special character and remove them in the string and print them
//Author : Nitish Raj Pritam

class stringCharacter
{
	public static void main(String []ar)
	{
		String str = "Hello*p* !@";
		int count = 0;
		String specialCharacter = "";
		String removedSpecialCharacter = "";
		  
		for(int i=0; i<str.length(); i++)
		{
			if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i)))
			{	
			    count++;
			    specialCharacter = specialCharacter + str.charAt(i);
			}
			else
			    removedSpecialCharacter = removedSpecialCharacter + str.charAt(i);	
		}
	    System.out.println("The string are : " + str);
		System.out.println("There are " + count + " Special characters, these are : " + specialCharacter);
	    System.out.println("String after removal of special character : " + removedSpecialCharacter);
	}
}
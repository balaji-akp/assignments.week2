package week2.day1;

public class Palindrome{
	
	public static void main(String[] args) {
		
		String palindrome = "madam";
						
		 char[] array = palindrome.toCharArray();
		 
		 String rev="";
		 
		 for (int i=array.length-1; i>=0; i--) {
			 
			rev=rev+(array[i]);
		 }
		 
		 if(palindrome.equals(rev)) {
			 
			 System.out.println("The given String is palindrome");
		 }else {
			 
			 System.out.println("The given String is  not palindrome");
		 }
	}
}

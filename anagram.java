
/*program to print two strings are anagram or not i.e. can form one string  by arranging the char of another string */

package sebone;
import java.util.*;
public class anagram {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in); // to take input
		System.out.println("enter string1 ");
		String str1= sc.nextLine();
		System.out.println("enter string2");
		String str2 = sc.nextLine();
		anagram r = new anagram();
		r.ana(str1, str2);
	}
		public void ana(String str1,String str2) {
			
	char a[]=str1.toLowerCase().toCharArray();  // toCharArray() will convert the string into char array
		char b[] = str2.toLowerCase().toCharArray();
		Arrays.sort(a);//to sort array
		Arrays.sort(b);
		boolean result =Arrays.equals(a,b); // check sorted array are equals
		if(result==true) {
			System.out.println("Strings are anagram");
			
		}
		else {
			System.out.println("strings are not anagram");
		}
	}
	
	

}


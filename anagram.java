package sebone;
import java.util.*;
public class anagram {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string1 ");
		String str1= sc.nextLine();
		System.out.println("enter string2");
		String str2 = sc.nextLine();
		String S1 = str1.lowercase();
		String S2 = str2.lowercase();
		char a[]=S1.toCharArray();
		char b[] = S2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		boolean result =Arrays.equals(a,b);
		if(result==true) {
			System.out.println("Strings are anagram");
			
		}
		else {
			System.out.println("strings are not anagram");
		}
	}
	
	

}

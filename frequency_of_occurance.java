package sebone;
import java.util.*;
/* to find the frequency of occurrence of a word in an article*/
public class frequency_of_occurance {
	public static void main(String[]args) {
		  
		Scanner sc= new Scanner(System.in); // to take input
		System.out.println("enter a string");
		String str = sc.nextLine();
		System.out.println("enter a word");
		String word= sc.next();
		frequency_of_occurance f = new frequency_of_occurance();
		f.freq(str, word);
	}
		public void freq(String str,String word) {
			int c =0; 
		
		String[] a= str.split(" ");// to split a string into an array of substrings
	
		for(int i=0;i<a.length;i++)
		     if(a[i].equals(word))//compare two given string
		    	 c++;
		System.out.println(c);
	}
     
}

package sebone;
import java.util.*;

public class frequency_of_occurance {
	public static void main(String[]args) {
		  int c=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();
		System.out.println("enter a word");
		String word= sc.next();
		String[] a= str.split(" ");
		for(int i=0;i<a.length;i++)
		     if(a[i].equals(word))
		    	 c++;
		System.out.println(c);
	}
     
}

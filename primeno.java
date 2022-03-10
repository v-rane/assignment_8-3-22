package sebone;
import java.util.*;
public class primeno {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a num");
		int maxnum = scan.nextInt();
		scan.close();
		System.out.println("list of prime no. are:");
		for (int num =2;num <=maxnum;num++) {
			boolean isprime =true;
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					isprime =false;
					break;
				}
			}
			if(isprime==true) {
				System.out.println(num);
			}
			
		}
		
		
	
	}

}

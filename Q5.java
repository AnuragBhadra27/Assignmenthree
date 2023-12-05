import java.util.*;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		int a;
		System.out.println("Enter a year");
		a=sc.nextInt();
		
		if (a%400==0) {
			System.out.println(a+" is a leap year : true");
		}

		else if (a%4==0 && a%100!=0) {
			System.out.println(a+" is a leap year : true");
		}

		else {
			System.out.println(a+" is not a leap year : false");
		}
		sc.close();
	}

}

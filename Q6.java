import java.util.*;
public class Q6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int unit;
		double amount=0;
		System.out.println("Enter a unit :");
		unit=sc.nextInt();
		 
		
		if (unit<=50) {
			amount=unit*3;
		}
		else if (unit<=200) {
			 amount=50*3+(unit-50)*4.80;
		}
		if (unit<=400) {
			 amount=50*3+150*4.80+(unit-200)*5.80;
		}	
		else {
			amount=50*3+150*4.80+200*5.80+(unit-400)*6.20;
		
		}
		System.out.println("Total Amount is " + amount);
			sc.close();
	}

}

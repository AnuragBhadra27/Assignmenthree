import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner sc=new Scanner(System.in);
		int unit;
		double amount=0;
		double discount=0.0;
		System.out.println("Enter a unit :");
		unit=sc.nextInt();
		 
		System.out.println("Do you want to pay online y/n:");
		char c=sc.next().charAt(0);
		
		
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
		System.out.println("Discount : " + discount);
		System.out.println("Amount Payable : "+(amount-discount));
			sc.close();
			
	}

}

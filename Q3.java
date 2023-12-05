import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;

		System.out.println("Enter First number:");
		a=sc.nextInt();

		System.out.println("Enter second number:");
		b=sc.nextInt();
		
		System.out.println("Enter Third number:");
		c=sc.nextInt();
		
		
		if(a<b && b<c ) {
			System.out.println("\"Increasing\"");
		}
		else if (a>b && b>c){
			System.out.println("\"Decreasing\"");
		}
		else {
			System.out.println("\" Neighter Increasing nor Decreasing\"");
		}
		sc.close();

	}

}

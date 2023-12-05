import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		
		int a;

		System.out.println(" Hey Alice enter amount of Water in ml:");
		a=sc.nextInt();

		if(a>=5000) {
			System.out.println("“Yes, Alice is following doctor’s advice”");
		}
		else {
			System.out.println("“No, Alice is not following doctor’s advice”");
		}
		sc.close();
	}

}

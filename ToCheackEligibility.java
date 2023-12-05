import java.util.*;
public class ToCheackEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a;

System.out.println("Enter your age:");
a=sc.nextInt();

if(a>=18) {
	System.out.println("“You are eligible to cast your vote”.");
}
else {
	System.out.println("“You are not eligible to cast your vote”.");
}
sc.close();
	}

}

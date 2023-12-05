import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int max=9;
int min=1;
int a;
System.out.println("Enter user number");
a=sc.nextInt();
int comp = (int)(Math.random()*(max-min+1)+min);
System.out.println("Compute guess:"+comp);
if (a==comp) {
System.out.println("\"You got it right\"");

}
else if (a-comp==1 || a-comp==-1) {
	System.out.println("\"You got it right\"");

	}
else {
	System.out.println("\"You got it wrong\"");
}
sc.close();
	}

}

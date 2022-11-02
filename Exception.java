import java.util.*;
public class Exception {
	public static void main(String args[]) {
		int c;
		try {
			System.out.println("enter x");
			System.out.println("enter y");
			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			int y=sc.nextInt();
			c=x/y;
		}catch(ArithmeticException e1) {
			System.out.println("exception interrupted"+e1);
		}catch(InputMismatchException e2) {
			System.out.println("exception found"+e2);
		}
	}
}

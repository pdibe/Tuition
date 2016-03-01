package Tuition;
import java.util.Scanner;
public class Cost {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Cost of tuition?");
		double t = input.nextInt();
		System.out.println("Fixed APR?");
		double apr = input.nextInt();
		System.out.println("How many years to pay back?");
		double years = input.nextInt();
		double loan = 0;
		int count = 0;
		while (count<4){
			loan+=t;
			t=t*(1+(apr/100));
			count = count+1;
		}
		double monthly = loan/(12*years);
		System.out.println(monthly);
	}

}

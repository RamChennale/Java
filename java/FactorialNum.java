package programs;

import java.util.Scanner;

public class FactorialNum {

	//prefferd
	public static int factorialNum(int num) {
		int factorial = 1;
		while (num > 0) {
			factorial = factorial * num;
			num--;
		}
		return factorial;
	}
	
	public static int fact(int num) {
		int i,factoril=1;
		for(i=1;i<=num;i++) {
			factoril=factoril*i;
		}
		return factoril;
	}

	public static void main(String[] args) {
		System.out.println("Enter num to find factorial ? ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("Factorial of " + n + " is : " + factorialNum(n));
		//System.out.println("factorial of "+n+" is : "+fact(n));
	}
}

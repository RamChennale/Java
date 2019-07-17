package programs;

/*A armstrong number is a number such that the sum of the cubes of its digits is equal to the number itself.
1(3) + 5(3) + 3(3) = 1 + 125 + 27 = 153.
Armstrong numbers 
0   =0
1   =1
153 =1+125+27
370 =27+343
371 =27+343+1
407 =64+0+343 */

import java.util.Scanner;

public class ArmstrongNumberExample {

	public static void main(String[] args) {

		System.out.println("Enter num to verify Armstrong");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		int reminder = 0, sum = 0,temp=0;
		temp=num;
		while(num>0) {
			reminder=num%10;
			sum=sum+(reminder*reminder*reminder);
			num=num/10;
		}
		if(temp==sum) {
			System.out.println(temp+" : Is a Armstrong number.");
		}else {
			System.out.println(temp+" : Is not a Armstrong number.");
		}
	}
}

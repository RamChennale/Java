package programs;
/*Write a program to find number is odd or even without % operator in java.



LOGIC in java>
We will convert our decimal number into binary, binary number consists of only 0 and 1's ,
if its last digit is 1, then number is EVEN in java.
if its last digit is 0, then number is ODD in java*/
public class NumberIsOddOrEvenExample {

	public static void main(String[] args) {
		int num=54;
		if((num&1)==0) {
			System.out.println(num+" Is a even num.");
		}else {
			System.out.println(num+ " Is odd num.");
		}
	}
}

/*It's a little trick: every binary number that has the least significative bit to 0 is even and odd otherwise. This because the powers of two are 1,2,4,8,16,... so what happens is that when you do bitwise AND with 1 you obtain 0 if the least significative bit was 0 and 1 otherwise. So you can easily recognize if a number if even by doing that.

Of course this works just because the arithmetic used in CPUs is binary, otherwise it would be just crap..

just an example

161 = 10100001 &
1   = 00000001
--------------
      00000001 -> odd
viceversa

84  = 01010100 &
1   = 00000001 
--------------
      00000000 -> even*/
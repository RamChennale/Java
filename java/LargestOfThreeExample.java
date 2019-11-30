package programs;

public class LargestOfThreeExample {
	

	public static void main(String[] args) {
		int a=1,b=1,c=1;
		if (a>b&&a>c) {
			System.out.println(a);
		}else if(b>a&&b>c){
			System.out.println(b);
		}else if(c>a&&c>b) {
			System.out.println(c);
		}else {
			System.out.println("All are equal "+a+","+b+","+c);
		}
	}

}

package stringsExamples;

public class SubString {

	public static void main(String[] args) {
		String var="Hello Ram";
		System.out.println("Given string is :"+var);
		System.out.println("Given string lenght is : "+var.length());
		//Substring is
		System.out.println();
		String a=var.substring(2); //substring(int start) including 2nd onwards
		String b=var.substring(2, 4);//substring(int start, int end) including 2nd onwards and excluding 4
		System.out.println("substring is : "+var.substring(2));
		System.out.println("substring in middle : "+b);

		
		//Reverse the given string
		System.out.println("Reverse string is : ");
		char[] strVar=var.toCharArray();
		System.out.println("String char array object address after conversion : "+strVar.toString());
		for(int i=strVar.length-1;i>=0;i--) {
			System.out.print(strVar[i]);
		}

	}
}

package stringsExamples;

public class FindSubString {

	public static void main(String[] args) {

		String inputString = "Ram chennale lotus";
		String searchSubstring = "chennale";
		int foundIndex = isSubString(inputString, searchSubstring);
		System.out.println(foundIndex > -1 ? inputString + "contains " + searchSubstring + " at index " + foundIndex
				: inputString + "dose not contains substring " + searchSubstring);
	}

	public static int isSubString(String inputString, String searchSubstring) {
		char[] inputStringArray=inputString.toCharArray();
		char searchSubstringArray[]=searchSubstring.toCharArray();
		int count=0;
		for(int i=0;i<inputStringArray.length;i++) {
			if (String.valueOf(inputStringArray[i]).equals(String.valueOf(searchSubstringArray[count]))) {
				count++;
				if (count==searchSubstringArray.length) {
					return i-count+1;
				}
			}else {
				if (count>0) {
					count=0;
					i++;
				}
			}
			
		}
		return -1;
}
}

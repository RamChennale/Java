package programs;

import java.util.ArrayList;
import java.util.List;

public class FindOnlyDuplicateNumberInListExample {

	/**
	 * returns only duplicate number in list.
	 */
	public static int findOnlyDuplicateNumberInList(List<Integer> list, int highestNumberInList) {
		int sumOfNumbersList = 0;
		for (int n : list) {
			sumOfNumbersList = sumOfNumbersList + n;
		}

		int onlyDuplicateNumberInList = sumOfNumbersList - ((highestNumberInList) * (highestNumberInList + 1) / 2);
		return onlyDuplicateNumberInList;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int highestNumberInList = 10; // you may change it in future.
		for (int i = 1; i <= highestNumberInList; i++) {
			list.add(i);
		}
		list.add(20); // add duplicate number in list(please ensure you don't add more than one
						// duplicate number in list)
		System.out.println("list is: " + list);
		System.out.println(
				"Only duplicate number in list is: " + findOnlyDuplicateNumberInList(list, highestNumberInList));
	}

}

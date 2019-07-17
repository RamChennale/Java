package programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DulpicateInListUsingSet {

	public static Set<Integer> findDuplicates(List<Integer> listContainingDuplicates) {
		final Set<Integer> setToReturn = new HashSet<Integer>();
		final Set<Integer> set1 = new HashSet<Integer>();

		for (Integer yourInt : listContainingDuplicates) {
			if (!set1.add(yourInt)) {
				setToReturn.add(yourInt);
			}
		}
		return setToReturn;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			list.add(i);
		}
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(10);
		list.add(1);
		System.out.println("Complete List" + list);
		System.out.println();
		System.out.println("Duplicates in list : " + findDuplicates(list));
	}

}

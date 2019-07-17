package programs;

import java.util.ArrayList;
import java.util.List;

public class DulicateListByList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			list.add(i);
		}
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		findDuplicateNum(list);
	}

	public static List<Integer> findDuplicateNum(List<Integer> duplicateList) {
		List<Integer> listWithoutDuplicate = new ArrayList<Integer>();
		System.out.println("List with Duplicate num : " + duplicateList);
		System.out.println("Duplicate numbers in list are  :");
		for (int i : duplicateList) {
			if (listWithoutDuplicate.contains(i)) {
				System.out.print(i + " ");
			} else {
				listWithoutDuplicate.add(i);
			}
		}
		return listWithoutDuplicate;
	}

}

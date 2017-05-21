package utils;

import java.util.Collections;
import java.util.List;

public class ListUtil {
	public static void swap(int index1, int index2, List<Integer> list) {
		int buffer = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, buffer);
	}

	public static void display(List<Integer> list) {
		for (int number : list) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

	public static void setRandomNumbers(List<Integer> list, int length) {
		for (int i = 0; i < length;i++) {
			list.add(i);
		}
		Collections.shuffle(list);
	}

}

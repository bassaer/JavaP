import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q18 {

	public static void main(String[] args) {
		final int LENGTH = 10;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < LENGTH;i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		//入れ替え前状態出力
		display(list);
		
		for (int i = 0; i < LENGTH; i++) {
			int min = LENGTH -1;
			int minIndex = LENGTH - 1;
			for (int j = i; j < LENGTH; j++) {
				int number = list.get(j);
				//最小値探索
				if (min > number) {
					min = number;
					minIndex = j;
				}
			}
			//先頭入れ替え
			swap(i, minIndex, list);
			display(list);
		}
		display(list);
	}
	
	private static void swap(int index1, int index2, List<Integer> list) {
		int buffer = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, buffer);
	}
	
	private static void display(List<Integer> list) {
		for (int number : list) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

}

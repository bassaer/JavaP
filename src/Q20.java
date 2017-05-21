import java.util.ArrayList;
import java.util.List;

import utils.BubbleSort;
import utils.ListUtil;
import utils.SelectionSort;

public class Q20 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		ListUtil.setRandomNumbers(list, 50000);

		List<Integer> deepCopyList = new ArrayList<>(list);

		SelectionSort selectionSort = new SelectionSort(list);
		BubbleSort bubbleSort = new BubbleSort(deepCopyList);

		Thread selectionSortThread = new Thread() {
			@Override
			public void run() {
				long start = System.currentTimeMillis();
				selectionSort.sort();
				long end = System.currentTimeMillis();
				System.out.println("選択ソート完了："+(end - start)/1000+"秒");

			}
		};

		Thread bubbleSortThread = new Thread() {
			@Override
			public void run() {
				long start = System.currentTimeMillis();
				bubbleSort.sort();
				long end = System.currentTimeMillis();
				System.out.println("バブルソート完了："+(end - start)/1000+"秒");
			}
		};
		selectionSortThread.start();
		bubbleSortThread.start();

		System.out.println("実行中...");
	}

}

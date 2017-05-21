import java.util.ArrayList;
import java.util.List;

import utils.ListUtil;
import utils.SelectionSort;

public class Q18 {

	public static void main(String[] args) {
		final int LENGTH = 10;
		List<Integer> list = new ArrayList<>();
		//ランダム値のリストを設定
		ListUtil.setRandomNumbers(list, LENGTH);
		//入れ替え前状態出力
		ListUtil.display(list);

		SelectionSort selectionSort = new SelectionSort(list);
		selectionSort.setShowLog(true);
		selectionSort.sort();;

		ListUtil.display(list);
	}



}

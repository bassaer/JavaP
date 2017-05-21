import java.util.ArrayList;
import java.util.List;

import utils.BubbleSort;
import utils.ListUtil;

public class Q19 {

	public static void main(String[] args) {
		final int LENGTH = 10;
		List<Integer> list = new ArrayList<Integer>();
		ListUtil.setRandomNumbers(list, LENGTH);
		ListUtil.display(list);
		
		BubbleSort bubbleSort = new BubbleSort(list);
		bubbleSort.setShowLog(true);
		bubbleSort.sort();
		ListUtil.display(list);
	}

}

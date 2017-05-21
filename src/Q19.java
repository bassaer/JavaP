import java.util.ArrayList;
import java.util.List;

import utils.ListUtil;

public class Q19 {

	public static void main(String[] args) {
		final int LENGTH = 10;
		List<Integer> list = new ArrayList<Integer>();
		ListUtil.setRandomNumbers(list, LENGTH);
		ListUtil.display(list);
		
		for (int i = 0; i < LENGTH; i++) {
			for (int j = LENGTH - 1; j > i; j --) {
				int prevNumber = list.get(j);
				int nextNumber = list.get(j - 1);
				if ( prevNumber < nextNumber) {
					ListUtil.swap(j, j - 1, list);
					
				}
				ListUtil.display(list);
			}
		}
		ListUtil.display(list);
	}

}

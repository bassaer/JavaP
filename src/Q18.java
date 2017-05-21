import java.util.ArrayList;
import java.util.List;

import utils.ListUtil;

public class Q18 {

	public static void main(String[] args) {
		final int LENGTH = 10;
		List<Integer> list = new ArrayList<>();
		//ランダム値のリストを設定
		ListUtil.setRandomNumbers(list, LENGTH);
		//入れ替え前状態出力
		ListUtil.display(list);

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
			ListUtil.swap(i, minIndex, list);
			ListUtil.display(list);
		}
		ListUtil.display(list);
	}



}

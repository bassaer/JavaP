package utils;
import java.util.List;

public class SelectionSort {
	private List<Integer> list;
	private int size;
	private boolean showLog = false;

	public SelectionSort(List<Integer> list) {
		this.list = list;
		this.size = list.size();
	}

	public void sort() {
		for (int i = 0; i < this.size; i++) {
			int min = this.size -1;
			int minIndex = this.size - 1;
			for (int j = i; j < this.size; j++) {
				int number = list.get(j);
				//最小値探索
				if (min > number) {
					min = number;
					minIndex = j;
				}
			}
			//先頭入れ替え
			ListUtil.swap(i, minIndex, list);
			if (showLog) {
				ListUtil.display(list);
			}
		}
	}

	public void setShowLog(boolean showLog) {
		this.showLog = showLog;
	}


}

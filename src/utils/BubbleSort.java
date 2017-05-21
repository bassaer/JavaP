package utils;
import java.util.List;

public class BubbleSort {
	private List<Integer> list;
	private int size;
	private boolean showLog = false;

	public BubbleSort(List<Integer> list) {
		this.list = list;
		this.size = list.size();
	}

	public void sort() {
		for (int i = 0; i < this.size; i++) {
			for (int j = this.size - 1; j > i; j --) {
				int prevNumber = list.get(j);
				int nextNumber = list.get(j - 1);
				if ( prevNumber < nextNumber) {
					ListUtil.swap(j, j - 1, list);

				}
				if (showLog) {
					ListUtil.display(list);
				}
			}
		}
	}

	public void setShowLog(boolean showLog) {
		this.showLog = showLog;
	}
}

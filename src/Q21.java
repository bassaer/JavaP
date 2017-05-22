import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Q21 {
	private static List<LinkedList<Integer>> towers;
	private static int counter;

	public static void initialize(int height) {
		towers = new LinkedList<>();
		//3本の杭
		for (int i = 0; i < 3; i++) {
			towers.add(new LinkedList<>());
		}
		//0番目の杭にheight枚の円盤を追加
		for (int i = height; i >= 1; i--) {
			towers.get(0).add(i);
		}
		counter = 0;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("入力＞");
		int input = scanner.nextInt();
		initialize(input);
		display();
		hanoi(input, 0, 2, 1);
	}

	public static void move(int from , int to) {
		int disk = towers.get(from).removeLast();
		towers.get(to).add(disk);
		counter++;
	}

	public static void hanoi(int height, int from, int to, int work) {
		if (height == 0) {
			return;
		}
		hanoi(height - 1, from, work, to);
		move(from, to);
		display();
		hanoi(height - 1, work, to, from);

	}

	public static void display() {
		System.out.print(counter + "回目：");
		for (int i = 0; i < 3; i++) {
			System.out.print("[");
			for (int disk : towers.get(i)) {
				System.out.print(disk + " ");
			}
			System.out.print("] ");
		}
		System.out.println();
	}

}

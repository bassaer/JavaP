import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		final String star = " * ";
		Scanner scanner = new Scanner(System.in);
		System.out.print("一辺の長さを入力してください：");

		int length = scanner.nextInt();

		String[][] output = new String[length][length];
		for (int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				output[i][j] = "   ";
			}
		}
		//現在のX座標
		int currentX = 0;
		//現在のY座標
		int currentY = length - 1;
		//1個先のX座標
		int nextX = currentX;
		//1個先のY座標
		int nextY = currentY;
		//2個先のX座標
		int afterNextX = 0;
		//2個先のY座標
		int afterNextY = 0;

		//どれだけ進んだか
		int moveCounter = 0;
		//どの方向を向いているか
		int directionStatus = 0;
		//方向の定義
		final int[][] direction = {
				{0, -1},
				{1, 0},
				{0, 1},
				{-1, 0}
		};

		boolean isRunnig = true;

		while(isRunnig) {
			//0-3の方向
			directionStatus %= 4;
			//次の座標
			nextX = currentX + direction[directionStatus][0];
			nextY = currentY + direction[directionStatus][1];
			//２個先の座標
			afterNextX = currentX + 2 * direction[directionStatus][0];
			afterNextY = currentY + 2 * direction[directionStatus][1];

			if (afterNextX < 0 || afterNextX >= length || afterNextY < 0 || afterNextY >= length) {
				//2個先が端だったら
				output[currentY][currentX] = star;
				//1個先に星を追加
				output[nextX][nextY] = star;
				//方向転換
				directionStatus++;
				moveCounter = 0;
				currentX = nextX;
				currentY = nextY;
			} else if (output[afterNextY][afterNextX].equals(star)) {
				//２個先が埋まっている
				output[currentY][currentX] = star;
				if (moveCounter >= 2) {
					//かつ方向転換後に２回以上進んでいる場合
					//方向転換
					directionStatus++;
					moveCounter = 0;
				} else {
					//終了
					break;
				}
			} else {
				//現在の座標に星を追加し座標を更新
				output[currentY][currentX] = star;
				currentX = nextX;
				currentY = nextY;
				moveCounter++;
			}
		}
		
		//結果の出力
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++){
				System.out.print(output[i][j]);
			}
			System.out.println();
		}
	}

}

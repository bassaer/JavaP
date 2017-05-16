import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("数値を入力してください。");
        int input = 0;
        try {
        	input = scanner.nextInt();
        } catch (InputMismatchException e) {
        	System.out.println("数値を入力してください。");
        }
        scanner.close();
		int spaceCount = 0;
		int starCount = 0;
		
		for (int i=0;i < input*2-1;i++ ) {
			if (i < input) {
				//上半分
				spaceCount = input - i - 1;
				starCount = 2 * i + 1;
			} else {
				//下半分
				//スペースの数をインクリメント
				spaceCount = i - input + 1;
				//最大値からデクリメント
				starCount = input * 2 + 2 *(input - i - 1 ) - 1;
			}
			for (int j=0; j < spaceCount; j++) {
				System.out.print("   ");
			}
			for (int k = 0; k < starCount; k++){
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}

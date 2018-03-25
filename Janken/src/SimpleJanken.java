/**
 * オブジェクト指向を使用しないジャンケンプログラム
 */
public class SimpleJanken {

    // ジャンケンの手を表す定数
    public static final int STONE = 0;  // グー
    public static final int SCISSORS = 1;  // チョキ
    public static final int PAPER = 2;  // パー


    public static void main(String[] args) {

	// プレイヤー１の勝ち数
	int player1WinCount = 0;

	// プレイヤー２の勝ち数
	int player2WinCount = 0;

	// プレイヤー１が出す手
	int player1Hand = 0;

	// プレイヤー２が出す手
	int player2Hand = 0;

	// ジャンケンの手を決めるのに使用する乱数
	double randomNum = 0;

	// プログラム開始メッセージを表示する
	System.out.println("【ジャンケン開始】\n");

	// ジャンケンを３回実施する
	// 勝負した回数を加算する
	// ３回勝負が終わったか
	for (int cnt = 0; cnt < 3; cnt++) {
	    // 何回目かを表示する
	    System.out.println("【" + (cnt + 1) + "】回戦目" );

	    // プレイヤー１が何を出すかを決める
	    // 0.0以上3.0未満の少数として乱数を得る
	    randomNum = Math.random() * 3;

	    if (randomNum < 1) {
		player1Hand = STONE;
		System.out.print("グー");
	    } else if (randomNum < 2) {
		player1Hand = SCISSORS;
		System.out.print("チョキ");
	    } else if (randomNum < 3) {
		player1Hand = PAPER;
		System.out.print("パー");
	    }

	    System.out.println(" vs. ");

	}
    }

}

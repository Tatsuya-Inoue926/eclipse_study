import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ExtendPractice1 {
	public int nums;

	public static void main(String[] args) throws IOException{
		Baseball base = new Baseball();
		base.setNum(5, 21);
		base.start();
		base.th();
		Point pt = new Point(1);
		pt.setPoint();
	}

}

class Baseball{

	private int num = 0;
	public static int strike = 0;
	public static int balls = 0;
	public static int out = 0;
	public static int run = 0;
	String [] ballName = {"strike","faul","ball"};

	public void start(){
		balls = 0;
		strike = 0;
		out = 0;
		System.out.println("ボールネーム一覧");
		for( int i = 0; i < ballName.length; i++ ) {
			System.out.println(ballName[i]);
		}
	}

	public void setNum(int a, int b) {

		num = a;
		System.out.println("背番号"+num+"をセットしました");
	}

	public void th() throws IOException{

		System.out.println("ストレートかカーブを入力してください");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();

		if (str1.equals("ストレート")){
			System.out.println("ストライク");
			strike += 1;
			if (strike == 3) {
				System.out.println("アウト！");
				out += 1;
			}
		}else if(str1.equals("カーブ")) {
			System.out.println("ボール");
			balls += 1;
			if ( balls == 4) {
				System.out.println("フォアボール");
				run += 1;
			}
		/*}else if( str1 != "ストレート" || str1 != "カーブ") {
			System.out.println("無効な文字です");
		}*/


	}
}
}

class Point extends Baseball{

	public Point(int a){
		if (a == 1) {
		System.out.println("集計を開始します");
		}else {
		System.out.println("集計出来ませんでした");
		}
	}

	public void setPoint() {
		//int pointStrike = strike;
		//int pointBalls = balls;
		//int pointOut = out;
		//int pointRun = run;
		//継承したことでスーパークラスBaseballの変数が使える
		System.out.println("ストライク:"+ strike);
		System.out.println("ボール:"+ balls);
		System.out.println("アウト:"+ out);
		System.out.println("ランナー数:"+ run);

	}

}
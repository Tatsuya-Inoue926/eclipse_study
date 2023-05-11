
class TryCatchPractice1 {

	public static void main(String[] args) {

			int n[] = { 22, 29, 34 };

			System.out.println("処理開始");

			try {
				//配列の中身は3つしかないが4つ入れている
				for(int i = 0; i < 4; i++) {
					System.out.println(n[i]);
				}
			}
			//配列範囲を超えたときの処理を記載
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("配列の範囲を超えています");
			}
			System.out.println("処理終了");
		}

	}


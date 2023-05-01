
class ObClass {

	public static void main(String[] args) {
		//オブジェクトの数を宣言。6個のオブジェクトが配列に入れられる
		Car [] cars = new Car[5];
		
		//for文を使ってオブジェクトを生成し、都度コンストラクタを呼び出す
		for(int i = 0; i < cars.length; i++) {
			cars[i] = new Car();
		}
		
		//各オブジェクトのナンバーと走行距離を設定
		cars[0].setNum(30, 235);
		cars[1].setNum(70, 135);
		cars[2].setNum(20, 325);
		cars[3].setNum(12, 675);
		cars[4].setNum(26, 935);
		
		//for文を使い、全オブジェクト文のshowメソッドを呼び出す。
		for( int i = 0; i < cars.length; i++) {
			cars[i].show();
		}

	}

}

class Car{
	private int num = 0;
	private int number = 0;
	private static int many = 0;
	
	//Javaのコンストラクタは、戻り値を持たず、クラス名と同じ名前である必要があります。
	//コンストラクタにはvoidを付けてはいけない。
	//メソッド名がクラス名と異なるため、コンストラクタとして認識されません。
	public /*void*/ Car() {
		int num = 0;
		int number = 0;
		many = many + 1;
		System.out.println("車が生成されました" + "：現在の車の数は" + many +"です");
	}
	
	public void setNum(int a, int b) {
		num = a;
		number = b;
	}
	
	public void show() {
		System.out.println("車のナンバーは"+ num +":走行距離は"+ number +"です");
	}
}
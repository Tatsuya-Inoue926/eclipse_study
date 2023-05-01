
class OverSample {

	public static void main(String[] args) {
		int [] list = {10,11,12,13,14};
		Over ov = new Over(list);
		ov.num(2);
		ov.num(2,3);
		ov.num(2,3,4);
		ov.lists();


	}

}

class Over{
	int [] list;
	int listnum = 10;
	Over(int[] list){
		//mainで宣言したlistをOver内の変数listに格納する
		this.list = list;
	}

	public void num(int a) {
		int num = a;
		System.out.println("オーバーロード引数1:"+ num + "です。");
	}
	public void num(int a, int b) {
		int num1 = a;
		int num2 = b;
		System.out.println("オーバーロード引数2:"+ num1 +":"+ num2);
	}
	void num(int a, int b, int c) {
		System.out.println("引数が３つあります");
	}
	void lists() {
		for (int i = 0; i < list.length; i++) {
			System.out.println("list[" + i + "] = " + list[i]);
			if(list[i] == listnum) {
				//listのi番目の値が12ならreturnでfor文を終了する。
				System.out.println(listnum + "が出力されました。");
				finish();
				return;
			}
		}finish();
	}
	void finish() {
		System.out.println(listnum + "が出たのでシステム終了");
	}
}

class LibSample2 {

	public static void main(String[] args) {
		//縦に出力する文字を変数strに格納
		String str = "こんにちはお元気ですか";
		//char変数作成
		char ch;

		for(int i = 0; i < str.length(); i++) {
			//一文字ずつ抽出
			ch = str.charAt(i);
			//1文字出力されるごとに改行する
			System.out.println(ch);
		}

	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class LibSample3 {

	public static void main(String[] args)throws IOException {
		System.out.println("文字を入力してください");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		
		System.out.println("検索文字を入力してください");
		
		String str2 = br.readLine();
		//入力された文字をchar変数の1番目に
		char ch = str2.charAt(0);
		System.out.println(ch);
		//indexOfの引数はchar型にする
		System.out.println(str1.indexOf("i"));
		//indexOf=任意の1文字の場所(数字)を出力する。
		//任意の1文字がない場合、-1を返す
		int num = str1.indexOf(ch);
		
		if( num != -1) {
			System.out.println(str1 + "の" + (num + 1)+ "番目に「" + ch + "」がみつかりました");
		}else {
			System.out.println(str1 + "に「" + ch + "」はありません");
		}
	}

}

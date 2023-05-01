import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class LibSample4 {

	public static void main(String[] args)throws IOException {
		System.out.println("文字を入力してください");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();

		System.out.println("追加する文字を入力してください");

		String str2 = br.readLine();

		//文字列を合体させる準備
		StringBuffer sb = new StringBuffer(str1);
		//↓strの文字のみ出力される
		System.out.println(sb);
		//文字列str1の後ろにstr2がくっつく
		sb.append(str2);

		System.out.println(str1 + "に" + str2 +"を追加すると" + sb +"です");
	}

}

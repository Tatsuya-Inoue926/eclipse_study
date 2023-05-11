class TryCatchPractice3 {

	public static void main(String[] args) {
		Members m = new Members("たかだ");
		try {
			m.setAge(-26);
				//setAgeから例外処理を受け取ったら起動する
			//IllegalArgumentExceptionは無効な値や負の値に関する例外処理記述
		} catch (IllegalArgumentException e) {
			System.out.println("年齢に負の数が入っています");
		}
	}
}


class Members{
	int age;
	String name;
	//コンストラクタにvoidはつけられない
	Members(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		if (age < 0) {
			//例外処理を投げる
			throw new IllegalArgumentException("年齢は正の数を指定してください。指定値=" + age);
		}
		this.age = age;
		System.out.println(name + "は" + this.age+ "歳です");
	}
}
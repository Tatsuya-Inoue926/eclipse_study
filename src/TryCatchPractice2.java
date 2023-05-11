
class TryCatchPractice2 {

	public static void main(String[] args) {
		Member m = new Member();
	    m.setAge(-26);
	}

}

class Member {
	  int age;
	  void setAge(int age) {
	    if (age < 0) {
	    	//throwで意図的に例外を出し、例外処理を実行させる。
	    	//mainメソッドにTryCatch処理がないため、PGは強制終了される
	    	throw new IllegalArgumentException("年齢は正の数を指定してください。指定値=" + age);
	    }
	    this.age = age;
	  }
	}
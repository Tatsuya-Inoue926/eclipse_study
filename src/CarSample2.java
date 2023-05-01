

class CarSample2 {

	public static void main(String[] args) {
		Cars car1 = new Cars();

		car1.setNum(334);
		car1.setStr("終了");

	}

}

class Cars{
	int num;
	double dis;
	String str;

	void setNum(int a) {
		num = a;
		System.out.println("カーナンバーは"+ num + "です");
		System.out.println("システム");
	}

	void setStr(String b) {
		str = b;
		System.out.println(str);
	}
}
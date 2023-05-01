
class Car {

	public static void main(String[] args) {
		Shows car1 = new Shows();
		Shows car2 = new Shows();
		
		car1.color = "red";
		car1.num = 2019;
		car1.dis = 29.189;
		car2.color = "blue";
		car2.num = 2011;
		car2.dis = 34.55;
		
		car1.showcar();
		car2.show();
		

	}

}

class Shows{
	
	//呼び出されるclassで変数を定義してmainクラスでは定義しない
	int num;
	double dis;
	String color;
	
	
	void show() { //考え方_car1の場合
		System.out.println(/*(car1.)*/color + "車のナンバーは" + /*(car1.)*/num + "走行距離は" + /*(car1.)*/dis );
	}
	
	void showcar() {
		System.out.println("showメソッドをshowcarメソッドが呼び出します");
		show();
	}
}

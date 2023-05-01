
class ClassSample2 {

	public static void main(String[] args) {
		Max max = new Max();
		Min min = new Min();
		Add add = new Add();
		int maxs = max.num(100, 200);
		int mins = min.num(300, 150);
		int sum = add.num(mins, maxs);
		System.out.println("最大値："+maxs);
		max.num(1);
		System.out.println("最小値："+mins);
		System.out.println("最大値と最小値を合わせた数：" + sum);
	}

}

class Max{

	public int num(int a, int b) {
		if ( a > b) {
			return a;
		}
		return b;
	}
	public void num(int a) {
		System.out.println("引数が一つしかありません");
	}
}

class Min{

	public int num(int c, int d) {
		if( c > d) {
			return d;
		}
		return c;
	}
}

class Add{

	public int num(int mins, int maxs ) {
		return mins + maxs;
	}
}

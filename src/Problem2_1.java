
class Problem2_1 {

	public static void main(String[] args) {

	        Fighter f = new Fighter();      //  戦闘機クラス
	        Airplane a = new Airplane();    //  飛行機クラス
	        //  飛行機が飛行する
	        a.fly();
	        //  戦闘機が飛行する
	        f.fly();
	        //  戦闘機が戦闘する
	        f.fight();

	}

}

class Airplane {
    public void fly(){
        System.out.println("飛行する");
    }
}

class Fighter extends Airplane{
	public void fight() {
		System.out.println("戦闘する");
	}
}

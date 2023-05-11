
class Problem3_1 {

	public static void main(String[] args) {
		 //  戦闘機クラスのインスタンスの生成
        FighterAiracraft fighter = new FighterAiracraft();
        PassengerPlane airlinear = new PassengerPlane();
        //  戦闘機クラスの処理
        fighter.fly();                  //  飛行する
        fighter.fight();                //  戦闘する
        //  旅客機クラスの処理
        airlinear.fly();                //  飛行する
        airlinear.carryPassengers();    //  乗客を運ぶ

	}

}

abstract class AirPlane{
	
	
	abstract void fly() ;
}

//戦闘機クラス
class FighterAiracraft{
//  飛行機のタイプ
private String type = "戦闘機";
//  タイプの取得
public String getType(){
    return type;
}
//  飛行する
public void fly(){
    System.out.println("攻撃に出るために飛行します。");
}
//  戦闘する
public void fight(){
    System.out.println("戦闘します。");
}
}

//戦闘機クラス
class PassengerPlane{
//  飛行機のタイプ
private String type = "旅客機";
//  タイプの取得
public String getType(){
    return type;
}
//  飛行する
public void fly(){
    System.out.println("乗客を乗せて目的地まで飛行します。");
}
//  戦闘する
public void carryPassengers(){
    System.out.println("乗客を目的地まで運びます。");
}
}
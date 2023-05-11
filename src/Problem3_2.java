
class Problem3_2 {

	public static void main(String[] args) {
		
		Computer[] cp = new Computer[3];
        cp[0] = new PersonalComputer();     //  パーソナルコンピュータ
        cp[1] = new TabletPC();             //  タブレットPC
        cp[2] = new SmartPhone();           //
        for(Computer c:cp){
            c.showType();
            c.input();
            c.output();
            c.communication();
            System.out.println("--------------------------------------");
        }

	}

}

class PersonalComputer extends Computer{
    //  コンストラクタ
    public PersonalComputer(){
        super("パーソナルコンピュータ");
    }
    //  入力処理
    public void input(){
        System.out.println("キーボード・マウスで入力");
    }
    //  出力処理
    public void output(){
        System.out.println("ディスプレイに出力");
    }
}

class SmartPhone extends Computer{
    //  コンストラクタ
    public SmartPhone(){
        super("スマートフォン");
    }
    //  入力処理
    public void input(){
        System.out.println("タッチパネルディスプレイをタップして操作");
    }
    //  出力処理
    public void output(){
        System.out.println("タッチパネルディスプレイに出力");
    }
    public void communication() {
    	System.out.println("インターネットと電話回線で通信");
    }
}

class TabletPC extends Computer{
    //  コンストラクタ
    public TabletPC(){
        super("タブレットPC");
    }
    //  入力処理
    public void input(){
        System.out.println("タッチパネルディスプレイをタップして操作");
    }
    //  出力処理
    public void output(){
        System.out.println("タッチパネルディスプレイに出力");
    }
}

//コンピュータの抽象クラス
abstract class Computer {
//  コンピュータのタイプ
private String type;
//  コンストラクタ
public Computer(String type){
    this.type = type;
}
//  入力処理
public abstract void input();
//  出力処理
public abstract void output();
//  通信処理
public void communication(){
    System.out.println("インターネットで通信");
}
//  タイプの出力
public void showType(){
    System.out.println("コンピュータの種類:" + type);
}
}





class Problem4 {

	public static void main(String[] args) {

		// TODO 自動生成されたメソッド・スタブ
        CellPhone cp = new CellPhone();
        funcPhone(cp);
        funcMailer(cp);
        funcComputer(cp);
    }
    //  電話としての処理
    public static void funcPhone(IPhone phone){
        phone.callPhone();      //  電話を掛ける
        phone.recievePhone();   //  電話を受ける
    }
    //  メーラーとしての処理
    public static void funcMailer(IMailer mailer){
        mailer.sendMail();      //  メールを送信する
        mailer.recieveMail();   //  メールを受信する
    }
    //  コンピュータとしての処理
    public static void funcComputer(IComputer computer){
        computer.playGame();    //  ゲームをする
        computer.borwseWeb();   //  ウェブを閲覧する

	}

}

//各種インターフェイスの設定
interface IPhone{
	public void callPhone();
	public void recievePhone();
}

interface IMailer{
	public void sendMail();
	public void recieveMail();
}

interface IComputer{
	public void playGame();
	public void borwseWeb();
}

class CellPhone implements IPhone,IMailer,IComputer{
    //  メールを送信する
    public void sendMail(){
        System.out.println("メールを送る");
    }
    //  メールを受信する
    public void recieveMail(){
        System.out.println("メールを受信する");
    }
    //  webを閲覧する
    public void borwseWeb(){
        System.out.println("ウェブを閲覧する");
    }
    //  ゲームをする
    public void playGame(){
        System.out.println("ゲームをする");
    }
    //  電話をかける
    public void callPhone(){
        System.out.println("電話を掛ける");
    }
    //  電話を受ける
    public void recievePhone(){
        System.out.println("電話を受ける");
    }

}

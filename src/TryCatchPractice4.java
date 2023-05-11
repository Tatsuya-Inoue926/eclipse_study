
class TryCatchPractice4 {

	public static void main(String[] args) {
		Members1 m = new Members1("たかだ");
        try {
            m.setAge(-26);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
	}

}

class Members1 {
    private int age;
    private String name;

    public Members1(String name) {
        this.name = name;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("年齢は正の数を指定してください。指定値=" + age);
        }
        this.age = age;
        System.out.println(name + "は" + this.age + "歳です");
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

/*上記のコードは、TryCatchPractice4 クラスと Members1 クラス、そして InvalidAgeException クラスから構成されています。

TryCatchPractice4 クラスでは、Members1 クラスのインスタンスを作成し、その後 setAge メソッドを呼び出しています。setAge メソッドでは、指定された年齢が負の数である場合に独自の例外クラスである InvalidAgeException をスローし、それをキャッチして例外のメッセージを表示しています。

Members1 クラスは、プライベートなインスタンス変数 age と name を持ち、パラメータを受け取るコンストラクタを定義しています。また、setAge メソッドは年齢を設定するためのメソッドであり、指定された年齢が負の数である場合に InvalidAgeException をスローします。

InvalidAgeException クラスは、例外クラスであり、特定のメッセージを受け取ってスーパークラスのコンストラクタに渡します。

このコードは、例外処理を使用して年齢の制約を確認し、適切なメッセージを表示する例を示しています。例外を利用することで、プログラムの流れを制御し、問題が発生した場合に適切に対処できます。
*/

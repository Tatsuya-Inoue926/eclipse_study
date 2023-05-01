
public class Main {

		  public static void main(String[] args) {
		      Sample1 userA = new Sample1("ポテパン", 20);
		      Sample1 userB = new Sample1("テスト", 26);
		 
		      System.out.println("userAの出力結果です。");
		      userA.execute();
		      System.out.println("userBの出力結果です。");
		      userB.execute();
		  }
		 
		}
		 
		class Sample1 {
		  public String name;
		  public int    age;
		 
		  public Sample1(String str, int age) {
		    this.name  = str;
		    this.age   = age;
		  }
		 
		  public void execute() {
		    System.out.println("ユーザーの名前は " + this.name + "です。");
		    System.out.println("ユーザーの年齢は " + this.age + "です。");
		  }

	}


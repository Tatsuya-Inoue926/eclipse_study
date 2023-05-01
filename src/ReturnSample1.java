
class ReturnSample1 {

	public static void main(String[] args) {
		int a = 5;
        int b = 3;
        int result = add(a, b);
        if (result > 0) {
            System.out.println(result + " is positive.");
        } else if (result < 0) {
            System.out.println(result + " is negative.");
        } else {
            System.out.println(result + " is zero.");
        }
        int result2 = abs(3);
        System.out.println(result2);
        
    }
    
    public static int add(int a, int b) {
        return a + b;
        //returnで返した値は変数resultに格納される。
        //メソッドの処理を中断する場合にもreturn文が使われます。メソッド内である条件が満たされた場合、処理を中断し、メソッドを終了させることができます。
    }
    
    public static int abs(int n) {
        if (n < 0) {
            return 0;
        }
        //引数の値が0以外ならその数字を返してメソッドを中断する
        return n;
    }

}

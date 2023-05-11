
class Problem2_2 {
	public static void main(String[] args) {
        NewCalc n = new NewCalc();
        n.setNumber1(10);   //  一つ目の数を設定
        n.setNumber2(2);    //  二つ目の数を設定
        System.out.println((int)n.getNumber1() + " + " + (int)n.getNumber2() + " = " + (int)n.add());
        System.out.println((int)n.getNumber1() + " - " + (int)n.getNumber2() + " = " + (int)n.sub());
        System.out.println((int)n.getNumber1() + " * " + (int)n.getNumber2() + " = " + (int)n.mul());
        System.out.println((int)n.getNumber1() + " / " + (int)n.getNumber2() + " = " + (int)n.div());
   }

}

class NewCalc extends FundCalc{
	double mul = 0.0;
	double div = 0.0;
}

class FundCalc {
    private double number1 = 0.0;   //  一つ目の数
    private double number2 = 0.0;   //  二つ目の数
    //  一つ目の数を設定
    public void setNumber1(double number1){
        this.number1 = number1;
    }
    //  二つ目の数を設定
    public void setNumber2(double number2){
        this.number2 = number2;
    }
    //  一つ目の数を設定
    public double getNumber1(){
        return number1;
    }
    //  二つ目の数を設定
    public double getNumber2(){
        return number2;
    }
    //  二つの数の和を出力
    public double add(){
        return number1 + number2;
    }
    //  二つの数の差を出力
    public double sub(){
        return number1 - number2;
    }
    public double mul() {
    	return number1 * number2;
    }
    public double div() {
    	return number1 / number2;
    }
}

//java.util.regex.Patternは、正規表現パターンを表すためのクラスであり、パターンをコンパイルすることができます。
//java.util.regex.Matcherは、パターンとテキストの一致を確認するためのクラスであり、パターンに一致するテキストを検索することができます。
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PhoneSample {

	public static void main(String[] args) {
		String phoneNumber = "090-1234-5678";
		if (PhoneNumberValidator.isValid(phoneNumber)) {
		    System.out.println("Valid phone number");
		} else {
		    System.out.println("Invalid phone number");
		}
	}

}

class PhoneNumberValidator {
	// 電話番号の正規表現パターンを定義
    private static final Pattern PHONE_NUMBER_PATTERN =
    		//頭数字３つ、次数字４つ、次数字４つならOK
        Pattern.compile("\\d{3}-\\d{4}-\\d{4}");
    
    //isValidメソッドの作成
    public static boolean isValid(String phoneNumber) {
        if (phoneNumber == null) {
            return false;
        }
     //matcherオブジェクトの作成
     // phoneNumberが正規表現パターンに一致するかどうかを確認
        Matcher matcher = PHONE_NUMBER_PATTERN.matcher(phoneNumber);
        //matches()はregex.Matcherをインポートしたことで使える
        return matcher.matches();
    }
}
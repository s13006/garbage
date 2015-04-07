import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

class Checker {
	private String input;
	private static final int CORRECT_DIGIT = 4;
	private static final String CORRECT_PATTERN = "^\\d{" + CORRECT_DIGIT+ "}$";
	Checker(String input){
		this.input = input;
	}
	// 数値かつ有効桁数か
	boolean isValidPattern(){
		return input.matches(CORRECT_PATTERN);
	}
	// 重複があるか
	boolean isDuplicate(){
		Set<String> set = new HashSet<String>();
		for (int i=0;i<input.length();i++)
			if(!set.add(input.substring(i,i+1)))
			// 重複があった場合
				return true;
		return false;		
	}
	boolean checkAll(){
		return (isValidPattern()  && !isDuplicate());
	}
	public String toString(){
		return input;
	}
}

class hoge {
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		list.add("a123"); //NG 数値以外 
		list.add("123");  //NG 有効桁数に達していない
		list.add("12345");//NG 有効桁数に超えている 
		list.add("1233"); //NG 重複している 
		list.add("1234"); //OK 
		
	
 		for (String input:list){	
			Checker checker = new Checker(input);		
			if(checker.checkAll()){
				System.out.println(checker + ":OK");
			} else {
				System.out.println(checker + ":NG");
			}
		}
	}
}


